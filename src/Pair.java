import java.util.function.Function;

public class Pair<T, V> {
    private final T first;
    private final V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public String toString(){
        return "["+getFirst()+", "+getSecond()+"]";
    }

}
