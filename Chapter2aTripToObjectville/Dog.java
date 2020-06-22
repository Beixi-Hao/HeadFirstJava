class Dog {
        // instance variables
	int size;
	String breed;
	String name;
        // a method
	void bark() {
		System.out.println("Ruff! Ruff!");
	}
}

class DogTestDrive {
	public static void main (String[] args) {
		Dog d = new Dog(); // make a dog object
		d.size = 40;       // use dot operator (.) to set the size of the Dog
		d.bark();          // and to call tis bark() method
	}
}
