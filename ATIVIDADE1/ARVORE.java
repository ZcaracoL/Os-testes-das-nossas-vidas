
package com.exemplo;

public class ChristmasTree {
    public static String buildTree(int n) {
        if (n % 2 == 0) throw new IllegalArgumentException("N must be odd");
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i -= 2) sb.append("*".repeat(i)).append("\n");
        sb.append("***\n*\n\n");
        return sb.toString();
    }
}
