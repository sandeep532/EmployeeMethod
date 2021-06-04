public class EmpWageBuilderUc6{
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME =2;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int Working_Days_Per_Month=20;
public static final int Working_Hours_Per_Day=8;
	public static int EmployeeLoop(){
		int Emp_Hrs;
		int Emp_Wage=0;
		int emp_Check=0;
		int Working_Hours=Working_Hours_Per_Day*Working_Days_Per_Month;
		for(Working_Hours=1;Working_Hours<=100;Working_Hours++){
			Emp_Wage=Working_Hours*EMP_RATE_PER_HOUR;			
		}
		return Emp_Wage;
	}
	public static void main(String args[]){
		System.out.println(EmployeeLoop());
	}

		
		

}