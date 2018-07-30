package Model;

import java.util.*;

import Model.Library.Books;

/**
 * 
 */
public class ChiledBooks extends Books {

   
   
    /**
     * 
     */
    public boolean sorcieresPrize;

    public void sorcieresPrize() {
    	if (sorcieresPrize == true) {
    		System.out.println("This book has earned: Sorcieres Prize");
    	}
    }
	public boolean getSorcieresPrize() {
		return sorcieresPrize;
	}

	public void setSorcieresPrize(boolean sorcieresPrize) {
		this.sorcieresPrize = sorcieresPrize;
	}

}