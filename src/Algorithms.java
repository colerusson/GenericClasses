public class Algorithms {
    public static <T extends Comparable<T>> Stats<T> calcStats(T[] arr) {
        T min = arr[0];
        T max = arr[0];
        for (T element : arr) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return new Stats<>(min, max);
    }

    public static void main(String[] args) {
        String[] strArr = new String[] { "z", "a", "m" };
        Stats<String> strStats = Algorithms.calcStats(strArr);
        System.out.printf("min: %s, max: %s%n",
                strStats.min, strStats.max);

        Integer[] intArr = new Integer[] { 10000, 33, -22 };
        Stats<Integer> intStats = Algorithms.calcStats(intArr);
        System.out.printf("min: %d, max: %d%n", intStats.min, intStats.max);
    }
}
