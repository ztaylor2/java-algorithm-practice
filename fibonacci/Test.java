import java.util.Hashtable;

public class Test {
   public static void main(String args[]) {
      Hashtable<Integer, Integer> fibonacciNumbers = new Hashtable<Integer, Integer>();
      
      // test input 2, 2
      String answer = "0, 1, 1, 2, 3, ";
      String output = Fibonacci.fibonacciTestOutput(2, 2, fibonacciNumbers);
      System.out.println("Algorithm output: " + output);
      System.out.println("Expected answer: " + answer);
      System.out.println(isCorrect(output, answer));
      
      // test input 5, 2
      answer = "2, 3, 5, 8, 13, ";
      output = Fibonacci.fibonacciTestOutput(2, 5, fibonacciNumbers);
      System.out.println("Algorithm output: " + output);
      System.out.println("Expected answer: " + answer);
      System.out.println(isCorrect(output, answer));
   }
   
   public static boolean isCorrect(String output, String answer){
      if(output.equalsIgnoreCase(answer)){
         return true;
      }else{
         return false;
      }
   }
}