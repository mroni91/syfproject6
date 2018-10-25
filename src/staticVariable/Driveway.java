package staticVariable;

public class Driveway {

	public static int drivewaysize = 10;

	public final static int drivewaylocation = 5;

	public int getDriveWaySize() {
		return drivewaysize;

	}

	public void setDriveWaySize(int drivewaysize) {
		this.drivewaysize = drivewaysize;

	}

	public void displayDriveWaySize(int drivewaysize) {
		System.out.println(drivewaylocation);

	}

}
