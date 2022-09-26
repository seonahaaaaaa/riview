package poly;

public class Dvd extends Item {

	private String actor;
	private String director;

	public Dvd() {

	}
	
	public Dvd(String number , String tittle, String actor , String director) {
		super.number = number;
		super.tittle = tittle;
		this.actor = actor;
		this.director = director;
		
		
	}

	public void output() {
		System.out.println(number);
		System.out.println(tittle);
		System.out.println(actor);
		System.out.println(director);
	}

}
