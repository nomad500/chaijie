package com.nomad.nomadspring.dao;

import com.nomad.nomadspring.mapper.NomadMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service
public class NomadDao {
    @Autowired
    NomadMapper nomadMapper;
    public  boolean c(){
        return nomadMapper.create();
    }
}
