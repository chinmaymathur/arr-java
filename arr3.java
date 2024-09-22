// demonstrate multidimensional array
import java.util.Scanner;
public class arr3{
    public static void main(String[] args){
        int [] [] arr = {{54,65,4}, {4,65,45} };

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        
       for(int i = 0; i<3; i++){
        System.out.println(arr[i]);
       }


    }}