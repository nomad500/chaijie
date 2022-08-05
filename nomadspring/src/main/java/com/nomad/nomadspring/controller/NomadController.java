package com.nomad.nomadspring.controller;

import com.nomad.nomadspring.dao.NomadDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NomadController {
    @Autowired
    NomadDao nomadDao;

    @RequestMapping(value = "/nomad/createTab")
    public String createGroup() {
        nomadDao.c();
        return "haole";
    }
}
