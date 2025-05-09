////////////////////////////////////////////////////////////////////
// [Giacomo Toso] [1235002]
// [Eleonora Bilinski] [2109806]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;

public class RomanPrinter 
{
  public static String print(int num)
  {
    return printAsciiArt(IntegerToRoman.convert(num));
    }

    public static String printAsciiArt(String romanNumber)
    {
        if (romanNumber == null || romanNumber == "") { return ""; }

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

    HashMap<Character, String[]> romanArt = new HashMap<>();
    romanArt.put('I', I);
    romanArt.put('V', V);
    romanArt.put('X', X);

    String[] res = new String[I.length];

    for (int i = 0; i < I.length; i++) {
      res[i] = "";
    }

    for (int i = 0; i < romanNumber.length(); i++) {
      for (int j = 0; j < I.length; j++) {
        res[j] = res[j] + romanArt.get(romanNumber.charAt(i))[j];
      }
        }

    String result = String.join("\n", res);

    return result;
  }  
}
