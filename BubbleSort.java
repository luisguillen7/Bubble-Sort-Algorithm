import java.util.Random;

/*
This program performs a bubble sort using an array of 10 random numbers within a range of 0-100;
*/

public class BubbleSort {

    // Main method
    public static void main(String[] args){

        // Creates a random object to retrieve random numbers
        Random randomNumbers = new Random();

        // Creates int array of 10 elements
        int[] numbers = new int[10];

        // Populate the array
        for(int i = 0; i < numbers.length - 1; i++){

            // Inserts a random number into the array within a range of 0 - 100
            numbers[i] = randomNumbers.nextInt(100);
        }

        // Array before sorting
        System.out.println("Array before sort: ");
        printArray(numbers);

        // Bubble Sort algorithm

        // Boolean variable set to true that allows to enter the while loop
        boolean swappedSomething = true;

        // While loop is set to true to enter the loop
        while(swappedSomething){

            // In best case scenario that nothing has to be swapped, so it is set to false
            swappedSomething = false;

            // For loop that goes through the array
            for(int i = 0; i < numbers.length - 1; i++) {

                // If the first index (0) is greater than its following index (1)
                if (numbers[i] > numbers[i + 1]) {

                    // If something does need to be swapped, swappedSomething is now set to true
                    swappedSomething = true;

                    // Variable temp holds the first instance of index 0
                    int temp = numbers[i];

                    // Swap indexes
                    // Whatever was at index 1 is now at index 0
                    numbers[i] = numbers[i + 1];

                    // Whatever was at index 0 is now at index 1 using the temp variable
                    numbers[i + 1] = temp;
                } // if statement
            } // for loop
        } // while loop


        // Array after sorting
        System.out.println("\n" + "Array after sort:");
        printArray(numbers);

    } // main

    public static void printArray(int[] numbers){

        // Print every number of the array
        for(int i = 0; i < numbers.length; i++){

            // Prints every element in the array
            System.out.print(numbers[i] + " ");
        }
    }

} // class
