// given 2 integers a and b . Swap the 2 given values using temporary variable
/*import java.util.Scanner;
public class arr8{
   static void swap(int a,int b){
    System.out.println("Origianl value");
    System.out.println("a: "+ a);
    System.out.println("b: "+b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println("after swap value");
    System.out.println("a: "+ a);
    System.out.println("b: "+ b);
}
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        swap(a, b);
    }   
}*/
//swap 2 no. without using 3 variable 
import java.util.Scanner;

public class arr8 {
   static int[] swap(int a, int b) {
       System.out.println("Original values");
       System.out.println("a: " + a);
       System.out.println("b: " + b);
       a = a + b;
       b = a - b;
       a = a - b;
          int[] result = {a, b};
       return result;
   }  

   public static void main(String[] args) {
       int a = 7;
       int b = 5;
       
       int[] swappedValues = swap(a, b);
       a = swappedValues[0];
       b = swappedValues[1];
       
       System.out.println("After swap values");
       System.out.println("a: " + a);
       System.out.println("b: " + b);
   }
}
