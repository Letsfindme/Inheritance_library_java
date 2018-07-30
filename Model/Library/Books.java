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
    	System.out.println("Title: "+ title);
    	System.out.println("author: "+ author);
    	System.out.println("year: "+ year);
    	System.out.println("type: "+ type);
    	System.out.println("editor: "+ editor);
    	if (booked == true) {
    		System.out.println("Sorry this book is reserved");
    	}else {

    		System.out.println("this book is available");
    	}
    	System.out.println("\n");
        
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public Boolean getBooked() {
		return booked;
	}

	public void setBooked(Boolean booked) {
		this.booked = booked;
	}

}