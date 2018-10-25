package staticVariable;

public class TestDriveWay {

	public static void main(String[] args) {
		Driveway kiran = new Driveway();
		kiran.drivewaysize = 10;
		System.out.println(kiran.drivewaysize);

		Driveway luis = new Driveway();
		luis.drivewaysize = 12;
		System.out.println(luis.drivewaysize);
		System.out.println(kiran.drivewaysize);
	}
}
