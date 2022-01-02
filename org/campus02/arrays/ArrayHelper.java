package org.campus02.arrays;

public class ArrayHelper {

    public static void main(String[] args) {

        int[] numbers = {8,5,1,9,0,4};
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("");
        arrangeOrder(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void arrangeOrder(int[] numbers) {

        boolean isSorted = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                isSorted = false;
            }
        }
        if(isSorted == true){
            return;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                int lower = numbers[i];
                numbers[i] = numbers[i - 1];
                numbers[i - 1] = lower;
                arrangeOrder(numbers);
            }
        }
    }
}
