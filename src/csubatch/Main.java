package csubatch;
#test change
import csubatch.cli.CommandShell;
import csubatch.queue.JobQueue;

public class Main {
    public static void main(String[] args) {
        JobQueue jobQueue = new JobQueue();
        CommandShell shell = new CommandShell(jobQueue);
        shell.start();
    }
}