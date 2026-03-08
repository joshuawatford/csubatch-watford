package csubatch.queue;

import csubatch.job.Job;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JobQueue {
    private final List<Job> jobs;

    public JobQueue() {
        this.jobs = new ArrayList<>();
    }

    public void enqueue(Job job) {
        jobs.add(job);
    }

    public List<Job> getAllJobs() {
        return Collections.unmodifiableList(jobs);
    }

    public int size() {
        return jobs.size();
    }

    public boolean isEmpty() {
        return jobs.isEmpty();
    }
}