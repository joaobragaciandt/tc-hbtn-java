import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] ints) {
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i : ints) {
            if (!hashSet.add(i)) {
                treeSet.add(i);
            }
        }

        return treeSet;

    }
}
