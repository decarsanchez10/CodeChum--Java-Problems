/*

Count Odd Numbers in Array
by CodeChum Admin

Write a program that takes an array of integers as input and prints the count of odd numbers in the array.
Sample Output 1

Enter size of the array: 3
Enter elements of the array:
1
2
3
Count of odd numbers in the array: 2
Sample Output 2

Enter size of the array: 6
Enter elements of the array:
1
2
3
4
5
6
Count of odd numbers in the array: 3
Sample Output 3

Enter size of the array: 3
Enter elements of the array:
3
7
5
Count of odd numbers in the array: 3

  */

import java.util.Scanner;

public class CountOddNum {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int size = 0;
        System.out.print("Enter size of the array: ");
        size = in.nextInt();
        
        System.out.println("Enter elements of the array:");
        
        int[] arr = new int[size];
        
        int count = 0;
        for (int i = 0; i < size; i++){
            arr[i] = in.nextInt();
            
            if(arr[i] %2!=0){
                count++;
            }
        }
        System.out.print("Count of odd numbers in the array: " + count);
        
    }
}

