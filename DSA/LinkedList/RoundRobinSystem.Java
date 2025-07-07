import java.util.Scanner;

class Process {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnAroundTime;
    Process next;

    Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnAroundTime = 0;
        this.next = null;
    }
}

class RoundRobinScheduler {
    Process tail = null;
    int processCount = 0;
    int currentTime = 0;

    // Add process at end
    public void addProcess(Process newProcess) {
        if (tail == null) {
            tail = newProcess;
            tail.next = tail;
        } else {
            newProcess.next = tail.next;
            tail.next = newProcess;
            tail = newProcess;
        }
        processCount++;
    }

    // Remove process by ID
    public void removeById(int pid) {
        if (tail == null) return;

        Process current = tail.next;
        Process prev = tail;

        do {
            if (current.processId == pid) {
                if (current == tail && current == tail.next) {
                    tail = null;
                } else {
                    prev.next = current.next;
                    if (current == tail) tail = prev;
                }
                processCount--;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != tail.next);
    }

    // Display process queue
    public void displayProcesses() {
        if (tail == null) {
            System.out.println("No processes in queue.");
            return;
        }

        Process temp = tail.next;
        System.out.println("\nProcesses in Queue:");
        do {
            System.out.println("PID: " + temp.processId +
                    ", BT: " + temp.burstTime +
                    ", Remaining: " + temp.remainingTime +
                    ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != tail.next);
    }

    // Simulate Round Robin
    public void runScheduler(int timeQuantum) {
        if (tail == null) {
            System.out.println("No processes to run.");
            return;
        }

        Process current = tail.next;

        while (processCount > 0) {
            if (current.remainingTime > 0) {
                int timeSpent = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= timeSpent;
                currentTime += timeSpent;

                System.out.println("Executing PID " + current.processId + " for " + timeSpent + " units.");
                displayProcesses();

                if (current.remainingTime == 0) {
                    current.turnAroundTime = currentTime;
                    current.waitingTime = current.turnAroundTime - current.burstTime;
                    System.out.println("PID " + current.processId + " completed.");
                    removeById(current.processId);
                }
            }

            current = current.next;
            if (tail == null) break; // All processes finished
        }

        System.out.println("All processes completed.\n");
        printFinalStats();
    }

    // Print Average Waiting and Turnaround Time
    public void printFinalStats() {
        int totalWT = 0, totalTAT = 0, total = 0;
        Process temp = tail == null ? null : tail.next;

        if (temp == null) {
            System.out.println("No final stats (empty).");
            return;
        }

        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnAroundTime;
            total++;
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("Average Waiting Time: " + (totalWT / (double) total));
        System.out.println("Average Turnaround Time: " + (totalTAT / (double) total));
    }
}

public class RoundRobinSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        while (true) {
            System.out.println("\n---- Round Robin Scheduler ----");
            System.out.println("1. Add Process");
            System.out.println("2. Display Processes");
            System.out.println("3. Run Scheduler");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter Process ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter Burst Time: ");
                    int bt = sc.nextInt();
                    System.out.print("Enter Priority: ");
                    int pr = sc.nextInt();
                    Process p = new Process(pid, bt, pr);
                    scheduler.addProcess(p);
                }
                case 2 -> scheduler.displayProcesses();
                case 3 -> {
                    System.out.print("Enter Time Quantum: ");
                    int tq = sc.nextInt();
                    scheduler.runScheduler(tq);
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
