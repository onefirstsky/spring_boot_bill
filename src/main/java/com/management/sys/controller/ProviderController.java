package com.management.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProviderController {
    @GetMapping("/provider")
    public String list(){
        return "provider/list";
    }
}
