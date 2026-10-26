package Day_29_Inheritance_Override;

class Items {

	void everyItem() {

		System.out.println("Talking about Any Items");
	}
}

class groceryItem extends Items{
	
    @Override
	void everyItem() {

		System.out.println("Talking about grocery only Items");
		System.out.println("Like floar , milk , paneer ");
	}

}

class packedItem extends groceryItem

{    
	
	@Override
	void everyItem() {

		System.out.println("Talking about packed grocery Items");
		System.out.println("Like packets of dal , chawal and etc");
	}

}

public class DriverMultilevel {

	public static void main(String[] args) {
		
		//Items it = new Items();
		//it.everyItem();
		
		groceryItem gi = new groceryItem();
		gi.everyItem();
		

	}

}
