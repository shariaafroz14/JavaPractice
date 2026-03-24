package oops_concepts;

public class Inheritance {
	void eat() {
		System.out.println("this animal eats food");
	}
}
 class Dog extends Animal{
	void bark1() {
		 System.out.println("the dog beaks");
	 }
 
  
	
	 public static void main(String[]args) {
		 Dog dog= new Dog();
		 dog.eat();//inheritand method
		 dog.bark1();//specific to Dog
		 
	 }



	 private void eat() {
		// TODO Auto-generated method stub
		
	}



	 private void bark() {
		// TODO Auto-generated method stub
		
	 }
 

		
		      

	}


