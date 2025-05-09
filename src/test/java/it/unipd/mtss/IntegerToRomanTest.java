////////////////////////////////////////////////////////////////////
// [Giacomo Toso] [1235002]
// [Eleonora Bilinski] [2109806]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest 
{
  @Test(expected=IllegalArgumentException.class) // controllo se l'input è >0
    public void testNumberLessThanOneThrowsException() {
      IntegerToRoman.convert(0); // Numero inferiore a 1
      }
  @Test
  public void testFirst3Numbers() {
    String[] expected = {"I", "II", "III"};
    for (int i = 1; i <= 3; i++) {
      String result = IntegerToRoman.convert(i);
      assertEquals(expected[i - 1], result);
    }
  }
  @Test
  public void testFirst6Numbers() { 
    String[] expected = {"IV", "V", "VI"};
    for (int i = 1; i <= 3; i++) {
      String result = IntegerToRoman.convert(i+3);
      assertEquals(expected[i - 1], result);
    }
  }
}
