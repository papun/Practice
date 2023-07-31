package src.pkg1;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(romanToInt(str));
        System.out.println(romanToInts(str));
    }

    public static int romanToInts(String str) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("I",1);
        hm.put("V",5);
        hm.put("X",10);
        hm.put("L",50);
        hm.put("C",100);
        hm.put("D",500);
        hm.put("M",1000);
        int sum =0;
        for (int i = 0; i <= str.length()-1; i++) {
            System.out.println(str.charAt(i));
            if (hm.get(str.charAt(i)+"")<hm.get(str.charAt(i+1)+"")){
                sum-=hm.get(str.charAt(i)+"");
            }
            else{
                sum+=hm.get(str.charAt(i)+"");
            }
        }

        return sum;

//        HashMap<String,Integer> map=new HashMap<>(7);
//        int sum=0;
//        map.put("I",1);
//        map.put("V",5);
//        map.put("X",10);
//        map.put("L",50);
//        map.put("C",100);
//        map.put("D",500);
//        map.put("M",1000);
//        for(int i=0;i<str.length()-1;i++){
//            if(map.get(str.charAt(i)+"")<map.get(str.charAt(i+1)+"")){
//                sum-=(map.get(str.charAt(i)+""));
//            }
//            else{
//                sum+=(map.get(str.charAt(i)+""));
//            }
//
//        }
//        return sum+map.get(str.charAt(str.length()-1)+"");
    }

    public static int romanToInt(String str) {
        int num = 0, sum =0 , prev =0;
        for (int i = str.length()-1; i >=0 ; i--) {
            switch (str.charAt(i)) {
                case 'M' : num=1000; break;
                case 'D' : num=500; break;
                case 'C' : num=100; break;
                case 'L' : num=50; break;
                case 'X' : num=10; break;
                case 'V' : num=5; break;
                case 'I' : num=1; break;
            }
            if (num<prev)
                sum-=num;
            else
                sum+=num;

            prev=num;
        }
        return sum;
    }
}
