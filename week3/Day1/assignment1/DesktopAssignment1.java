package week3.Day1.assignment1;

public class DesktopAssignment1 extends ComputerAssignment1 {

	public  void desktopsize() {
		System.out.print("Method2:Desktop");
	}
	public static void main(String[] args) {
		DesktopAssignment1 task = new DesktopAssignment1();
		task.computerModel();
		task.desktopsize();
	}
}
