package com.firstjob.jobapp.job.impl;

import com.firstjob.jobapp.job.Job;
import com.firstjob.jobapp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class JobServiceImpl implements JobService {

    private List<Job> jobs = new ArrayList<>();

    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        jobs.add(job);
    }
}
