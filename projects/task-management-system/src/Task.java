public class Task {
    // Encapsulated fields
    private String taskID;
    private String taskDescription;
    private String taskCategory;
    private int taskPriority;
    private boolean taskIsCompleted;

    // Constructor
    Task(String taskID, String taskDescription, String taskCategory, int taskPriority, boolean taskIsCompleted) {
        this.taskID = taskID;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskPriority = taskPriority;
        this.taskIsCompleted = taskIsCompleted;
    }

    // Getters and setters
    public String getTaskID() {
        return taskID;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public String getTaskCategory() {
        return taskCategory;
    }
    public int getTaskPriority() {
        return taskPriority;
    }
    public boolean getTaskIsCompleted() {
        return taskIsCompleted;
    }
    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }
    public void setTaskPriority(int taskPriority) {
        this.taskPriority = taskPriority;
    }
    public void setTaskIsCompleted(boolean taskIsCompleted) {
        this.taskIsCompleted = taskIsCompleted;
    }

    // Custom toString
    @Override
    public String toString () {
        return  "\nTask" +
                "\nID: " + taskID +
                "\nDescription:" + taskDescription +
                "\nCategory: " + taskCategory +
                "\nPriority: " + taskPriority +
                "\nCompleted: " + taskIsCompleted;
    }
}
