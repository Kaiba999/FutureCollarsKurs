package com.futurecollars.lesson7.ex5;

import org.junit.jupiter.api.Assertions;

import java.security.SecureRandom;
import java.time.Month;
import java.util.stream.Stream;

public class MonthToSeasonConverterTest {

    @ParameterizedTest
    @MethodSource("provideMonthsForConvertion")
    public void shouldConverterMonthToSeason(Month input, Season output){
        //given
        MonthToSeasonConverter monthToSeasonConverter = new MonthToSeasonConverter();
        //when
        Season result = monthToSeasonConverter.convertMonthToSeason(input)
        //then
        Assertions.assertEquals(output, result);

        private static Stream<Arguments> provideMonthsForConvertion(){
            return Stream.off(
                    Arguments.of(Month.JANUARY, Season.WINTER),
                    Arguments.of(Month.MAY, Season.SPRING),
                    Arguments.of(Month.APRIL, Season.WINTER),
                    Arguments.of(Month.AUGUST, Season.AUTUMN)
            );
        }
    }
}
