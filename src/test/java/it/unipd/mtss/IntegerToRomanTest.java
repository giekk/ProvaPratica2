////////////////////////////////////////////////////////////////////
// [Giacomo Toso] [1235002]
// [Eleonora Bilinski] [2109806]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest 
{
  @Test
  public void testFirst3Numbers() {
    String[] expected = {"I", "II", "III"};
    for (int i = 1; i <= 3; i++) {
      String result = IntegerToRoman.convert(i);
        assertEquals(expected[i - 1], result);
    }
  }
}
