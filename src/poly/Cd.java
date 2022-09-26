package poly;

public class Cd extends Item {

	private String singer;
	
	public Cd() {

	}
	
	public Cd(String number , String tittle, String singer) {
		super.number = number;
		super.tittle = tittle;
		this.singer = singer;
	}
	
	public void output() {
		System.out.println(number);
		System.out.println(tittle);
		System.out.println(singer);
	}


}
