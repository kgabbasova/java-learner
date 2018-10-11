import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private double[] fraction;
    final private int times;
    private double stMean;
    private double stDev;

    // perform trials independent experiments on an n-by-n grid
    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) {
            throw new IllegalArgumentException();
        }
        fraction = new double[trials];
        times = trials;
        for (int i = 0; i < trials; i++) {
            Percolation p = new Percolation(n);
            while (!p.percolates()) {
                int row = StdRandom.uniform(n);
                int col = StdRandom.uniform(n);
                p.open(row + 1, col + 1);
            }
            fraction[i] = (double) p.numberOfOpenSites() / (n * n);
//            System.out.print(fraction[i]+ " ");
        }

    }

    // sample mean of percolation threshold
    public double mean() {
        stMean = StdStats.mean(fraction);
        return stMean;
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        stDev = StdStats.stddev(fraction);
        return stDev;
    }

    // low  endpoint of 95% confidence interval
    public double confidenceLo() {
        return (stMean - 1.96 * stDev / Math.sqrt(times));
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        return (stMean + 1.96 * stDev / Math.sqrt(times));
    }

    // test client (described below)
    public static void main(String[] args) {
//        PercolationStats ps = new PercolationStats(200, 100);
//        System.out.println(ps.mean());
//        System.out.println(ps.stddev());
//        System.out.println(ps.confidenceHi());
//        System.out.println(ps.confidenceLo());
    }
//}
}

