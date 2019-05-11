package com.ecommerce.Ecommerce.controller;

import com.ecommerce.Ecommerce.model.Laptop;
import com.ecommerce.Ecommerce.service.LaptopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class LaptopController {
    private LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }


    // list laptops
    @RequestMapping("/laptops")
    public String ListtoLaptop(Model model) {
        List<Laptop> laptops = laptopService.findAll();
        model.addAttribute("laptops", laptops);
        return "laptops";
    }

    //get select one
    @RequestMapping(value = "/laptopProduct", method = RequestMethod.GET)
    public String selectOne(String id,Model model){
        Long id1=Long.parseLong(id);
        System.out.println("istek geldi");
        Laptop laptop=laptopService.findOne(id1);
        model.addAttribute("laptop",laptop);
        return "laptopProduct";
    }

}
