package src.pkg1;

import java.util.Arrays;
import java.util.List;

final class Multiton {
    private static int COUNTER = 0;
    private static final List<Multiton> INSTANCES = Arrays.asList(new Multiton(), 
            new Multiton(), new Multiton());

    private Multiton() {}

    public static Multiton getInstance() {
        return INSTANCES.get(COUNTER++%INSTANCES.size());
    }
}
