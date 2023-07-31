package src.pkg1;

public class Pallindrome {
    public static void main(String[] args) {
        int num = 5;
        int rem,temp=num,sum=0;

        while (num>0){
            rem = num%10;
            sum= (sum*10)+rem;
            num=num/10;
        }
        if (sum==temp)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
