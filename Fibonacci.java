// problem: calculate and print the fibonacci number at n +-i

import java.util.Scanner;
import java.util.Hashtable;

public class Fibonacci {
   
   public static int fibonacciRecursion(int n, Hashtable<Integer, Integer> fibonacciNumbers) {
      // define starting numbers to begin fib sequence, 0 and 1
      if(n <= 0) {
         return 0;
      }else if(n == 1) {
         return 1;
      }else if(!fibonacciNumbers.containsKey(n)) { // only use recursion if number is not already stored in hashtable to prevent repeat calculations and save time
         fibonacciNumbers.put(n, fibonacciRecursion(n - 1, fibonacciNumbers) + fibonacciRecursion(n - 2, fibonacciNumbers));
      }
      return fibonacciNumbers.get(n); // storying numbers in hashtable (memoization) instead of repeating calculation improves time from O(2^n) to O(n)
   }
   
   public static void main(String args[]) {
      // hashtable for quick lookup. key = index of fib number, value = value of fib number
      Hashtable<Integer, Integer> fibonacciNumbers = new Hashtable<Integer, Integer>();
      System.out.print("Input n: ");
      int n = new Scanner(System.in).nextInt();
      System.out.print("Input i: ");
      int index = new Scanner(System.in).nextInt();
      
      // print output of fibonacciRecursion method for specified interval
      for(int i = n - index; i < n + index; i++) {
         System.out.println(fibonacciRecursion(i, fibonacciNumbers));
      }
   }
}