import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> tasks;                //private instance
    
    public ToDoList() {
        tasks = new ArrayList<>();                  
    }
    
    public void addTask(String task) {
        tasks.add(task);                                            //add function or method
        System.out.println("Task added: " + task);
    }
    
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);                       //remove a function 
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task index!");
        }
    }
    
    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("        Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("            "+(i + 1) + ". " + tasks.get(i));
            }
        }
    }
    
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Print tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:                                                             //switch case
                    System.out.print("Enter task to add: ");
                    scanner.nextLine(); // Consume newline character
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task index to remove: ");
                    int index = scanner.nextInt();
                    toDoList.removeTask(index - 1);
                    break;
                case 3:
                    toDoList.printTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
        
        scanner.close();
    }
}
