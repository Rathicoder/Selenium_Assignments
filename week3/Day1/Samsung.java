package week3.Day1;

public class Samsung extends AndroidTv implements Android{

	public static void main(String[] args) {
		Samsung SG = new Samsung();
		SG.openapp();
		SG.watchvideo();

	}

	public void watchvideo() {
		System.out.println("Play the video");
		
	}

}
