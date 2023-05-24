package Csomag;

public class LinkedList {
	private Link first;			//legelső érték megadása, autómata, amíg nem adunk hozzá értéket addig null értéke van

	public void addLast(int i) {
		if (first==null) {		//ha az első elemnek a mutató linkje a következzőnek null 
			first=new Link(i);	//akkor hozzáadjuk az álltalunk megadott elem mutató linkjét és értékét.
		}
		else {					//ha az első elemnek a mutató linkje a következzőnek nem null 
			Link newLink=new Link (i);			//akkor eltároljuk a megadott értéket egy új "Link" objektumba
			Link current=first;					//készítünk egy aféle változót amivel ha szükség van rá akkor végig mehetünk a listán keresve a végét. Ez a az első vel kezdjük
			while (current.getNext()!=null) {	//végig nézzük a listát a végét keresve, amit a azzal vizsgáljuk, hogy a current(jelenlegi) elemnek a kövire mutató linkje null-e
				current=current.getNext();		//ha nem null, akkor rá ugrunk a következőre, úgy hogy a currentet egyenlővé tesszük a következő elemmel a getNext-el
			}
			current.setNext(newLink);			//ha megtaláljuk a null értéket a lista végén akkor az általunk eltárolt newLink objektumban megadott értéket beállítjuk a lista végére
												//úgy hogy az utólsó elem következőre mutató linkje a newLink-re mutat és az új utolsó elem értéke i lesz és a kövire muatató linkje null
		}
		
	}
	
	public void addFirst(int i) {
		if (first==null) {		//ha az első elemnek a mutató linkje a következzőnek null 
			first=new Link(i);	//akkor hozzáadjuk az álltalunk megadott elem mutató linkjét és értékét.
		}
		else {							//ha az első elemnek a mutató linkje a következzőnek nem null 
			Link newLink=new Link (i);	//akkor eltároljuk a megadott értéket egy új "Link" objektumba
			Link second=first;			//elmentjük a jelenlegi legelső elemet mint 2. elem
			first = newLink;			//a régi első elemet át írjuk az új elemünk adataival
			newLink.setNext(second);	//és a következőre mutató linkjét megadjuk a régi elsőnek a memória helyével (már második elem)
			
		}
		
	}
	
	public void delete(int i) {
		Link current=first;
		Link previous=current;	
		while (current != null) {
			if (current.getValue()==i) {
				if (current == first) {
					first=current.getNext();
				}
				else {
					previous.setNext(current.getNext());
					if (current.getNext()!=null) {
						previous=current;
						current = current.getNext();
					}
					else {
						break;
					}
				}			
			}	
			else {
				previous=current;
				current = current.getNext();		
			}
			
		}
		if (current == null) {
			System.err.println("Nincsen a megadott erteku elem a listaban");
		}
	}
	
	public void print() {							//kiiratatjuk a lista elemeinek érétékét.
		Link current=first;							//előröl akarunk menni tehát fikszálunk egy current(jelenlegi) értéket a first (első) elemre 
		while (current!=null) {						//amíg nem null az értékünk
			System.out.println(current.getValue());	//addíg kíírattajuk a konzolra az értékét az elemünknek
			current=current.getNext();				//és ugrunk a következőre
		}	
	}
}