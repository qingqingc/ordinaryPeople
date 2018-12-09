package com.profile.berry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/ta")
    public String index() {
    	System.out.println("test where this log is printed**************");
        return "Greetings from Spring GOOD THING Boot! berry you are successful!";
    }
}