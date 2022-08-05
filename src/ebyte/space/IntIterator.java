package ebyte.space;

import java.util.Iterator;

public class IntIterator implements Iterator<Integer> {
    private final int[] array;
    private int index = 0;

    public IntIterator(int[] array) {
        this.array = array;
    }

    public boolean hasNext() {
        return index < array.length;
    }

    public Integer next() {
        return array[index++];
    }


}
