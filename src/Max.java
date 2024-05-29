public class Max implements Runnable{

    Task_1 task;

    public Max(Task_1 task) {
        this.task = task;
    }

    @Override
    public void run() {
        int max = Integer.MIN_VALUE;

        for (int n : task.numbers) {
            if (max < n) {
                max = n;
            }
        }
        System.out.println("max : " + max);
    }
}
