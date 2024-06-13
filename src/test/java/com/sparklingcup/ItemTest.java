package com.sparklingcup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {

    private static Stream<Arguments> itemsPropsAndResults() {
        return Stream.of(
                Arguments.of(2, 2, List.of(1, 0)),
                Arguments.of(2, 2, List.of(1, 0, 0)),
                Arguments.of(2, 6, List.of(5, 4, 2, 0, 0))
        );
    }

    @ParameterizedTest
    @MethodSource("itemsPropsAndResults")
    void updateQualityDayAfterDay(int sellInStart, int qualityStart, List<Integer> qualityValues) {
        final Item item = new Item("ClassicItem", sellInStart, qualityStart);
        for (int i = 0; i < qualityValues.size(); i++) {
            item.updateQuality();
            assertEquals(sellInStart - i - 1, item.sellIn);
            assertEquals(qualityValues.get(i), item.quality);
        }
    }
}