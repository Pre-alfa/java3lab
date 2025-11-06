public class CacheTest {
    public static void main(String[] args) {
        Cache<String> cache = new Cache<>(3);

        cache.add("first");
        cache.add("second");
        cache.add("third");
        System.out.println("all elements " + cache);

        cache.add("fourth");
        System.out.println("after apload 4: " + cache);

        System.out.println("Check for availability: " + cache.exists("third"));

        cache.remove("third");
        System.out.println("Remove third ?" + cache);

        cache.add("second");
        System.out.println("Returned it second " + cache);

        System.out.println("first elements " + cache.getFirst());

        System.out.println("last elements  " + cache.getLast());

        System.out.println("second elements " + cache.getItemByIndex(2));
        System.out.println("third elements" + cache.getItemByIndex(3));
        System.out.println("fifth elements " + cache.getItemByIndex(5));
    }
}