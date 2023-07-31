package src.pkg1;

public class Factorial {

    int fact(int n){
        return  (n==0 || n==1 ) ?1:n*fact(n-1);
    }

    int fact1(int n){
        int factor =1;
        if (n == 0 || n==1)
            return factor;
        for (int i = 2; i <= n; i++) {
            factor = factor*i;
        }
        return factor;
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().fact(10));
        System.out.println(new Factorial().fact1(10));
    }
}
