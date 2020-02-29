package zajecia8;

import java.util.Random;
import java.util.Scanner;

public class printArrayInStars {
//Write a program called printArrayInStars which prompts user for the number of items in an array (a non-negative integer),
// and saves it in an int variable called numItems. It then prompts user for the values of all the items (non-negative integers)
// and saves them in an int array called items. The program shall then print the contents of the array in a graphical form,
// with the array index and values represented by number of stars. For examples:
//    Enter the number of items: 5
//    Enter the value of all items (separated by space): 7 4 3 0 7
//            0: *******(7)
//            1: ****(4)
//            2: ***(3)
//            3: (0)
//            4: *******(7)

    // Declare variables
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int arrayLength=scanner.nextInt();
        int[] array=new int[arrayLength];
        System.out.println("Enter the value of items: ");
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        for(int i=0; i<array.length;i++){
            System.out.println(i+":"+"*".repeat(array[i])+"("+array[i]+")");



            }
        }
    }

