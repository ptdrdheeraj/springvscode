package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/test")
    @ResponseBody
    public String handle(){
        return "hyy,,i am using vscode application";
    }
    
}
