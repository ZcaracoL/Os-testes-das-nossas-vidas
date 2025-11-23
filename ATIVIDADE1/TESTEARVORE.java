
package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChristmasTreeTest {
    @Test
    void testValid() {
        assertTrue(ChristmasTree.buildTree(5).contains("***"));
    }
}
