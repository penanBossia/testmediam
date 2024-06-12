package com.sparklingcup;

public class ItemAgedBrie extends Item {
    public ItemAgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        int tempQuality = quality + 1;
        quality = Math.min(50, tempQuality);
        sellIn--;
    }
}
