# Task Management System

## Scenario
This is a **console-based Java application** designed to help users manage personal tasks efficiently. Users can add, categorize, complete, and view tasks based on urgency. The project utilizes a variety of Java collections to solve different parts of the problem, demonstrating practical use of data structures in a real-world scenario.

## Features & Functionalities

### Core Functionalities (via Console Menu)
1. **Add a Task**
    - Inputs: ID, description, category, priority
    - Validates uniqueness of task ID
    - Stores tasks in multiple collections:
        - `HashSet` for uniqueness
        - `HashMap` for category-based organization
        - `PriorityQueue` for urgency sorting
    - Logs a notification for the action

2. **Mark Task as Complete**
    - Marks the specified task as completed
    - Optionally removes it from the priority queue
    - Logs a completion notification

3. **View Tasks by Category**
    - Displays all tasks under a specific category

4. **Display Highest Priority Task**
    - Shows the most urgent task using a `PriorityQueue`

5. **View Notifications**
    - Lists all system actions in order using a `LinkedList`

6. **Exit**
    - Gracefully terminates the program

## Core Classes

### `Task`
- **Fields**:
    - `id`: Unique task identifier
    - `description`: Task details
    - `category`: E.g., Work, Personal, Urgent
    - `priority`: Integer (higher means more urgent)
    - `completed`: Boolean flag

### `Notification` 
- **Fields**:
    - `message`: Description of the event
    - `time`: When the event occurred

## Data Structures Used

| Collection | Purpose |
|-----------|---------|
| `HashSet<String> taskIDs` | Ensure task IDs are unique |
| `HashMap<String, ArrayList<Task>> tasksByCategory` | Organize tasks by category |
| `PriorityQueue<Task>` | Always access the most urgent task |
| `LinkedList<String>` | Maintain a history of notifications |

Each collection plays a specific role in making the application efficient and user-friendly.

## How It Works

1. **Startup:** The console menu appears, prompting the user to select an action.
2. **Adding Tasks:** Ensures no duplicate IDs, assigns tasks to categories and the urgency queue.
3. **Completion:** Updates the task's status and optionally cleans up the queue.
4. **Viewing:** Enables retrieval of tasks by category or urgency, and logs every major action.

## Key Concepts Demonstrated

- Java Collections (HashSet, HashMap, ArrayList, PriorityQueue, LinkedList)
- Object-Oriented Design
- Custom Comparators
- Console I/O in Java
- Task Management Logic

---
