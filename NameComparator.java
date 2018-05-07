import java.lang.*;
import java.util.*;

class NameComparator implements Comparator<Instrumentos> {
    @Override
    public int compare(Instrumentos x, Instrumentos y) {
        Comparable id1 = (Comparable)(x.getNombre());
        Comparable id2 = (Comparable)(y.getNombre());
        return id1.compareTo(id2);
    }
}