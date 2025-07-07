import java.util.Scanner;

class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    Task head = null;

    public void addAtEnd(Task newTask) {
        if (head == null) {
            head = newTask;
            newTask.next = head;
            return;
        }
        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newTask;
        newTask.next = head;
    }

    public void addAtBeginning(Task newTask) {
        if (head == null) {
            head = newTask;
            newTask.next = head;
            return;
        }
        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newTask.next = head;
        head = newTask;
        temp.next = head;
    }

    public void addAtPosition(Task newTask, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(newTask);
            return;
        }
        Task temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newTask.next = temp.next;
        temp.next = newTask;
    }

    public void removeById(int id) {
        if (head == null) return;

        Task curr = head, prev = null;
        do {
            if (curr.id == id) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        Task last = head;
                        while (last.next != head) last = last.next;
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }
                System.out.println("Task removed.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Task not found.");
    }

    public void viewAllTasks() {
        if (head == null) {
            System.out.println("No tasks.");
            return;
        }
        Task temp = head;
        System.out.println("\nTasks:");
        do {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        Task temp = head;
        boolean found = false;
        if (head == null) return;

        do {
            if (temp.priority == priority) {
                System.out.println("Task: " + temp.name + ", Due: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No task with given priority.");
    }
}

public class TaskSchedulerSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        while (true) {
            System.out.println("\n--- Task Scheduler ---");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View All Tasks");
            System.out.println("6. Search by Priority");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1, 2, 3 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Priority: ");
                    int priority = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Due Date: ");
                    String due = sc.nextLine();
                    Task t = new Task(id, name, priority, due);
                    if (ch == 1) scheduler.addAtBeginning(t);
                    else if (ch == 2) scheduler.addAtEnd(t);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        scheduler.addAtPosition(t, pos);
                    }
                }
                case 4 -> {
                    System.out.print("Enter ID: ");
                    scheduler.removeById(sc.nextInt());
                }
                case 5 -> scheduler.viewAllTasks();
                case 6 -> {
                    System.out.print("Enter Priority: ");
                    scheduler.searchByPriority(sc.nextInt());
                }
                case 7 -> {
                    System.out.println("Exit.");
                    return;
                }
                default -> System.out.println("Invalid.");
            }
        }
    }
}
