package com.HaloTechnoServe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileRestController {


        @GetMapping("/data")
        public String showEmpProfile() {
                return "FROM PROFILE SERVICE";
        }
}
