package mca.dsa;

public class DemoIterface implements Game {
	public static void main(String[] args) {
		DemoIterface o=new DemoIterface();
		o.move();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Moving Left");
	}

}
