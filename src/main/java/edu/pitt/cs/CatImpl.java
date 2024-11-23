package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	public int id;
    public String name;
    public boolean rented;


	public CatImpl(int id, String name) {
		// TODO: Fill in
		this.id = id;
		this.name = name;
	}

	public void rentCat() {
		// TODO: Fill in
		this.rented = true;
		rented = this.rented;
	}

	public void returnCat() {
		// TODO: Fill in
	}

	public void renameCat(String name) {
		this.name = name;;
		// TODO: Fill in
	}

	public String getName() {
		// TODO: Fill in
		
		return name;
	}

	public int getId() {
		// TODO: Fill in
		return id;
	}

	public boolean getRented() {
		// TODO: Fill in
		return this.rented;
	}

	public String toString() {
		// TODO: Fill in
		return "ID " + this.id + ". " + this.name;
	}

}