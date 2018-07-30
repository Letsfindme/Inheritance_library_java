package Model;
import java.util.*;

import Model.Library.Books;

/**
 * 
 */
public class Novel extends Books {

    

    /**
     * 
     */
    public boolean goncourtPrize;
    
    public void goncourtPrize() {
    	if (goncourtPrize == true) {
    		System.out.println("This book has earned: Goncourt Prize");
    	}
    }

	public boolean getGoncourtPrize() {
		return goncourtPrize;
	}

	public void setGoncourtPrize(boolean goncourtPrize) {
		this.goncourtPrize = goncourtPrize;
	}

}