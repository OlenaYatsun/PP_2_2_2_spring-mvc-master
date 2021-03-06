package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsServiceImpl;

@Controller
//@RequestMapping("/cars")
public class CarsController {

    private final CarsServiceImpl CarsService;

    @Autowired
    public CarsController(CarsServiceImpl CarsService) {
        this.CarsService = CarsService;
    }

    @GetMapping("/cars")
    public String carsList(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars",CarsService.showCars(count));
        return "Car";
    }



}
