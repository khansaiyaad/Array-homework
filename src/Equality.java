import java.util.Arrays;
import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array 1:");
        int[] a= new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter array 2:");
        int[] a1= new int[5];
        for(int i=0;i<a.length;i++){
            a1[i]=sc.nextInt();
        }

        if(Arrays.equals(a,a1)){
            System.out.println("Arrays are equal.");
        }else{
            System.out.println("Arrays are not equal.");
        }

    }
}