import java.util.Scanner;

public class Task_1 {

    private Scanner scanner = new Scanner(System.in);

    private int[] numbers;

    public int[] getNumbers() {
        return numbers;
    }

    private int length;

    public Task_1(int length) {
        this.length = length;
        numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
    }


}
