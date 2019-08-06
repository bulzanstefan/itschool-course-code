package ro.itschool.curs19.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortingAlgoTest {
    private static Stream<Arguments> sortAlgos() {
        return Stream.of(
                Arguments.of(new BubbleSort()),
                Arguments.of(new SelectSort()));
    }

    @DisplayName("Simple array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void simpleArray(SortingAlgo sortAlgo) {
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4}, sortAlgo.sort(new int[]{3, 4, 2, 1})));
    }

    @DisplayName("Null array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void nullArray(SortingAlgo sortAlgo) {
        assertTrue(Arrays.equals(null, sortAlgo.sort(null)));
    }

    @DisplayName("Single element array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void singleElement(SortingAlgo sortAlgo) {
        assertTrue(Arrays.equals(new int[]{3}, sortAlgo.sort(new int[]{3})));
    }

    @DisplayName("Empty array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void emptyArray(SortingAlgo sortAlgo) {
        assertTrue(Arrays.equals(new int[]{}, sortAlgo.sort(new int[]{})));
    }

    @DisplayName("Already sorted array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void alreadySortedArray(SortingAlgo sortAlgo) {
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5}, sortAlgo.sort(new int[]{1, 2, 3, 4, 5})));
    }

}