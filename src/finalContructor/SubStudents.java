package finalContructor;

public class SubStudents extends Student {
	public String stNameID;

	public SubStudents() {
		super();
	}

	public SubStudents(String stName,String stNameID) {
		super(stNameID);
		this.stNameID = stNameID;

	}
	public void studentInfo() {
		System.out.println("Student databases"); 
	}

}
