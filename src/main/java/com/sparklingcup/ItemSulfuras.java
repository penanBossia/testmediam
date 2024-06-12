package com.sparklingcup;

public class ItemSulfuras extends Item {
    public ItemSulfuras(String name) {
        super(name, Integer.MAX_VALUE, 80);
    }

    @Override
    public void updateQuality() {
        // do nothing
    }
}
