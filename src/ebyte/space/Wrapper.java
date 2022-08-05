package ebyte.space;

import java.util.Collection;
import java.util.Iterator;

public class Wrapper<T extends Collection<Integer>> implements Iterable<Integer> {
    private T item;

    public Wrapper() {}
    public Wrapper(T item) {
        this.item = item;
    }

    public boolean add(Integer num) {
        return item.add(num);
    }

    @Override
    public Iterator<Integer> iterator() {
        return item.iterator();
    }
}
