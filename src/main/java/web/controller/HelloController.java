package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private CarsService carsService;

    private List<Car> cars = new ArrayList<>();

    @PostConstruct
    void loadData() {
        cars.add(new Car("BMW", 250, false));
        cars.add(new Car("Volvo", 220, true));
        cars.add(new Car("Kia", 123, false));
        cars.add(new Car("Mitsubishi", 200, true));
        cars.add(new Car("Lada", 105, false));
    }

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        model.addAttribute("cars", carsService.getCars(cars, count));
        return "cars";
    }

}