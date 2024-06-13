package com.sparklingcup;

import java.util.stream.Stream;

public class SparklingCup {

    Item[] items;

    public SparklingCup(Item[] items) {
        this.items = items;
    }

    public static void updateQuality(Item[] items) {
        Stream.of(items).forEach(Item::updateQuality);
    }
}