package ro.itschool.curs19.searching;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchAlgoTest {
    private static Stream<Arguments> searchAlgos() {
        return Stream.of(
                Arguments.of(new LinearSearch()),
                Arguments.of(new BinarySearch())
//                ,Arguments.of(new JumpSearch())
        );
    }

    @ParameterizedTest
    @MethodSource("searchAlgos")
    @DisplayName("existing element")
    void existingElement(SearchAlgo searchAlgo) {
        assertTrue(searchAlgo.search(new int[]{1, 2, 3, 4, 5, 6}, 6));
    }

    @ParameterizedTest
    @MethodSource("searchAlgos")
    @DisplayName("nonexisting element")
    void nonExistingElement(SearchAlgo searchAlgo) {
        assertFalse(searchAlgo.search(new int[]{1, 2, 3, 4, 5, 6}, 86));
    }

    @ParameterizedTest
    @MethodSource("searchAlgos")
    @DisplayName("null array")
    void nullArray(SearchAlgo searchAlgo) {
        assertFalse(searchAlgo.search(null, 86));
    }

    @ParameterizedTest
    @MethodSource("searchAlgos")
    @DisplayName("empty array")
    void emptyArray(SearchAlgo searchAlgo) {
        assertFalse(searchAlgo.search(new int[]{}, 86));
    }

    @ParameterizedTest
    @MethodSource("searchAlgos")
    @DisplayName("single element array existing")
    void singleElementArrayExisting(SearchAlgo searchAlgo) {
        assertFalse(searchAlgo.search(new int[]{86}, 86));
    }

    @ParameterizedTest
    @MethodSource("searchAlgos")
    @DisplayName("single element array not existing")
    void singleElementArrayNotExisting(SearchAlgo searchAlgo) {
        assertFalse(searchAlgo.search(new int[]{8}, 86));
    }
}