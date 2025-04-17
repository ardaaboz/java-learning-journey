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

    private PriorityQueue<Task> taskQueue = new PriorityQueue<>();
    // Purpose: Maintain tasks sorted by priority (or urgency)
    // so that the most urgent task is always available.
    // Requirement: Create a custom comparator to sort tasks (In descending order of priority).

    private LinkedList<String> notifications = new LinkedList<>();
    // Purpose: Log notifications (e.g., "Task X added", "Task Y marked complete").
    // Usage: Maintain a history of actions in the order they happened.
}
