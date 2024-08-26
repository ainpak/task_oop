import java.util.ArrayList;
import java.util.List;

public class ComplexTask extends Task{

        private List<SimpleTask> subTasks;


        public ComplexTask(String title, String description, int priority, String status) {
            super(title, description, priority, status);
            this.subTasks = new ArrayList<>();
        }


        public void addSubTask(SimpleTask task) {
            subTasks.add(task);
        }


        public void markAllSubTasksAsCompleted() {
            for (SimpleTask subTask : subTasks) {
                subTask.setStatus("Выполнено");
            }
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder(super.toString());
            if (!subTasks.isEmpty()) {
                result.append("\nSubTasks:\n");
                for (SimpleTask subTask : subTasks) {
                    result.append("  - ").append(subTask.toString()).append("\n");
                }
            }
            return result.toString();
        }
    }


