import java.util.Scanner;
public class EmployeeWageUc10{
	public static int Employeewage(String company){
		int Full_Time=2;
		int Part_Time=1;
     		int Emp_wage_per_hour_full_time=20;
		int Emp_wage_per_hour_part_time=20;
		int Working_hour;
		int Employee_wage;
		System.out.println("The employee wage computation for "+company+" company");
		double emp_Check=Math.floor(Math.random()*10)%3;
		if(emp_Check==Full_Time){
			Working_hour=8;
			Employee_wage=Emp_wage_per_hour_full_time*Working_hour;
			System.out.println("Employee is Full Time");
			System.out.println();		
		}else{
			Working_hour=4;
			Employee_wage=Emp_wage_per_hour_part_time*Working_hour;
			System.out.println("Employee is Part Time");
			System.out.println(Employee_wage);
		}
		return Employee_wage;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of Companies");
		int n=s.nextInt();
		String arr[]=new String[n];
		s.nextLine();	
		for(int i=1;i<=n;i++){
			System.out.println("Enter Company Name");
			arr[i]=s.nextLine();
			System.out.println(Employeewage(arr[i]));
	}
}
}