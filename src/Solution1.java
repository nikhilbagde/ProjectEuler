/**
 * Created by Nikhil on 3/2/2016.
 */

import java.util.Scanner;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.

 Find the sum of all the multiples of 3 or 5 below NN.

 Input Format
 First line contains TT that denotes the number of test cases. This is followed by TT lines, each containing an integer, NN.

 Output Format
 For each test case, print an integer that denotes the sum of all the multiples of 3 or 5 below NN.

 Constraints
 1≤T≤1051≤T≤105
 1≤N≤1091≤N≤109

 Sample Input

 2
 10
 100
 Sample Output

 23
 2318
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        if(!(1<=testCases) && !(testCases<=100000)){
            System.out.println("Invlaid Input");
            System.exit(0);
            //throw new IllegalArgumentException();
        }


        for (int i = 0; i < testCases; i++) {
            int number = scanner.nextInt();
            if(!(1<=number) && !(number<=1000000000)){
                System.out.println("Invlaid Input");
                System.exit(0);
                //throw new IllegalArgumentException();
            }
            int finalSum = 0;
            for (int j = 1; j < number ; j++) {
                if(j % 3 == 0 || j % 5 ==0){
                    finalSum+= j;
                }
            }
            System.out.println(finalSum);
        }

    }
}
