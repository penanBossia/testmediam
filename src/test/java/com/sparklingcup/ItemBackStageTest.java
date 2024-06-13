package com.sparklingcup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemBackStageTest {

    private static Stream<Arguments> itemsPropsAndResults() {
        return Stream.of(
                Arguments.of(13, 10, List.of(11, 12)),
                Arguments.of(13, 10, List.of(11, 12, 14, 16)),
                Arguments.of(6, 10, List.of(13, 16, 19, 22, 25, 28, 0))
        );
    }

    @ParameterizedTest
    @MethodSource("itemsPropsAndResults")
    void updateQualityDayAfterDay(int sellInStart, int qualityStart, List<Integer> qualityValues) {
        final Item item = new ItemBackStage("BackStageItem", sellInStart, qualityStart);
        for (int i = 0; i < qualityValues.size(); i++) {
            item.updateQuality();
            assertEquals(sellInStart - i - 1, item.sellIn);
            assertEquals(qualityValues.get(i), item.quality);
        }
    }
}