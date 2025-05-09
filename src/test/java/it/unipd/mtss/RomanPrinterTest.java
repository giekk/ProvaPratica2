////////////////////////////////////////////////////////////////////
// [Giacomo Toso] [1235002]
// [Eleonora Bilinski] [2109806]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest 
{
  @Test
  public void testFirst3Numbers() {
    String[] I = {
        " ______ ",
        "|_    _|",
        "  |  |  ",
        "  |  |  ",
        " _|  |_ ",
        "|______|"  
    };
    String[] II = new String[I.length];
    String[] III = new String[I.length];
        
    for (int j = 0; j < I.length; j++) {
      II[j] = I[j] + I[j];         // Concatenazione orizzontale per II
      III[j] = I[j] + I[j] + I[j]; // Concatenazione orizzontale per III
    }
        
    String IString = String.join("\n", I);
    String IIString = String.join("\n", II);
    String IIIString = String.join("\n", III);

    String value_I = RomanPrinter.print(1);
    String value_II = RomanPrinter.print(2);
    String value_III = RomanPrinter.print(3);

    assertEquals(IString, value_I);
    assertEquals(IIString, value_II);
    assertEquals(IIIString, value_III);
  }
}
