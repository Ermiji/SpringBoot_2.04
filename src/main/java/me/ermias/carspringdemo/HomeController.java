package me.ermias.carspringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    CarService vehicle;

    @RequestMapping("/")
    public String showVehicle(Model model){
        model.addAttribute("vehicle", vehicle.getList());
        return "index";
    }

    @RequestMapping("/addcar")
    public String addCar(Model model){
        model.addAttribute("carobject", new Car());
        return "addcar";
    }

    @RequestMapping("/savecar")
    public String saveCar(@ModelAttribute("carobject") Car toSave){
        System.out.println(toSave);
        vehicle.add(toSave);
        return "redirect:/";
    }

}
