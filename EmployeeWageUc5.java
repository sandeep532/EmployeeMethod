public class EmployeeWageUc5{
	public static int EmployeeDailywage(){
		int Full_Time=1;
		int Part_Time=2;
     		int Emp_wage_per_hour_full_time=20;
		int Emp_wage_per_hour_part_time=8;
		int Working_Days_per_month=20;
		int Working_hour=8;
		int Employee_wage;
		double emp_Check=Math.floor(Math.random()*10)%3;
		if(emp_Check==Full_Time){
			Employee_wage=Emp_wage_per_hour_full_time*Working_hour*Working_Days_per_month;
			System.out.println("Employee is Full Time");		
		}else{
			Employee_wage=Emp_wage_per_hour_part_time*Working_hour*Working_Days_per_month;
			System.out.println("Employee is Part Time");
		}
		return Employee_wage;
	}
	public static void main(String args[]){
	System.out.println(EmployeeDailywage());
	}
}
