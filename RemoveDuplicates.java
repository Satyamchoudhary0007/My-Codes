package MustGeeks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Character> list=new ArrayList<>();
        int a=in.nextInt();
        in.nextLine();
        for(int i=0;i<a;i++)
        {
            String s=in.nextLine();
            for(int j=0;j<s.length();j++)
            {
                if(!list.contains(s.charAt(j)))
                {
                    list.add(s.charAt(j));
                }
                else
                    {
                }
            }
            Iterator ir=list.iterator();
            while (ir.hasNext())
            {
                System.out.print(ir.next());
            }
        }

    }
}
