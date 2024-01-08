package com.jos3zy.projectdtojpa.controller;


import com.jos3zy.projectdtojpa.entity.Local;
import com.jos3zy.projectdtojpa.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/local")
public class LocalController {

    @Autowired
    LocalService localService;

    @GetMapping("/findAll")
    public List<Local> findAll(){
       return localService.findAll();
    }
}
