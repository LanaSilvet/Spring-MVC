package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> getAllCars();

    public Car getCar(Integer idx) throws Exception;
}
