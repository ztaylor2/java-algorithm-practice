import java.util.Hashtable;

public class Test {
   public static void main(String args[]) {
      Hashtable<Integer, Integer> fibonacciNumbers = new Hashtable<Integer, Integer>();
      String answer = "0, 1, 1, 2, ";
      String s = Fibonacci.fibonacciString(2, 2, fibonacciNumbers);
      System.out.println(s);
      System.out.println(answer);
      if(s.equalsIgnoreCase(answer)) {
         System.out.println("true");
         }
      else {
         System.out.println("false");
         }
   }
}