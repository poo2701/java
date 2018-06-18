class Animal{
	String breed;
	String color;
	public void speak(){
		System.out.println("growl");
	}
	Animal(String br,String clr){
		breed=br;
		color=clr;
	}
}
class Dog extends Animal{
	public void speak(){
		System.out.println("dog is barking");
			System.out.println("the breed is "+ breed);
			System.out.println("the color is "+ color);
	}
	Dog(String br,String clr){
		super(br,clr);
	}
}
class Cat extends Animal{
	public void speak(){
		System.out.println("cat is speak");
		System.out.println("the breed is "+ breed);
			System.out.println("the color is "+ color);

	}
	Cat(String br,String clr){
	super(br,clr);
  }
}
class Demo{
public static void main(String[] args) {
	
	 Dog d=new Dog("labrador","black");

	d.speak();
	Cat c= new Cat ("Ragdoll","brown");
    c.speak();
}
}