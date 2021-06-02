package com.HaloTechnoServe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HaloTechnoServe.consumer.ProfileRestConsumer;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {


        @Autowired
        private ProfileRestConsumer consumer;
        
        @GetMapping("/model")
        public String showEmpData() {
                return "FROM EMPLOYEE =" + consumer.getProfileData();
        }
        
}