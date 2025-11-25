
package com.exemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DNATest {

    @Test
    void testResistente() {
        assertTrue(DNA.isResistente("ACGTACGT", "CGT"));
    }

    @Test
    void testNaoResistente() {
        assertFalse(DNA.isResistente("AAAA", "CG"));
    }
}
