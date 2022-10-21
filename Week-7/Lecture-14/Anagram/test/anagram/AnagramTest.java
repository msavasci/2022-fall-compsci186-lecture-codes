package anagram;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnagramTest {
    @Test
    public void testLocationEquals() {
        assertEquals(new String("aaabnn"), AnagramFinderSet.alphabetized("banana"));
    }  
}
