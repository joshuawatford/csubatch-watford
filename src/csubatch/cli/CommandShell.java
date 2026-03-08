package csubatch.cli;

import csubatch.queue.JobQueue;

import java.util.Scanner;

public class CommandShell {
    private final CommandParser parser;
    private final Scanner scanner;
    private boolean running;

    public CommandShell(JobQueue jobQueue) {
        this.parser = new CommandParser(jobQueue);
        this.scanner = new Scanner(System.in);
        this.running = true;
    }

    public void start() {
        printWelcomeMessage();

        while (running) {
            System.out.print("> ");

            if (!scanner.hasNextLine()) {
                break;
            }

            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                continue;
            }

            boolean shouldContinue = parser.handleCommand(input);
            if (!shouldContinue) {
                running = false;
            }
        }

        scanner.close();
        System.out.println("Exiting CSUbatch.");
    }

    private void printWelcomeMessage() {
        System.out.println("Welcome to CSUbatch");
        System.out.println("Type 'help' to see available commands.");
    }
}