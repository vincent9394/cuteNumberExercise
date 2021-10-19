package net.agileexlab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main cuteNumber = new Main();
        int[] numberSet = new int[]{123, 1233, 32, 54};
        int number = cuteNumber.findCuteNumber(numberSet);
        System.out.println(number);


    }

    public int findCuteNumber(int[] numbers) {
        int[] allEvenNumbers = this.findAllEvenNumbers(numbers);
        int largestNumber = findLargestNumber(allEvenNumbers);
        if (this.isNumberGreaterThanTen(largestNumber)) {
            return largestNumber;
        }
        return 0;
    }

    public int[] findAllEvenNumbers(int[] numbers) {
        int i = 0;
        return Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .toArray();


    }

    public int findLargestNumber(int[] numbers) {
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public boolean isNumberGreaterThanTen(int number) {
        if (number > 10){
            return true;
        }
        return false;
    }
}