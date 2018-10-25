package finalContructor;

public class Student {
	public String stName;
	public int stID;

	public Student() {
		System.out.println("From Student Constructor");
	}
	public Student(String stName) {
		this.stName=stName;
		System.out.println("From SubStudent Constructor");
	}
	public Student(String stName, int ID) {
		this.stName=stName;
		this.stID=ID;
		System.out.println("From SubStudent Constructor");
		System.out.println("this is update");
		System.out.println("this not update");
	}

}
