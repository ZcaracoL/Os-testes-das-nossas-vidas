
package com.exemplo;

public class MessageCounter {
    public static int countLines(int limit, String msg) {
        int lines = 0, idx = 0;
        while (idx < msg.length()) {
            if (msg.charAt(idx) == ' ') idx++;
            else {
                lines++;
                idx += limit;
            }
        }
        return lines;
    }
}
