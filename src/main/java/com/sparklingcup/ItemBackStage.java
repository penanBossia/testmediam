package com.sparklingcup;

public class ItemBackStage extends Item {
    public ItemBackStage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (sellIn > 10) {
            quality++;
        } else if (sellIn > 6) {
            quality += 2;
        } else if (sellIn >= 0) {
            quality += 3;
        } else {
            quality = 0;
        }
        sellIn--;
    }
}
