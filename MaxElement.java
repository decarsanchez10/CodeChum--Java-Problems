/* 
Maximum Element in Array
by CodeChum Admin

Write a function that takes an array of integers as input and prints the maximum element in the array.
Sample Output 1

Enter size of array: 5
Enter elements of array:
1
56
36
25
365
Maximum element in array is: 365
Sample Output 2

Enter size of array: 2
Enter elements of array:
13
32
Maximum element in array is: 32
Sample Output 3

Enter size of array: 4
Enter elements of array:
12
32
12
56
Maximum element in array is: 56

*/
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int elements, max, size = 0;
        System.out.printf("Enter size of array: ");
        size = in.nextInt();

        System.out.printf("Enter elements of array: \n");
        
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++){
            array[i] = in.nextInt();
        }
        max = array[0];
        for(int i = 0; i < size; i++){
            if(array[i] > max) {
              max = array[i]; 
            
            }
        }
        System.out.println("Maximum element in array is: " + max);
    }
}
