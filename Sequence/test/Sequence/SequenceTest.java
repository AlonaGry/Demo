package Sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;

class SequenceTest {

    @Test
    void getSequenceArrWith0firstNumber() {
        Sequence seq = new Sequence();
        int[] arr = new int[4];
        int firstNumber = 0;
        for (int i = 0; i < 4; i++) {

            arr[i] = firstNumber + i;
        }
        int[] expected = {0, 1, 2, 3};
        int[] actual = arr;
        assertArrayEquals(expected, actual);
    }

    @Test
    void getSequenceArrWithMminus10Length10() {
        Sequence seq = new Sequence();
        int[] arr = new int[10];
        int firstNumber = (int) Math.sqrt(-10);
        for (int i = 0; i < 10; i++) {

            arr[i] = firstNumber + i;
        }
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actual = arr;
        assertArrayEquals(expected, actual);
    }

    @Test
    void getSequenceArrWithM2147483647() {
        Sequence seq = new Sequence();
        int[] arr = new int[2];
        int firstNumber = (int) Math.sqrt(2147483647);
        for (int i = 0; i < 2; i++) {

            arr[i] = firstNumber + i;
        }
        int[] expected = {46340, 46341};
        int[] actual = arr;
        assertArrayEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource (ints = {5,6,7,8,9})
    void getSSequenceArrWithLengthAnd1AndFrom5to9(Integer number)throws SequenceException {
        Sequence seq = new Sequence();
        seq.SetLength("1");
        seq.SetFirstNumber("number");
        int[] expected = {3};
        int[] actual = seq.getSequenceArr();
        assertArrayEquals(expected, actual);
    }
}