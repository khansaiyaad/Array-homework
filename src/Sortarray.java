import java.util.Arrays;
import java.util.Scanner;

public class Sortarray {
//    static void sort(int a[]){
//        for(int i=0;i<=a.length;i++) {
//            int min = i;
//            for (int j = i + 1; j <= a.length; j++) {
//                if (a[j] < a[min]) {
//                    min = j;
//                }
//            }
//                int temp = a[min];
//                a[min] = a[i];
//                a[i] = a[temp];
//
//        }
//        System.out.println("Sorted array: ");
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }}

    public static void main(String args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        System.out.println("Enter an Array to sort: ");
        int a[]=new int[n];
      for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
      }

        Arrays.sort(a);
        System.out.println("Sorted array is: ");
      for(int i=0;i<a.length;i++){
          System.out.print(a[i]+" ");

      }

    }
}
