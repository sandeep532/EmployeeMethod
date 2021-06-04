public class EmployeeWageUc3{
	public static int EmployeeDailywageFullandPart(){
		int Full_Time=0;
		int Part_Time=1;
     		int Emp_wage_per_hour=20;
		int Employee_wage=0;
		double emp_Check=Math.floor(Math.random()*10)%2;
		if(emp_Check==Full_Time){
			int Working_hour=8;	
			System.out.println("Full time Employee");
			Employee_wage=Emp_wage_per_hour*Working_hour;	
				
		}else if(emp_Check==Part_Time){
			int Working_hour=4;
			System.out.println("Part time Employee");
			Employee_wage=Emp_wage_per_hour*Working_hour;
			
		}	
		return Employee_wage;
	}
	
	public static void main(String args[]){
		System.out.println(EmployeeDailywageFullandPart());
	}

}