/*
Minimum Element in Array
by CodeChum Admin

Write a program that takes an array of integers as input and prints the minimum element in the array.
Sample Output 1

Enter size of array: 3
Enter elements of array:
0
-5
23
Minimum element in array is: -5
Sample Output 2

Enter size of array: 4
Enter elements of array:
1
5
6
0
Minimum element in array is: 0
Sample Output 3

Enter size of array: 1
Enter elements of array:
5
Minimum element in array is: 5
  */
import java.util.Scanner;
public class MinElement{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int size =0;
        System.out.print("Enter size of array: ");
        size = in.nextInt();
        
        System.out.println("Enter elements of array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i < size; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("Minimum element in array is: " + min);
    }
}
