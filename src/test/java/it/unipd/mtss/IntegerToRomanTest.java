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
  @Test
  public void testFirst10Numbers() { 
    String[] expected = {"VII", "VIII", "IX", "X"};
    for (int i = 1; i <= 4; i++) {
      String result = IntegerToRoman.convert(i+6);
      assertEquals(expected[i - 1], result);
    }
  }
	@Test
	public void testFirst20Numbers() { 
		String result11 = IntegerToRoman.convert(11);
		String result13 = IntegerToRoman.convert(13);
		String result16 = IntegerToRoman.convert(16);
		String result18 = IntegerToRoman.convert(18);
		String result20 = IntegerToRoman.convert(20);	
		assertEquals("XI", result11);
		assertEquals("XIII", result13);
		assertEquals("XVI", result16);
		assertEquals("XVIII", result18);
		assertEquals("XX", result20);
	}
}
