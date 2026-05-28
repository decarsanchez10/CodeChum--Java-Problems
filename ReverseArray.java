/*

Reverse Array
by CodeChum Admin

Write a program that takes an array of integers as input and prints the array in reverse order.
Sample Output 1

Enter the size of array: 3
Enter the elements of the array:
12
5
59
The array in reverse order is: 59 5 12
Sample Output 2

Enter the size of array: 5
Enter the elements of the array:
23
65
89
98
1
The array in reverse order is: 1 98 89 65 23
Sample Output 3

Enter the size of array: 2
Enter the elements of the array:
65
56
The array in reverse order is: 56 65

  */
import java.util.Scanner;

public class ReverseArray{
    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        
        System.out.println("Enter the elements of the array: ");
        
        int[] arr = new int[size];
        
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
            
        }
       System.out.print("The array in reverse order is: ");
        for (int i = size -1; i >=0; i--){
            System.out.print(arr[i] + " ");
            }
    }
}
