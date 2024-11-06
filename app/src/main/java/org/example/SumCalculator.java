class SumCalculator {

    public int sum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
