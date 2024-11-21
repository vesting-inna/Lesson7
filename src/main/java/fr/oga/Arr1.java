package fr.oga;
import java.util.Arrays;

public class Arr1 {
    public static void arr1() {
        int[] numbers = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
        int[] result = removeDuplicates(numbers);
        System.out.println(Arrays.equals(result, expectedNums));
    }

    public static int[] removeDuplicates(int[] numbers) {
        int counter = 0;
        while (counter < numbers.length - 1) {
            for (int i = counter; i < numbers.length - 1; i++) {
                if (numbers[i] == numbers[i + 1]) {
                    numbers[i + 1] = 0;
                } else if (numbers[i] < numbers[i + 1]) {
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = 0;
                }
            }
            counter++;
        }
        return numbers;
    }
}

