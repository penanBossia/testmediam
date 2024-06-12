package com.sparklingcup;

public class Item {
    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality() {
        int tempQuality = sellIn >= 0 ? quality - 1 : quality - 2;
        quality = Math.max(tempQuality, 0);
        this.sellIn--;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
