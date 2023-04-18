package com.doctor.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String Doctor1() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String Doctor10() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String Doctor13() {
        return "Jodie Whittaker";
    }
}