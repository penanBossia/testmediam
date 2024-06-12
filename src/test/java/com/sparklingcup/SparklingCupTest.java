package com.sparklingcup;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SparklingCupTest {
    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 10) };
        // SparklingCup app = new SparklingCup(items);
        SparklingCup.updateQuality(items);
        assertEquals(9, items[0].quality);
    }
}