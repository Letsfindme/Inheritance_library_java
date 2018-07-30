package Model;
import java.util.*;

import Model.Library.Books;

/**
 * 
 */
public class Magazine extends Books {

   
    /**
     * 
     */
    public Boolean colored;

    public void colored() {
    	if (colored == true) {
    		System.out.println("This book is in color");
    	}else {
    		System.out.println("This book is in black and white");
    	}
    }
	public Boolean getColored() {
		return colored;
	}

	public void setColored(Boolean colored) {
		this.colored = colored;
	}

}