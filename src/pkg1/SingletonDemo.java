package src.pkg1;

import src.pkg1.SingleTon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDemo {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingleTon t1= SingleTon.getInstance();

        SingleTon t2 = t1.clone();

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());

        Constructor<?>[] declaredConstructors = t1.getClass().getDeclaredConstructors();
        SingleTon t3 = null;
        for (Constructor c:declaredConstructors) {
            c.setAccessible(true);
            t3= (SingleTon) c.newInstance();
        }

        assert t3 != null;
        System.out.println(t3.hashCode());


    }
}
