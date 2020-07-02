package com.wipro.abstractclass;
abstract class Instrument{
	abstract void play();
}
class Piano extends Instrument {
	void play() {
		System.out.println("piano is playing tan tan tan tan");
	}
}
class Flute extends Instrument{
	void play() {
		System.out.println("flute is playing toot toot toot toot");
	}
}
class Guitar extends Instrument{
	void play() {
		System.out.println("guitar is playing tin tin tin");
	}
}
public class exp1 {
	public static void main(String[] args) {
		Instrument []arr = new Instrument[10];
		for(int i=0;i<10;i++) {
			if(i<3) {
			arr[i] = new Piano();
			arr[i].play();
			}
			if(i>=3&&i<7) {
				arr[i] = new Flute();
				arr[i].play();
			}
			if(i>=7&&i<10) {
				arr[i] = new Guitar();
				arr[i].play();
			}
		}
		for(int i=0;i<10;i++) {
			if(arr[i] instanceof Piano)
				System.out.println(i+" piano");
			else if(arr[i] instanceof Flute)
				System.out.println(i+" Flute");
			else
				System.out.println(i+" Guitar");
		}
	}

}
