import java.util.Scanner;

public class A_in_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter s String: ");
        String str=sc.nextLine();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                cnt=cnt+1;
            }
        }
        System.out.println("the total number os A's in the string is: "+cnt);
    }
}
