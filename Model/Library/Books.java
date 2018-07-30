package Model.Library;

import java.util.*;

/**
 * 
 */
public class Books {

    

    /**
     * 
     */
    public String title;

    /**
     * 
     */
    public String author;

    /**
     * 
     */
    public int year;

    /**
     * 
     */
    public String type;

    /**
     * 
     */
    public String editor;

    /**
     * 
     */
    public Boolean booked;

    /**
     */
    public void isBooked() {
        // TODO implement here
    	
    	if (booked == true) {
    		System.out.println("Sorry this book is reservied");
    	}else {

    		System.out.println("this book is available");
    	}
        
    }

}