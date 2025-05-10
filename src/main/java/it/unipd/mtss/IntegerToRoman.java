////////////////////////////////////////////////////////////////////
// [Giacomo Toso] [1235002]
// [Eleonora Bilinski] [2109806]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman 
{
  public static String convert(int number)
  {
    if (number < 1 || number > 1000) {
    throw new IllegalArgumentException("Number out of range (1-1000)");
  }

  String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
  int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

  StringBuilder result = new StringBuilder();

  for (int i = 0; i < values.length; i++) {
    while (number >= values[i]) {
      result.append(romanNumerals[i]);
        number -= values[i];
    }
  }     
    return result.toString();
  }
}
