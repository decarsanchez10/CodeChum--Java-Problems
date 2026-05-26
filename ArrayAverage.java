/*
Array Average
by CodeChum Admin

Write a program that takes an array of integers as input and prints the average of all its elements.
Sample Output 1

Enter the size of array: 3
Enter 3 elements of array:
15
54
5
The average of the array is: 24.67
Sample Output 2

Enter the size of array: 5
Enter 5 elements of array:
12
6454
131
46
31
The average of the array is: 1334.80
Sample Output 3

Enter the size of array: 4
Enter 4 elements of array:
12
32
12
65
The average of the array is: 30.25

*/
//My Solution
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        int arr = 0;
        float sum = 0, average;
        

        Scanner in = new Scanner(System.in);
        
        
        System.out.printf("Enter the size of array: ");
        arr = in.nextInt();
        
        
        System.out.printf("Enter " + arr + " elements of array: \n");
                int[] array = new int[arr];

        for(int i = 0; i < arr; i++){
            array[i] = in.nextInt();
            sum += array[i];
        }
         average =(float) sum / arr;

        System.out.printf("The average of the array is: %.2f ", average);
    }
}
