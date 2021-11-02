package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAOImpl carDAOImpl;

    @Override
    public List<Car> getAllCars() {
        return carDAOImpl.getAllCars();
    }

    @Override
    public List<Car> getCars(Integer count) throws Exception {
        List<Car> carsByNumber = new ArrayList<>();
        if (count == null) {
            return getAllCars();
        } else {
            if (count > 0 && count < getAllCars().size()) {
                for (int x = 0; x < count; x++) {
                    carsByNumber.add(carDAOImpl.getCar(x));
                }
            } else if (count >= getAllCars().size()) {
                return getAllCars();
            } else {
                throw new Exception("Wrong request!");
            }
        }
        return carsByNumber;
    }
}
