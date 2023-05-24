package Csomag;

public class Main {

	public static void main(String[] args) {	//az add() és print() -eket mint metódusként létrehozzuk a LinkedList classban annak érdekében hogy hozzáadni és kiiratattni tudjuk a listánkat.
		LinkedList list= new LinkedList();
			System.out.println("Alap lista megadas:");
			list.addLast(1);
			list.addLast(2);
			list.addLast(3);
			list.addLast(4);
			list.addLast(5);
			list.addLast(4);
			list.print();
			System.out.println("----");
			System.out.println("elore beszuras: (6)");
			list.addFirst(6);		
			list.print();
			System.out.println("----");
			System.out.println("elem torlese: (4)");
			list.delete(4);
			list.print();
			
	}
}