package pkg1;

public final class SingleTon extends MyClone {
    private static SingleTon t1;

    private SingleTon() {
        if (t1 != null) {
           throw new RuntimeException("Can not be created..");
        }
    }

    public static SingleTon getInstance() {
        if (t1 == null) {
            //synchronized (t1) {
                if (t1 == null) {
                    t1 = new SingleTon();
                }
            //}
        }
        return t1;
    }

    @Override
    protected SingleTon clone() throws CloneNotSupportedException {
        return SingleTon.getInstance();
    }
}