public class TaskManager {

        public static void main(String[] args) {

            SimpleTask task1 = new SimpleTask("Task 1", "Description for Task 1", 1, "Не выполнено");
            SimpleTask task2 = new SimpleTask("Task 2", "Description for Task 2", 2, "Не выполнено");


            ComplexTask complexTask = new ComplexTask("Complex Task", "Description for Complex Task", 3, "Не выполнено");
            complexTask.addSubTask(task1);
            complexTask.addSubTask(task2);


            System.out.println("All Tasks:");
            System.out.println(task1);
            System.out.println(task2);
            System.out.println(complexTask);


            complexTask.markAllSubTasksAsCompleted();


            System.out.println("\nAfter marking all sub-tasks as completed:");
            System.out.println(complexTask);


            System.out.println("\nTotal number of tasks: " + Task.getTaskCount());
        }
    }


