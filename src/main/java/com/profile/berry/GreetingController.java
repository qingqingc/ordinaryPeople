package com.profile.berry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World berry") String name, Model model) {
        model.addAttribute("name", name);
        System.out.println("right8899 the**********************");
        return "greeting2";
    }
    
    @GetMapping("/h")
    public String home(@RequestParam(name="name", required=false, defaultValue="World berry") String name, Model model) {
        model.addAttribute("name", name);
        System.out.println("homehome the**********************");
        return "home";
    }

}