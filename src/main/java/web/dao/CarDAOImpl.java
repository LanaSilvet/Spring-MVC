package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    private static int count;
    private List<Car> listCars;

    {
        listCars = new ArrayList<>();

        listCars.add(new Car(++count, "Jaguar", 2019));
        listCars.add(new Car(++count, "Volvo", 2018));
        listCars.add(new Car(++count, "Mazda", 2016));
        listCars.add(new Car(++count, "Mercedes", 2015));
        listCars.add(new Car(++count, "Audi", 2014));

    }

    @Override
    public List<Car> getAllCars() {
        return listCars;
    }

    @Override
    public Car getCar(Integer id) {
        return listCars.get(id);
    }
}
