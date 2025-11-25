
package com.exemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SplitSentenceTest {
    @Test
    void testSplit() {
        String[] parts = SplitSentence.split("Olá, Mundo");
        assertEquals("Olá", parts[0]);
        assertEquals("Mundo", parts[1]);
    }
}
