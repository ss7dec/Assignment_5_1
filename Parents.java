//Assignment5.1

//Create an abstract class Parent and define an abstract method in it and implement it in the child class

package assignment_5_1;  // //This java file is inside package named assignment_5_1 inside src folder.

public abstract class Parents {      //Abstract class declaration named Parents.
	
		  abstract int getSalary();
		}
		class Child_1 extends Parents{
			
		  private int salary;
		  public Child_1(int s){
		    salary = s;
		  }
		  int getSalary(){
		    return salary;
		  }
		}
		class Child_2 extends Parents{
		  private int salary;
		  public Child_2(int t){
		    salary = t;
		  }
		  int getSalary(){
		    return salary;
		  }
		}
		class abstract0{
			
			//Abstract Methods
		public static void main(String[] args){
		  Child_1 c1 = new Child_1(5000);
		  Child_2 c2 = new Child_2(3000);
		  int a, b;
		  a = c1.getSalary();
		  b = c2.getSalary();
		  System.out.println("Salary of First Child is : " + a);
		  System.out.println("Salary of Second Child is : " + b);
		}

}  //End of abstract class.
