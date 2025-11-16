package com.jobportal.jobportal.repository;

import com.jobportal.jobportal.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Jobsrepo extends JpaRepository<Jobs,Integer> {
    List<Jobs> findByTitleContainingIgnoreCase(String title);//Uses Spring Data JPA to generate the SQL like SELECT * FROM jobs WHERE LOWER(title) LIKE '%developer%'
    List<Jobs> findAllByOrderByPostedDateDesc();//uses spring Data JPA to return all jobs in the order of posted date
}
