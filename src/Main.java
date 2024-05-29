import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Task 1
//        Task_1 task1 = new Task_1(4);
//        Max max = new Max(task1);
//        Min min = new Min(task1);
//
//        Thread threadMin = new Thread(min);
//        Thread threadMax = new Thread(max);
//
//        threadMin.start();
//        threadMax.start();



//    Task_2

        // Не очень понял задание, надо ли сортировать разные массивы одновременно или один массив,
        // но работает два варианта, если сортировать один массив, результаты одинаковые
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            Random random = new Random();
            num[i] = random.nextInt(100);
        }
        int[] num1 = num;
        int[] num2 = num;


        Thread thread1 = new Thread(new InsertionSort(num));
        thread1.start();

        Thread thread2 = new Thread(new SelectionSort(num1));
        thread2.start();

        Thread thread3 = new Thread(new BubbleSort(num2));
        thread3.start();

    }
}