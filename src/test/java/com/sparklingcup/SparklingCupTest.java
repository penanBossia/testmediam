package com.sparklingcup;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SparklingCupTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 10) };
        SparklingCup.updateQuality(items);
        assertEquals(9, items[0].quality);
    }
}