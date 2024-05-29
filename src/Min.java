public class Min implements Runnable {

    private Task_1 task;

    public Min(Task_1 task) {
        this.task = task;
    }

    @Override
    public void run() {
        int min = Integer.MAX_VALUE;

        for (int n : task.getNumbers()) {
            if (min > n) {
                min = n;
            }
        }
        System.out.println("min : " + min);
    }
}
