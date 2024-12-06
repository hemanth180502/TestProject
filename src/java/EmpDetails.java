package java;

public class EmpDetails {
	
	String EmpName = "John";
	int EmpID	= 1234;
	String BU = "Appl";
	
	public static void main(String[] args)
	{
		EmpDetails ed = new EmpDetails();
		System.out.println(ed.EmpName);
		System.out.println(ed.EmpID);
		System.out.println(ed.BU);
	}

}
