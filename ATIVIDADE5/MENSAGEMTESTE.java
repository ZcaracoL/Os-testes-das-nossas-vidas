
package com.exemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MessageCounterTest {
    @Test
    void testSimple() {
        assertEquals(2, MessageCounter.countLines(5, "123456789"));
    }
}
