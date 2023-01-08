package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {

    private final List<Car> cars = new ArrayList<>();

    @PostConstruct
    void loadData() {
        cars.add(new Car("BMW", 250, false));
        cars.add(new Car("Volvo", 220, true));
        cars.add(new Car("Kia", 123, false));
        cars.add(new Car("Mitsubishi", 200, true));
        cars.add(new Car("Lada", 105, false));
    }

    public List<Car> getCars() {
        return cars;
    }
}
