package Model;

import Model.Library.Books;

public class CreatBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   ChiledBooks newChiled = new ChiledBooks();
		   newChiled.setTitle("the best");
		   newChiled.setAuthor("Alin");
		   newChiled.setYear(1990);
		   newChiled.setType("Story");
		   newChiled.setEditor("C'est moi");
		   newChiled.setBooked(true);
		   newChiled.isBooked();
		   
		   Magazine theCorse = new Magazine();
		   theCorse.setTitle("The Corse");
		   theCorse.setAuthor("Senior Corse");
		   theCorse.setYear(2018);
		   theCorse.setType("Mag");
		   theCorse.setEditor("C'est le voisin");
		   theCorse.setBooked(false);
		   theCorse.isBooked();
		   
	}

}
