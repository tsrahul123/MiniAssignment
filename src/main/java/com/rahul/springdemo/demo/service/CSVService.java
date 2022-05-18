package com.rahul.springdemo.demo.service;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.rahul.springdemo.demo.repository.repository;
import com.rahul.springdemo.demo.model.tutorial;
import com.rahul.springdemo.demo.helper.csvhelper;

@Service
public class CSVService {
    @Autowired
    repository repository;
    public void save(MultipartFile file) {
        try {
            List<tutorial> tutorials = csvhelper.csvToTutorials(file.getInputStream());
            repository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }
    public List<tutorial> getAllTutorials() {
        return repository.findAll();
    }

}
