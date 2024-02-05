package src.pkg1;

import java.util.Date;

public final class ImmutableDemo {

    private final int id;
    private final String name;
    private final Date doj;


    public ImmutableDemo(int id, String name, Date doj) {
        this.id = id;
        this.name = name;
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "ImmutableDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doj=" + doj +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {
        return new Date(doj.getDate());
    }
}

class Client {
    public static void main(String[] args) {
        ImmutableDemo iid = new ImmutableDemo(1, "p", new Date());
        System.out.println(iid);

        iid.getDoj().setDate(24);

        System.out.println(iid);
    }
}
