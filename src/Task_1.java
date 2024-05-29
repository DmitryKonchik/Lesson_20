import java.util.Scanner;

public class Task_1 {

    Scanner scanner = new Scanner(System.in);

    int[] numbers;

    int length;

    public Task_1(int length) {
        this.length = length;
        numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

}
