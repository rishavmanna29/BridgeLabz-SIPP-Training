import java.util.Scanner;

class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {
    private TextState head = null;
    private TextState tail = null;
    private TextState current = null;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add new state (on typing or editing)
    public void addState(String content) {
        TextState newState = new TextState(content);

        // If current is not the last (redo was used), remove all forward states
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = getSizeFromHead(); // re-calculate size
        }

        if (head == null) {
            head = tail = current = newState;
            size = 1;
        } else {
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = newState;
            size++;

            // Maintain max size of history
            if (size > MAX_HISTORY) {
                head = head.next;
                head.prev = null;
                size--;
            }
        }
        System.out.println("Text updated.");
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo successful.");
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo successful.");
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    // Display current content
    public void display() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty.");
        }
    }

    // Count size from head to tail
    private int getSizeFromHead() {
        int count = 0;
        TextState temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class TextEditorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        while (true) {
            System.out.println("\n--- Text Editor ---");
            System.out.println("1. Type Text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Current Text");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter new text: ");
                    String content = sc.nextLine();
                    editor.addState(content);
                }
                case 2 -> editor.undo();
                case 3 -> editor.redo();
                case 4 -> editor.display();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
