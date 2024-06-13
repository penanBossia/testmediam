package com.sparklingcup;

public class ItemConjured extends Item {
    public ItemConjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        sellIn--;

        int tempQuality = sellIn >= 0 ? quality - 2 : quality - 4;
        quality = Math.max(tempQuality, 0);
    }
}
