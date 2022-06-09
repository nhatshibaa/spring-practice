package com.example.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(method = RequestMethod.GET, path = "/home")
    public String home(){
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/form")
    public String form(){
        return "form";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public String list(){
        return "list";
    }
}
