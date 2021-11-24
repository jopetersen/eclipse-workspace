import java.util.Scanner;

public class help {
   public static void main(String [] args){
      Scanner scnr = new Scanner(System.in);
      int result;
      int a;
      int b;
      int c;
      
      a = scnr.nextInt();
      b = scnr.nextInt();
      c = scnr.nextInt();
      
      result = 0;
      
      while (a < b) {
         result = a * 2;
         System.out.println(result);
         if (result > c) {
            break;
        }
        a += 4;
      }
   }
}