package MustGeeks;

import java.util.Scanner;

public class AnagramsEfficient {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        int arr[]=new int[26];
        for(char s:s1.toCharArray())
        {
            arr[s-'a']++; //c-a in ascii =2 so at 2nd index increment 0 to 1;
        }
        for(char s:s2.toCharArray())
        {
            arr[s-'a']--;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
          sum=sum+Math.abs(arr[i]);
        }
        if(sum!=0)
        {
            System.out.print("Not");
        }
        else
        {
            System.out.print("Yes");
        }
    }
}
