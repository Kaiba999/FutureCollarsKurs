package com.futurecollars.lesson7.ex4;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.Assertions;

import java.util.stream.Stream;

public class TextServiceTest {


    @ParameterizedTest
    @MethodSource("provideStringsForTextService")
    public void shouldReturnTextLenght(String input, int output) {
        //given
        TextService textService = new TextService();
        //when
        int result = textService.geTextLength(input);
        //then
        Assertions.assertEquals(output, result);
    }

    private static Stream<Arguments> provideStringsForTextService() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("dragon", 6),
                Arguments.of("dragon", 5),
                );
    }
}
