
public class Menu implements Container {

	public String items[] = {"Pizza" , "Cheeseburger" , "Hamburger", "Turkey Sandwich", "Ice Cream" , "Tacos"};
	
	public Iterator getIterator() { 
		return new ItemIterator();
	}
	
	private class ItemIterator implements Iterator { 
		int index;
		public boolean hasNext() {
			if(index < items.length) {
				return true;
			}
			return false;
		}
		public Object next() {
			if(this.hasNext()) {
				return items[index++];
			}
			return null;
		}
	}
}