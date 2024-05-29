public class Main {
    public static void main(String[] args) {

//        Task 1
        Task_1 task1 = new Task_1(4);
        Max max = new Max(task1);
        Min min = new Min(task1);

        Thread threadMin = new Thread(min);
        Thread threadMax = new Thread(max);

        threadMin.start();
        threadMax.start();
    }
}