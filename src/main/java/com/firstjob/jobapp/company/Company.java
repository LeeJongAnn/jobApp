package com.firstjob.jobapp.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.firstjob.jobapp.job.Job;
import com.firstjob.jobapp.review.Review;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

<<<<<<< Updated upstream

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> jobs = new ArrayList<>();
=======
    @OneToMany
    private List<Job> jobs = new ArrayList<>();

    @OneToMany
    private List<Review> reviews = new ArrayList<>();
>>>>>>> Stashed changes

    public Company(Long id, String name, String description, List<Job> jobs) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.jobs = jobs;
    }


    //    private List<Review> reviews;

    public Company() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

}
