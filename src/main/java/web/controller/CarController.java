package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImp;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private final CarService carService = new CarServiceImpl(new CarDaoImp());

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "-1", value = "count", required = false) int count, ModelMap model) {

        model.addAttribute("cars", carService.getCars(count));

        return "cars";
    }
}
