package MustGeeks;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String arr[]=s.split("\\?"); //Literals must be specified with \\
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
            if(i>0)
            {
                System.out.print("?");
            }
            else
            {

            }
        }
    }
}
