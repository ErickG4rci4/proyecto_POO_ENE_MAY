import java.lang.*;
import java.util.*;

class NameComparator implements Comparator<Instrumentos> {
    
    public int compare(Instrumentos x, Instrumentos y) {
        return x.getNombre().compareTo(y.getNombre());
    }
}