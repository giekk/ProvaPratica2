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
	@Test
	public void testFirst50Numbers() { 
		String result21 = IntegerToRoman.convert(21);
		String result27 = IntegerToRoman.convert(27);
		String result35 = IntegerToRoman.convert(35);
		String result49 = IntegerToRoman.convert(49);
		String result50 = IntegerToRoman.convert(50);	
		assertEquals("XXI", result21);
		assertEquals("XXVII", result27);
		assertEquals("XXXV", result35);
		assertEquals("XLIX", result49);
		assertEquals("L", result50);
	}
  @Test
	public void testFirst100Numbers() { 
		String result51 = IntegerToRoman.convert(51);
		String result63 = IntegerToRoman.convert(63);
		String result79 = IntegerToRoman.convert(79);
		String result84 = IntegerToRoman.convert(84);
		String result100 = IntegerToRoman.convert(100);	
		assertEquals("LI", result51);
		assertEquals("LXIII", result63);
		assertEquals("LXXIX", result79);
		assertEquals("LXXXIV", result84);
		assertEquals("C", result100);
	}
	@Test
	public void testFirst500Numbers() { 
		String result101 = IntegerToRoman.convert(101);
		String result199 = IntegerToRoman.convert(199);
		String result249 = IntegerToRoman.convert(249);
		String result399 = IntegerToRoman.convert(399);
		String result500 = IntegerToRoman.convert(500);	
		assertEquals("CI", result101);
		assertEquals("CXCIX", result199);
		assertEquals("CCXLIX", result249);
		assertEquals("CCCXCIX", result399);
		assertEquals("D", result500);
	}
	@Test 
	public void testFirst1000Numbers() { 
		String result501 = IntegerToRoman.convert(501);
		String result699 = IntegerToRoman.convert(699);
		String result749 = IntegerToRoman.convert(749);
		String result999 = IntegerToRoman.convert(999);
		String result1000 = IntegerToRoman.convert(1000);	
		assertEquals("DI", result501);
		assertEquals("DCXCIX", result699);
		assertEquals("DCCXLIX", result749);
		assertEquals("CMXCIX", result999);
		assertEquals("M", result1000);
	}
	@Test(expected=IllegalArgumentException.class)
    public void testNumberMoreThan1000() {
      IntegerToRoman.convert(1001); // Numero superiore a 1000
	}
}
