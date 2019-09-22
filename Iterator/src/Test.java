
public class Test {

	public static void main(String[] args) {
		Menu itemsList = new Menu();
		
		for(Iterator iter = itemsList.getIterator(); iter.hasNext();) {
			String name = (String)iter.next();
			System.out.println("Item: " + name);
		}
	}
}