import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Item f1 = new Item("chocolate", 2.55f);
		Item f2 = new Item("Vanilla", 1.55f);
		Item f3 = new Item("Red Velvet", 3.55f);
		Item f4 = new Item("Caramel", 3.75f);		
	
		Menu menu = new Menu();
		menu.addItem(f1);
		menu.addItem(f2);
		menu.addItem(f3);
		menu.addItem(f4);
		System.out.println("Displaying Menu : " );
		Iterator<Item> iterator = menu.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
			System.out.println(item);
		}
		System.out.println ("Removing last item returned");
		iterator.remove();
		
		System.out.println("Displaying Menu:");
		iterator = menu.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
			System.out.println(item);
		}
	}
}
