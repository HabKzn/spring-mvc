package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarsService {
  public  List<Car> getCars(List<Car> cars, int amount) {
        if (amount > cars.size() || amount <= 0) {
            return cars;
        } else return cars.subList(0, amount);
    }
}
