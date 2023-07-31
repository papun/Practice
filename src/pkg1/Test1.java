package pkg1;

import java.util.*;


public interface Test1 {
    String show()  ;
    String show1()  ;

    default String print(){
        return "Asd";
    }

    static String print1(){
        return "sad";
    }
}


class Test2 implements Test1{


    @Override
    public String show() {
        return null;
    }

    @Override
    public String show1() {
        Test1.print1();
        return null;
    }

//    @Override
//    public String print() {
//        return Test1.super.print();
//    }

    public static void main(String[] args) {
        List<String> list =
                Collections.synchronizedList(new ArrayList<String>());

        list.add("practice");
        list.add("code");
        list.add("quiz");

        synchronized(list)
        {
            // must be in synchronized block
            Iterator it = list.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
it.remove();
            }
            list.forEach(System.out::println);
        }
    }

}
