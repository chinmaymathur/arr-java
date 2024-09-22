//count the number of occurence of a particular element x 
import java.util.Scanner;
public class arr6 {
    static int countOccurence(int[]arr,int x ){
        int count = 0;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
    return count ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter size of array" +  n   +  "elements");
        for(int i=0 ; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter value of x ");
        int x = sc.nextInt();
        System.out.println("Count OF X"+ countOccurence(arr, x));

    }

}
