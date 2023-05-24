package Csomag;

public class Link {
	
	private int value;			//ez az a class amiben igazából meghatározzuk a listában lévő elemeket és a következőre mutató link értékeket. getterek és setterek egy kicsi konstruktorral,
	private Link next;			//de csak a value-nek kell konstruktor mert a linket nem kézzel állítjuk be.
	
	public Link(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public Link getNext() {
		return next;
	}
	
	public void setNext(Link next) {
		this.next = next;
	}
}