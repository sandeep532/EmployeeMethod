public class EmployeeWageUc2{
	public static int EmployeeDailywage(){
		int Full_Time=1;
     		int Emp_wage_per_hour=20;
		int Working_hour=8;
		int Employee_wage;
		double emp_Check=Math.floor(Math.random()*10)%2;
		
		if(emp_Check==Full_Time){
			Employee_wage=Emp_wage_per_hour*Working_hour;
			System.out.println("Employee is Present");
					
		}else{	
			System.out.println("Employee is Absent");
			Employee_wage=0;
		}
			return Employee_wage;
	}
	public static void main(String args[]){
		System.out.println(EmployeeDailywage());
	}
}