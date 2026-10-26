package Day_28_Inheritance;


class Animal {

	void eat() {
		System.out.println("Every Animal eats");	
	}
		
}

class Dog extends Animal {
	
	void bark() {
		System.out.println("Dog barks");
		}

}

public class Main {
	
      public static void main(String args[]) {
    	  Dog dog = new Dog();
    	  dog.eat();
    	  dog.bark();
      } 
}

/*

class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
} */