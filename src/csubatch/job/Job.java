package csubatch.job;

public class Job {
    private static long arrivalCounter = 0;

    private final String name;
    private final int cpuTime;
    private final int priority;
    private final long arrivalTime;
    private JobStatus status;

    public Job(String name, int cpuTime, int priority) {
        this.name = name;
        this.cpuTime = cpuTime;
        this.priority = priority;
        this.arrivalTime = ++arrivalCounter;
        this.status = JobStatus.WAITING;
    }

    public String getName() {
        return name;
    }

    public int getCpuTime() {
        return cpuTime;
    }

    public int getPriority() {
        return priority;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }
}