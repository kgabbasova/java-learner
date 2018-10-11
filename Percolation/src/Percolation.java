
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private boolean[][] grid;
    private WeightedQuickUnionUF gridSites;
    private int size;
    private int top = 0;
    private int bottom;

    // create n-by-n grid, with all sites blocked
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        size = n;
        bottom = n * n + 1;
        gridSites = new WeightedQuickUnionUF(n * n + 2);
        grid = new boolean[n][n];
    }

    // open site (row, col) if it is not open already
    public void open(int row, int col) {
        if (row > size || row < 1 || col > size || col < 1) {
            throw new IllegalArgumentException();
        }
        grid[row - 1][col - 1] = true;
        if (row == 1) {
            gridSites.union(toIndex(row, col), top);
        } else if (isOpen(row - 1, col)) {
            gridSites.union(toIndex(row, col), toIndex(row - 1, col));
        }
        if (row == size) {
            gridSites.union(toIndex(row, col), bottom);
        } else if (isOpen(row + 1, col)) {
            gridSites.union(toIndex(row, col), toIndex(row + 1, col));
        }
        if (col > 1 && isOpen(row, col - 1)) {
            gridSites.union(toIndex(row, col), toIndex(row, col - 1));
        }
        if (col < size && isOpen(row, col + 1)) {
            gridSites.union(toIndex(row, col), toIndex(row, col + 1));
        }
    }

    // is site (row, col) open?
    public boolean isOpen(int row, int col) {
        if (row > size || row < 1 || col > size || col < 1) {
            throw new IllegalArgumentException();
        }
        return grid[row - 1][col - 1];
    }


    // is site (row, col) full?
    public boolean isFull(int row, int col) {
        if (row > size || row < 1 || col > size || col < 1) {
            throw new IllegalArgumentException();
        }
        return gridSites.connected(top, toIndex(row, col));
    }

    // number of open sites
    public int numberOfOpenSites() {
        int k = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j]) {
                    k++;
                }
            }
        }
        return k;
    }


    // does the system percolate?
    public boolean percolates() {
        return gridSites.connected(top, bottom);
    }

    private int toIndex(int i, int j) {
        return (size * (i - 1) + j);
    }

    // test client (optional)
    public static void main(String[] args) {
//        Percolation p = new Percolation(4);
////        System.out.println(p.isOpen(4, 4));
//        p.open(4, 4);
////        System.out.println(p.isOpen(4, 4));
////        System.out.println(p.numberOfOpenSites());
//        p.open(4, 3);
//        p.open(3, 3);
//        p.open(2, 3);
//        p.open(2, 4);
//        p.open(1, 4);
//        System.out.println(p.numberOfOpenSites());
//        System.out.println(p.isFull(3, 3));
//        System.out.println(p.percolates());
    }
}

