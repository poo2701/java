public interface Animals {
    void speak();
    void eat();

    public static void main(String[] args) {
      Dog d=new Dog();
      d.speak();
      d.eat();
      cat c=new cat();
      c.speak();
      c.eat();
	}

}
 class Dog implements Animals{
	public void speak() {
		System.out.println("dog is speak bark");
	}
	public void eat() {
		System.out.println("dog eat non veg");
	}
 }
 class cat implements Animals{
		public void speak() {
			System.out.println("cat is speak meow");
		}
		public void eat() {
			System.out.println(" cat eat veggies");
		}
	 }