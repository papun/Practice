package pkg1;

import java.util.ArrayList;

public class FactorialLarge {

    static ArrayList<Integer> factorial(int n)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int size,c=0;
        result.add(0,1);
        size=1;
        int val=2;
        while(val<=n)
        {
            for(int i=size-1;i>=0;i--)
            {
                int temp=result.get(i)*val + c;
                result.set(i,temp%10);
                c=temp/10;
            }
            while(c!=0)
            {
                result.add(0,c%10);
                c=c/10;
                size++;
            }
            val++;
        }
//        System.out.println(result);
        for (int i = 0; i <= result.size()-1; i++)
            System.out.print(result.get(i));
        return result;
    }

   public static void main(String[] args)
    {
        factorial(100);
    }
}
