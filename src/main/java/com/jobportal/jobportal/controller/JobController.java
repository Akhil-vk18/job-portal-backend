package com.jobportal.jobportal.controller;

import com.jobportal.jobportal.model.Jobs;
import com.jobportal.jobportal.repository.Jobsrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// @CrossOrigin(origins = "*")-
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
