package oops;

public class Inheritance {

	public static void main(String[] args) {
		System.out.println("========GrandFather==========");
		GrandFather gp = new GrandFather();
		gp.gpProperty();
		Father appa = new Father();
		appa.appaProperty();
		Child Nanu = new Child();
		Nanu.myProperty();
	}

}
class GrandFather{
	public void gpProperty() {
		System.out.println("this is Grand Fathers's Property");
	}
}
class Father extends GrandFather{
	public void appaProperty() {
		System.out.println("This is Father's Property");
	}
}
class Child extends Father{
	public void myProperty() {
		System.out.println("THIS IS MY PROPERTY");
	}
}