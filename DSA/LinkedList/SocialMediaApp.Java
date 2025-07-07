import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds; // List of Friend User IDs
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

class SocialMedia {
    User head = null;

    // Add a new user
    public void addUser(User newUser) {
        newUser.next = head;
        head = newUser;
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            if (!user1.friendIds.contains(userId2)) user1.friendIds.add(userId2);
            if (!user2.friendIds.contains(userId1)) user2.friendIds.add(userId1);
            System.out.println("Friend connection added.");
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Remove a friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
            System.out.println("Friend connection removed.");
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Find mutual friends
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            System.out.println("Mutual friends:");
            for (int id : user1.friendIds) {
                if (user2.friendIds.contains(id)) {
                    System.out.println("Friend ID: " + id);
                }
            }
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friendIds);
        } else {
            System.out.println("User not found.");
        }
    }

    // Search for a user by name or ID
    public void searchUser(String nameOrId) {
        User temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(nameOrId) || String.valueOf(temp.userId).equals(nameOrId)) {
                System.out.println("Found: " + temp.name + " (ID: " + temp.userId + ", Age: " + temp.age + ")");
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("User not found.");
    }

    // Count number of friends for each user
    public void countAllFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }

    // Helper to find user by ID
    private User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }
}

public class SocialMediaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SocialMedia sm = new SocialMedia();

        while (true) {
            System.out.println("\n--- Social Media Friend Manager ---");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend Connection");
            System.out.println("3. Remove Friend Connection");
            System.out.println("4. Find Mutual Friends");
            System.out.println("5. Display Friends of a User");
            System.out.println("6. Search User by Name/ID");
            System.out.println("7. Count Friends of All Users");
            System.out.println("8. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sm.addUser(new User(id, name, age));
                }
                case 2 -> {
                    System.out.print("Enter User ID 1: ");
                    int u1 = sc.nextInt();
                    System.out.print("Enter User ID 2: ");
                    int u2 = sc.nextInt();
                    sm.addFriendConnection(u1, u2);
                }
                case 3 -> {
                    System.out.print("Enter User ID 1: ");
                    int u1 = sc.nextInt();
                    System.out.print("Enter User ID 2: ");
                    int u2 = sc.nextInt();
                    sm.removeFriendConnection(u1, u2);
                }
                case 4 -> {
                    System.out.print("Enter User ID 1: ");
                    int u1 = sc.nextInt();
                    System.out.print("Enter User ID 2: ");
                    int u2 = sc.nextInt();
                    sm.findMutualFriends(u1, u2);
                }
                case 5 -> {
                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();
                    sm.displayFriends(id);
                }
                case 6 -> {
                    System.out.print("Enter Name or ID to Search: ");
                    sc.nextLine();
                    String input = sc.nextLine();
                    sm.searchUser(input);
                }
                case 7 -> sm.countAllFriends();
                case 8 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
