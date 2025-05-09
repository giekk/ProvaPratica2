////////////////////////////////////////////////////////////////////
// [Giacomo Toso] [1235002]
// [Eleonora Bilinski] [2109806]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest 
{
  @Test(expected=IllegalArgumentException.class) //controllo che l'input sia>0
    public void testNumberLessThanOneThrowsException() {
      {
        RomanPrinter.print(0); // Numero inferiore a 1
      }
    }

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
  
  @Test
  public void testFirst6Numbers() {
    String[] I = {
      " ______ ",
      "|_    _|",
      "  |  |  ",
      "  |  |  ",
      " _|  |_ ",
      "|______|"  
    };
    String[] V = {
      "___     ___",
      "\\  \\   /  /",
      " \\  \\ /  / ",
      "  \\     /  ",
      "   \\   /   ",
      "    \\_/    "
    };
       
    String[] IV = new String[I.length];
    String[] VI = new String[I.length];

    for (int j = 0; j < I.length; j++) {
        IV[j] = I[j] + V[j];         // Concatenazione orizzontale per IV
        VI[j] = V[j] + I[j];         // Concatenazione orizzontale per VI
    }

    String IVString = String.join("\n", IV);
    String VString = String.join("\n", V);
    String VIString = String.join("\n", VI);

    String value_IV = RomanPrinter.print(4);
    String value_V = RomanPrinter.print(5);
    String value_VI = RomanPrinter.print(6);

    assertEquals(IVString, RomanPrinter.print(4));
    assertEquals(VString, RomanPrinter.print(5));
    assertEquals(VIString, RomanPrinter.print(6));
  }

  @Test
  public void testFirst10Numbers() {
      String[] I = {
          " ______ ",
          "|_    _|",
          "  |  |  ",
          "  |  |  ",
          " _|  |_ ",
          "|______|"  
        };

      String[] V = {
            "___     ___",
            "\\  \\   /  /",
            " \\  \\ /  / ",
            "  \\     /  ",
            "   \\   /   ",
            "    \\_/    "
      };

      String[] X = {
            "___   ___",
            "\\  \\ /  /",
            " \\  V  / ",
            "  >   <  ",
            " /  ^  \\ ",
            "/__/ \\__\\"
      };

      String[] VII = new String[I.length];
      String[] VIII = new String[I.length];
      String[] IX = new String[I.length];

      for (int j = 0; j < I.length; j++) {
          VII[j] = V[j] + I[j] + I[j];         // Concatenazione orizzontale per VII
          VIII[j] = V[j] + I[j] + I[j] + I[j]; // Concatenazione orizzontale per VIII
          IX[j] = I[j] + X[j];                 // Concatenazione orizzontale per IX
      }

      String VIIString = String.join("\n", VII);
      String VIIIString = String.join("\n", VIII);
      String IXString = String.join("\n", IX);
      String XString = String.join("\n", X);
  }
}
