package insertionsort;

import static org.junit.Assert.assertArrayEquals;


import org.junit.Test;

public class InsertionTest {
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1,3,5,7}, InsertionSort.sort(new int[]{3,7,5,1}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,2,3,4}, InsertionSort.sort(new int[]{2,1,4,3}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{0,3,6,9,12}, InsertionSort.sort(new int[]{12,6,3,9,0}));
    }
}