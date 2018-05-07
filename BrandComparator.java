import java.lang.*;
import java.util.*;

class BrandComparator implements Comparator<Instrumentos> {
    @Override
    public int compare(Instrumentos x, Instrumentos y) {
        Comparable id1 = (Comparable)(x.getMarca());
        Comparable id2 = (Comparable)(y.getMarca());
        return id1.compareTo(id2);
    }
}