package com.web.webApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")

    public String greeting(){
        return "Welcome to webApp.";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is about page.";
    }
}
