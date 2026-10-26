package Day_29_Inheritance_Override;

class Papa {

	public void eatingTabacco() {
		System.out.println("Papa is eating Tabacco");
	}

}

class Beta extends Papa {

	public void goingGym() {

		System.out.println("Beta is going Gym");
	}
}

class Driver_Single_Inheri {

	public static void main(String args[]) {
		Beta b = new Beta();
		b.eatingTabacco();
		b.goingGym();

	}

}
