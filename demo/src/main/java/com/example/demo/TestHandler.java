package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller
public class TestHandler {

    @RequestMapping("index")
    @ResponseBody
    public String ToIndex(){
        return "index";
    }
}
