import java.lang.*;
import java.util.*;

class BrandComparator implements Comparator<Instrumentos> {
    
    public int compare(Instrumentos x, Instrumentos y) {
        return x.getMarca().compareTo(y.getMarca());
    }
}