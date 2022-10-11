package week1.day2;

public class Car
{
		public void applybreak() {
			System.out.println("Applybreak");
		}
		public void applyGear() {
		System.out.println("Apply Gear");
}
public void switchonAc() {
	System.out.println("Switch on AC");
}
public void applyAccelerate() {
	System.out.println("Apply Accelerate");
}
public static void main(String[] args) {
	Car actions = new Car ();
	actions.applybreak();
	actions.applyGear();
	actions.switchonAc();
	actions.applyAccelerate();		
}
}