package com.jobportal.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.jobportal.model.Jobs;
import com.jobportal.jobportal.repository.Jobsrepo;

@CrossOrigin(origins = "https://infotech-careers.vercel.app")
@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    Jobsrepo jobsrepo;
    @GetMapping("")
    public List<Jobs> jobsList(){
        return jobsrepo.findAllByOrderByPostedDateDesc();
    }

//    @GetMapping("/search/{title}")
//    public List<Jobs> jobsList(@PathVariable String title){
//        return jobsrepo.findByTitleContainingIgnoreCase(title);
//    }
@GetMapping("/search")
public List<Jobs> jobsList(@RequestParam String title){
    return jobsrepo.findByTitleContainingIgnoreCase(title);
}
}
