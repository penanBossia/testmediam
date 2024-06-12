package com.sparklingcup;

public class ItemConjured extends Item {
    public ItemConjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        quality -= 2;
        sellIn--;
    }
}
