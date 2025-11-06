import java.util.*;

public class Cache<T> {
    private final int ready;
    private final List<T> cache;

    public Cache(int p) {
        this.ready = p;
        this.cache = new ArrayList<>();
    }

    public void add(T item) {
        if (cache.size() >= ready) {
            cache.remove(0);
        }
        cache.add(item);
    }

    public boolean remove(T item) {
        return cache.remove(item);
    }

    public boolean exists(T item) {
        return cache.contains(item);
    }

    public T getFirst() {
        if (cache.isEmpty()) {
            return null;
        }

        return cache.get(0);
    }

    public T getLast() {
        if (cache.isEmpty()) {
            return null;
        }
        return cache.get(cache.size() - 1);
    }

    public T getItemByIndex(int i) {
        if (i < 0 || i >= cache.size()) {
            return null;
        }
        return cache.get(i);
    }

    @Override
    public String toString() {
        return cache.toString();
    }
}