package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class variable_on_template{
    @RequestMapping ("variable on template")
    public String homepage (Model model) {
        model.addAttribute("myvar", "say hello to the people.");
        return "hometemplate";
    }
            }