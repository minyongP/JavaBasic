package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태백1", "박"));
		library.add(new Book("태백2", "박"));
		library.add(new Book("태백3", "박"));
		library.add(new Book("태백4", "박"));
		library.add(new Book("태백5", "박"));
		
		
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
