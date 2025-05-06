package pertemuan10;

public class Bird extends Animal implements Terbang{

	@Override
	public void fly() {
		System.out.println("Burung Terbang dengan Sayap");
	}
	
	@Override
	public void sound() {
		System.out.println("Kicau kicau");
	}
}
