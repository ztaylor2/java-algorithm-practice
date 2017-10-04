import java.util.Scanner;
import java.util.Hashtable;

public class Fibonacci {
   
   // method to calculate fib numbers
   public static int fibonacciRecursion(int n, Hashtable<Integer, Integer> fibonacciNumbers) {
      // return starting numbers
      if(n <= 0) {
         return 0;
      }else if(n == 1) {
         return 1;
      }else if(!fibonacciNumbers.containsKey(n)) { // check to see if number is stored in hashtable. if not use recursion to calculate then store number in hashtable
         fibonacciNumbers.put(n, fibonacciRecursion(n - 1, fibonacciNumbers) + fibonacciRecursion(n - 2, fibonacciNumbers));
      }
      return fibonacciNumbers.get(n); // return number from hashtable 
   }
   
   public static void main(String args[]) {
      // create hashtable and input variables
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