# CSUbatch

CSUbatch is a command-line batch job scheduling simulator. It allows users to submit jobs, store them in a queue, and inspect the current job queue using a simple interactive CLI.

This project demonstrates fundamental operating system concepts such as job scheduling, queue management, and command-line interfaces.

The current implementation supports basic job submission and queue inspection functionality.

---

# Features

- Interactive command-line interface (CLI)
- Job submission using the `run` command
- In-memory job queue
- Job listing with the `list` command
- Input validation and error handling
- Basic FCFS queue ordering (for display)

---

# How to Run

Compile the project and run the main class.

Example:

```bash
javac -d out src/csubatch/**/*.java
java -cp out csubatch.Main