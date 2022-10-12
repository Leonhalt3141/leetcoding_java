import java.util.Arrays;

class MyHashMap {

    int[] values;

    public MyHashMap() {
        values = new int[(int) Math.pow(10, 6) + 1];
        Arrays.fill(values, -1);
    }

    public void put(int key, int value) {
        values[key] = value;
    }

    public int get(int key) {
        return values[key];
    }

    public void remove(int key) {
        values[key] = -1;
    }
}

public class DesignHashMap {
}
