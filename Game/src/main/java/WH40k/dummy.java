package WH40k;

import java.awt.GraphicsEnvironment;

public class dummy {
	
// this just fetches a list of all available fonts
	
	public static void main(String[] args) {
	    String fonts[] = 
	      GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

	    for ( int i = 0; i < fonts.length; i++ )
	    {
	      System.out.println(fonts[i]);
	    }
	  }

	}


