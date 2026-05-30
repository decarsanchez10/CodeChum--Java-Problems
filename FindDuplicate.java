/* Find Duplicate Elements in Array
by CodeChum Admin

Write a program that takes an input array of integers and prints a new array containing all the duplicate elements in the original array.
Sample Output 1

Enter the number of elements in the array: 5
Enter 5 elements in the array:
1
1
2
3
6
Duplicate elements in the array are: 1
Sample Output 2

Enter the number of elements in the array: 3
Enter 3 elements in the array:
1
2
2
Duplicate elements in the array are: 2
Sample Output 3

Enter the number of elements in the array: 4
Enter 4 elements in the array:
1
2
3
4
Duplicate elements in the array are: None

  */
import java.util.Scanner;

public class FindDuplicate{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();
                int[] freq = new int[n];

        
        System.out.println("Enter " + n + " elements in the array: ");
        
        int[] arr = new int[n];
        int count = 0; 
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
    }

        for(int i = 0; i <n ; i++){
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j] && freq[i] != -1){
   System.out.print("Duplicate elements in the array are: ");
                  System.out.print(arr[i] + "");
                  freq[j] = -1;
                  count++;
                }
            }
        }
    if( count == 0){
    System.out.print("Duplicate elements in the array are: None");
                    }
   
    }
}
