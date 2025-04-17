import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class DataManager {
    // Encapsulated data structures
    private HashSet<String> taskIDs = new HashSet<>();
    // Purpose: Store the IDs of tasks to ensure uniqueness and prevent duplicate entries.
    // Usage: Before adding a task, check if the task ID is already in the set.

    private HashMap<String, ArrayList<Task>> tasksByCategory = new HashMap<>();
    // Key: Task category
    // Value: List of tasks within that category
    // Usage: To easily retrieve tasks by category and manage tasks grouped together.

    PriorityQueue<Task> taskQueue = new PriorityQueue<>(new Comparator<Task>() {
        @Override
        public int compare(Task t1, Task t2) {
            return Integer.compare(t1.getTaskPriority(), t2.getTaskPriority()); // Sorting by age
        }
    });
    // Purpose: Maintain tasks sorted by priority (or urgency)
    // so that the most urgent task is always available.
    // custom comparator to sort tasks (In descending order of priority).

    private LinkedList<String> notifications = new LinkedList<>();
    // Purpose: Log notifications (e.g., "Task X added", "Task Y marked complete").
    // Usage: Maintain a history of actions in the order they happened.

    // Methods

    // Add a task
    public void addTask(Scanner scanner) {
        // Take input
        System.out.println("\nAdding a task");
        System.out.print("ID: ");
        String inputID = scanner.nextLine();
        System.out.print("Description: ");
        String inputDescription = scanner.nextLine();
        System.out.print("Category: ");
        String inputCategory = scanner.nextLine();
        System.out.print("Priority: ");
        int inputPriority = scanner.nextInt();

        if (taskIDs.contains(inputID)) {
            System.out.println("Task with that ID already exists!");
        } else {
            // Create new task
            Task newTask = new Task(inputID, inputDescription, inputCategory, inputPriority, false);

            // If category does'nt exits, create a category with ArrayList
            tasksByCategory.putIfAbsent(inputCategory, new ArrayList<>());
            // Add task to ArrayList mapped to that category
            tasksByCategory.get(inputCategory).add(newTask);

            // Add it to Queue for sorting
            taskQueue.add(newTask);

            // Add a notification
            notifications.add("Task " + inputID + " created!");
        }
    }
}
