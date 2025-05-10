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

      String value_VII = RomanPrinter.print(7);
      String value_VIII = RomanPrinter.print(8);
      String value_IX = RomanPrinter.print(9);
      String value_X = RomanPrinter.print(10);

    assertEquals(VIIString, value_VII);
    assertEquals(VIIIString, value_VIII);
    assertEquals(IXString, value_IX);
    assertEquals(XString, value_X);
  }
	@Test
	public void testFirst20Numbers() { 
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
			String[] XI = new String[I.length];
			String[] XIII = new String[I.length];
			String[] XVI = new String[I.length];
			String[] XVIII = new String[I.length];
			String[] XX = new String[I.length];

			for (int j = 0; j < I.length; j++) {
				XI[j] = X[j] + I[j];         
				XIII[j] = X[j] + I[j] + I[j] + I[j]; 
				XVI[j] = X[j] + V[j] + I[j];      
				XVIII[j] = X[j] + V[j] + I[j] + I[j] + I[j]; 
				XX[j] = X[j] + X[j];                
			}		

			String XIString = String.join("\n", XI);
			String XIIIString = String.join("\n", XIII);
			String XVIString = String.join("\n", XVI);
			String XVIIIString = String.join("\n", XVIII);	
			String XXString = String.join("\n", XX);

      String value_XI = RomanPrinter.print(11);
      String value_XIII = RomanPrinter.print(13);
      String value_XVI = RomanPrinter.print(16);
      String value_XVIII = RomanPrinter.print(18);
      String value_XX = RomanPrinter.print(20);

      assertEquals(XIString, value_XI);
      assertEquals(XIIIString, value_XIII);
      assertEquals(XVIString, value_XVI);
      assertEquals(XVIIIString, value_XVIII);
      assertEquals(XXString, value_XX);
	}
	@Test
	public void testFirst50Numbers() { 
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
		String[] L = {
				" __     ",
				"|  |    ",
				"|  |    ",
				"|  |    ",
				"|  |___ ",
				"|______|"
		};
		String[] XXI = new String[I.length];
		String[] XXVII = new String[I.length];
		String[] XXXV = new String[I.length];
		String[] XLIX = new String[I.length];

		for (int j = 0; j < I.length; j++) {
			XXI[j] = X[j] + X[j] + I[j];         
			XXVII[j] = X[j] + X[j] + V[j] + I[j] + I[j]; 
			XXXV[j] = X[j] + X[j] + X[j] + V[j];      
			XLIX[j] = X[j] + L[j] + I[j] + X[j];               
		}		

		String XXIString = String.join("\n", XXI);
		String XXVIIString = String.join("\n", XXVII);
		String XXXVString = String.join("\n", XXXV);
		String XLIXString = String.join("\n", XLIX);	
		String LString = String.join("\n", L);

    String value_XXI = RomanPrinter.print(21);
    String value_XXVII = RomanPrinter.print(27);
    String value_XXXV = RomanPrinter.print(35);
    String value_XLIX = RomanPrinter.print(49);
    String value_L = RomanPrinter.print(50);

    assertEquals(XXIString, value_XXI);
    assertEquals(XXVIIString, value_XXVII);
    assertEquals(XXXVString, value_XXXV);
    assertEquals(XLIXString, value_XLIX);
    assertEquals(LString, value_L);
	}
  @Test
	public void testFirst100Numbers() { 
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
		String[] L = {
				" __     ",
				"|  |    ",
				"|  |    ",
				"|  |    ",
				"|  |___ ",
				"|______|"
		};
        String[] C = {
        " ______ ",
        "/   ___|",
        "|  |    ",
        "|  |    ",
        "|  |___ ",
        "\\______|"
    };
		String[] LI = new String[I.length];
		String[] LXIII = new String[I.length];
		String[] LXXIX = new String[I.length];
		String[] LXXXIV = new String[I.length];

		for (int j = 0; j < I.length; j++) {
			LI[j] = L[j] + I[j];         
			LXIII[j] = L[j] + X[j] + I[j] + I[j] + I[j]; 
			LXXIX[j] = L[j] + X[j] + X[j] + I[j] + X[j];      
			LXXXIV[j] = L[j] + X[j] + X[j]+ X[j] + I[j] + V[j];                
		}		

		String LIString = String.join("\n", LI);
		String LXIIIString = String.join("\n", LXIII);
		String LXXIXString = String.join("\n", LXXIX);
		String LXXXIVString = String.join("\n", LXXXIV);	
		String CString = String.join("\n", C);

    String value_LI = RomanPrinter.print(51);
    String value_LXIII = RomanPrinter.print(63);
    String value_LXXIX = RomanPrinter.print(79);
    String value_LXXXIV = RomanPrinter.print(84);
    String value_C = RomanPrinter.print(100);

    assertEquals(LIString, value_LI);
    assertEquals(LXIIIString, value_LXIII);
    assertEquals(LXXIXString, value_LXXIX);
    assertEquals(LXXXIVString, value_LXXXIV);
    assertEquals(CString, value_C);
	}
  @Test
  public void testFirst500Numbers() {
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
    String[] L = {
        " __     ",
        "|  |    ",
        "|  |    ",
        "|  |    ",
        "|  |___ ",
        "|______|"
    };
    String[] C = {
      " ______ ",
      "/   ___|",
      "|  |    ",
      "|  |    ",
      "|  |___ ",
      "\\______|"
    };
    String[] D = {
      " _______  ",
      "|   __  \\ ",
      "|  |  |  |",
      "|  |  |  |",
      "|  |__|  |",
      "|_______/ "
    };
    
    String[] CI = new String[I.length];
    String[] CXCIX = new String[I.length];
    String[] CCXLIX = new String[I.length];
    String[] CCCXCIX = new String[I.length];

    for (int j = 0; j < I.length; j++) {
        CI[j] = C[j] + I[j];         
        CXCIX[j] = C[j] + X[j] + C[j] + I[j] + X[j]; 
        CCXLIX[j] = C[j] + C[j] + X[j] + L[j] + I[j] + X[j];      
        CCCXCIX[j] = C[j] + C[j] + C[j]+ X[j] + C[j] + I[j] + X[j];         
    }

    String CIString = String.join("\n", CI);
    String CXCIXString = String.join("\n", CXCIX);
    String CCXLIXString = String.join("\n", CCXLIX);
    String CCCXCIXString = String.join("\n", CCCXCIX);
    String DString = String.join("\n", D);

    String value_CI = RomanPrinter.print(101);
    String value_CXCIX = RomanPrinter.print(199);
    String value_CCXLIX = RomanPrinter.print(249);
    String value_CCCXCIX = RomanPrinter.print(399);
    String value_D = RomanPrinter.print(500);

    assertEquals(CIString, value_CI);
    assertEquals(CXCIXString, value_CXCIX);
    assertEquals(CCXLIXString, value_CCXLIX);
    assertEquals(CCCXCIXString, value_CCCXCIX);
    assertEquals(DString, value_D);
  }
  @Test
  public void testFirst1000Numbers() {
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
    String[] L = {
        " __     ",
        "|  |    ",
        "|  |    ",
        "|  |    ",
        "|  |___ ",
        "|______|"
    };
    String[] C = {
      " ______ ",
      "/   ___|",
      "|  |    ",
      "|  |    ",
      "|  |___ ",
      "\\______|"
    };
    String[] D = {
      " _______  ",
      "|   __  \\ ",
      "|  |  |  |",
      "|  |  |  |",
      "|  |__|  |",
      "|_______/ "
    };
    String[] M = {
      " ___  ___ ",
      "|   \\/   |",
      "|  \\  /  |",
      "|  |\\/|  |",
      "|  |  |  |",
      "|__|  |__|"
    };

    String[] DI = new String[I.length];
    String[] DCXCIX = new String[I.length];
    String[] DCCXLIX = new String[I.length];
    String[] CMXCIX = new String[I.length];

    for (int j = 0; j < I.length; j++) {
        DI[j] = D[j] + I[j];         
        DCXCIX[j] = D[j] + C[j] + X[j] + C[j] + I[j] + X[j];
        DCCXLIX[j] = D[j] + C[j] + C[j] + X[j] + L[j] + I[j] + X[j];      
        CMXCIX[j] = C[j] + M[j] + X[j] + C[j] + I[j] + X[j];         
    }

    String DIString = String.join("\n", DI);
    String DCXCIXString = String.join("\n", DCXCIX);
    String DCCXLIXString = String.join("\n", DCCXLIX);
    String CMXCIXString = String.join("\n", CMXCIX);
    String MString = String.join("\n", M);

    String value_DI = RomanPrinter.print(501);
    String value_DCXCIX = RomanPrinter.print(699);
    String value_DCCXLIX = RomanPrinter.print(749);
    String value_CMXCIX = RomanPrinter.print(999);
    String value_M = RomanPrinter.print(1000);

    assertEquals(DIString, value_DI);
    assertEquals(DCXCIXString, value_DCXCIX);
    assertEquals(DCCXLIXString, value_DCCXLIX);
    assertEquals(CMXCIXString, value_CMXCIX);
    assertEquals(MString, value_M);
  }
  @Test(expected=IllegalArgumentException.class) 
  public void testNumberMoreThan1000() {
    {
      RomanPrinter.print(1001); // Numero maggiore di 1000
    }
  }
}

