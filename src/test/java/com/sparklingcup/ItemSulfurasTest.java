package com.sparklingcup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemSulfurasTest {

    private static Stream<Arguments> itemsPropsAndResults() {
        return Stream.of(
                Arguments.of(List.of(80, 80)),
                Arguments.of(List.of(80, 80, 80, 80))
        );
    }

    @ParameterizedTest
    @MethodSource("itemsPropsAndResults")
    void updateQualityDayAfterDay(List<Integer> qualityValues) {
        final Item item = new ItemSulfuras("SulfurasItem");
        for (Integer qualityValue : qualityValues) {
            item.updateQuality();
            assertEquals(Integer.MAX_VALUE, item.sellIn);
            assertEquals(qualityValue, item.quality);
        }
    }
}