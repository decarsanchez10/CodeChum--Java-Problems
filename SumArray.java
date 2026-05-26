/*
Sum of Array Elements
by CodeChum Admin

Write a program that takes an array of integers as input and returns the sum of all its elements.
Sample Output 1

Enter the number of elements: 5
Enter the elements:
1
2
5
6
8
Sum of elements: 22
Sample Output 2

Enter the number of elements: 2
Enter the elements:
59
65
Sum of elements: 124
Sample Output 3

Enter the number of elements: 6
Enter the elements:
56
656
362
21
3
15
Sum of elements: 1113

*/

// My Solution

import java.util.Scanner;

public class SumArray {
    public static void main (String args[]){
        
        Scanner in = new Scanner(System.in);
        
        int num, sum = 0;
        System.out.print("Enter the number of elements: ");
        num = in.nextInt();
        
        if (num == 1) {
            System.out.print("Enter element: ");
        }
        else if (num == 0){
            
        }
        else {
        System.out.println("Enter the elements:");
        }
        int[] elements = new int[num];

        for (int i = 0; i < elements.length; i++){
        elements[i] = in.nextInt();
        sum += elements[i];
            
        }
        
        System.out.print("Sum of elements: " + sum);
        
    }
}
