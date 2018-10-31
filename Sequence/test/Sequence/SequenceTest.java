package Sequence;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceTest {

    @DisplayName("Sequence_from_first_number_0_length_4")
    @Test
    void getSequenceArrWith0firstNumber() throws MyException {
        Sequence seq = new Sequence();
        seq.SetLength("4");
        seq.SetFirstNumber("0");
        int[] expected = {0, 1, 2, 3};
        int[] actual = seq.getSequenceArr();
        assertArrayEquals(expected, actual);
    }
    @DisplayName("Sequence_from_m=-10_length=10")
    @Test
    void getSequenceArrWithMminus10Length10() throws MyException {
        Sequence seq = new Sequence();
        seq.SetLength("10");
        seq.SetFirstNumber("-10");
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actual = seq.getSequenceArr();
        assertArrayEquals(expected, actual);
    }

    @DisplayName("Sequence_from_first_number_2147483647_length_2")
    @Test
    void getSequenceArrWithM2147483647() throws MyException {
        Sequence seq = new Sequence();
        seq.SetLength("2");
        seq.SetFirstNumber("2147483647");
        int[] expected = {46340, 46341};
        int[] actual = seq.getSequenceArr();
        assertArrayEquals(expected, actual);
    }
    @DisplayName("First_number_with_m={5,6,7,8,9}")
    @ParameterizedTest
    @ValueSource (ints = {5,6,7,8,9})
    void getSSequenceArrWithLengthAnd1AndFrom5to9(Integer number)throws MyException {
        Sequence seq = new Sequence();
        seq.SetLength("1");
        seq.SetFirstNumber("number");
        int[] expected = {3};
        int[] actual = seq.getSequenceArr();
        assertArrayEquals(expected, actual);
    }
}