public class Maximizer<T extends Comparable<T>> implements Comparable<Maximizer<T>> {
    private T maxSoFar;

    public Maximizer() {
        maxSoFar = null;
    }

    public T getValue() {
        return maxSoFar;
    }

    public void updateValue(T newMax) {
        if (maxSoFar == null) {
            maxSoFar = newMax;
            return;
        }
        if (newMax.compareTo(maxSoFar) > 0) {
            maxSoFar = newMax;
        }
    }

    @Override
    public int compareTo(Maximizer<T> o) {
        return 0;
    }

    public static void main(String[] args) {
        Maximizer<String> strMaximizer = new Maximizer<>();
        strMaximizer.updateValue("a");
        strMaximizer.updateValue("z");
        strMaximizer.updateValue("m");
        String maxStr = strMaximizer.getValue();
        System.out.println(maxStr);

        Maximizer<Integer> intMaximizer = new Maximizer<>();
        intMaximizer.updateValue(-22);
        intMaximizer.updateValue(10000);
        intMaximizer.updateValue(33);
        Integer maxInt = intMaximizer.getValue();
        System.out.println(maxInt);
    }
}
