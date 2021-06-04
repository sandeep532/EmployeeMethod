public class EmployeeWageUc1{
	public static void main(String args[]){
		EmployeeAttandance();
	}
	public static int EmployeeAttandance(){
		int Full_Time=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==Full_Time){
			System.out.println("Employee is present");		
		}else{
			System.out.println("Employee is Absent");}
		return 0;
	}
}