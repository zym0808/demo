package com.zym.demo.service.impl;

import com.zym.demo.service.ClassesService;
import com.zym.demo.bean.Classes;
import com.zym.demo.repository.ClassesRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    private ClassesRepostory classesRepostory;
    @Override
    public List<Classes> findAll() {
        return classesRepostory.findAll();
    }

    @Override
    public Classes findById(Integer id) {
        return classesRepostory.findById(id);
    }
}
