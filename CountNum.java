/*
Count Even Numbers in Array
by CodeChum Admin

Write a program that takes an array of integers as input and prints the count of even numbers in the array.
Sample Output 1

Enter size of the array: 5
Enter elements of the array:
1
2
3
5
6
Count of even numbers in the array: 2
Sample Output 2

Enter size of the array: 6
Enter elements of the array:
2
5
8
3
69
9
Count of even numbers in the array: 2
Sample Output 3

Enter size of the array: 3
Enter elements of the array:
-2
-6
-4
Count of even numbers in the array: 3

  */

import java.util.Scanner;

public class CountNum{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int size = 0;
        
        System.out.print("Enter size of the array: ");
        size = in.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter elements of the array: ");
        
        for (int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < size; i++){
            if(arr[i] %2==0){
                count++;
            }
        }
        System.out.println("Count of even numbers in the array: " + count);
    }
}
