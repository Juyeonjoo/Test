package access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();

        int count = counter.getCount();

        System.out.println("1: " + count);

        counter.increment();
        counter.increment();
        count = counter.getCount();
        System.out.println("3: " +count);

        counter.increment();
        count = counter.getCount();
        System.out.println("4: " + count);
    }
}
