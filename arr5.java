
// taking array input in java
/*import java.util.Scanner;
public class arr5 {
public static void main(String[] args) {
 Scanner sc =  new Scanner(System.in);
 System.out.println("Enter  size of array");
 int n = sc.nextInt();
 int arr [] = new int[n];
 System.out.println("Enter "+ n + "elements");
for(int i = 0; i<arr.length ; i++ )
{
arr[i] = sc.nextInt();
} 
for(int i = 0;i<n;i++){
    System.out.println(arr[i]  + " ");
}}
}*/
import java.util.Scanner;
public class arr5{

    static void skit_arr(int[] arr){
        for(int i=0 ; i<arr.length;i++){
            arr[i]= 0; 
        }}
        public static void main(String[] args){
        int[] arr =  new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        skit_arr(arr);
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    }

