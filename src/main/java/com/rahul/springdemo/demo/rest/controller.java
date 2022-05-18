package com.rahul.springdemo.demo.rest;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.multipart.MultipartFile;
import com.rahul.springdemo.demo.repository.repository;
import com.rahul.springdemo.demo.model.tutorial;
import com.rahul.springdemo.demo.helper.csvhelper;
import com.rahul.springdemo.demo.service.CSVService;
import com.rahul.springdemo.demo.message.ResponseMessage;
import com.rahul.springdemo.demo.DAO.tutorialdao;

@CrossOrigin("http://localhost:8081")
@Controller
@RequestMapping("/api/csv")
public class controller {


    @Autowired
    CSVService fileService;
    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
        String message = "";
        if (csvhelper.hasCSVFormat(file)) {
            try {
                fileService.save(file);
                message = "Uploaded the file successfully: " + file.getOriginalFilename();
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
            } catch (Exception e) {
                message = "Could not upload the file: " + file.getOriginalFilename() + "!";
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
            }
        }
        message = "Please upload a csv file!";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
    }
    @GetMapping("/tutorials")
    public ResponseEntity<List<tutorial>> getAllTutorials() {
        try {
            List<tutorial> tutorials = fileService.getAllTutorials();
            if (tutorials.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tutorials, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private tutorialdao tutorialdao1;
    @GetMapping("/Movies")
    public List<tutorial> findAll(){
        return tutorialdao1.findAll();
    }
    @GetMapping("/titileofdirectorbyrange/{director}/{year1}/{year2}")
    public List<tutorial> directorinthegivenyearrange(@PathVariable String director,@PathVariable int year1,@PathVariable int year2){
        return tutorialdao1.directorinthegivenyearrange(director,year1,year2);
    }

    @GetMapping("/highestbudgettitlesofyear/{year}")
    public List<tutorial> highestbudgettitlesofyear(@PathVariable int year) {
        return tutorialdao1.highestbudgettitlesofyear(year);
    }

    @GetMapping("/Sortwithuserreview")
    public List<tutorial> Sortwithuserreview() {
        return tutorialdao1.Sortwithuserreview();
    }
}
