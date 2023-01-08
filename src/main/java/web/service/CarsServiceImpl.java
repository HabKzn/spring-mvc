package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;

import java.util.Collections;
import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {

    CarRepository carRepository;

    @Autowired
    public CarsServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars(int amount) {
        List<Car> cars = carRepository.getCars();
        if (cars == null) {
            return Collections.emptyList();
        } else if (amount > cars.size() || amount <= 0) {
            return cars;
        } else return cars.subList(0, amount);
    }
}
