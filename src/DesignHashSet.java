import java.util.ArrayList;
import java.util.List;

class MyHashSet {
    private final List<Integer> hash;
    private int key_index = 0;

    public MyHashSet() {
        hash = new ArrayList<>();
    }

    public void add(int key) {
        if (!contains(key)) hash.add(key);
    }

    public void remove(int key) {
        if (contains(key)) {
            hash.remove(key_index);
        }
    }

    public boolean contains(int key) {
        if (hash.contains(key)){
            int i = 0;
            while (i < hash.size()) {
                if (hash.get(i) == key) {
                    key_index = i;
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}

public class DesignHashSet {
}
