public class Stats<T extends Comparable<T>> {
    public final T min;
    public final T max;

    public Stats(T min, T max) {
        this.min = min;
        this.max = max;
    }
}
