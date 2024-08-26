public abstract class  Task {

        private String title;
        private String description;
        private int priority;
        private String status;
        protected static int taskCounter = 0;


        public Task(String title, String description, int priority, String status) {
            this.title = title;
            this.description = description;
            this.priority = priority;
            this.status = status;
            taskCounter++;
        }


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            if (status.equals("Выполнено") || status.equals("Не выполнено")) {
                this.status = status;
            } else {
                throw new IllegalArgumentException("Неверный статус задачи.");
            }
        }


        public static int getTaskCount() {
            return taskCounter;
        }

        @Override
        public String toString() {
            return "Title: " + title + "\nDescription: " + description + "\nPriority: " + priority + "\nStatus: " + status;
        }
    }


