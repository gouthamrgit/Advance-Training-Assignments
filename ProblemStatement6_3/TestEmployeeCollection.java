package ProblemStatement6_3;

import java.util.Vector;

public class TestEmployeeCollection {
public static void main(String[] args) {
	Vector<Employee> v = addInput();
	display(v);
}

private static Vector<Employee> addInput() {
	// TODO Auto-generated method stub
	Employee e1 = new Employee(101,"Chethan","Bangalore") ;
	Employee e2 = new Employee(102,"Goutham","Bangalore") ;
	Employee e3 = new Employee(103,"Lakshmikantha","Bangalore") ;
	Employee e4 = new Employee(104,"Pavan","Bangalore") ;
	Employee e5 = new Employee(105,"Nihal","Bangalore") ;
	Vector<Employee> v = new Vector<Employee>();
	v .add(e1);
	v.add(e2);
	v.add(e3);
	v.add(e4);
	v.add(e5);
	return v;
}

private static void display(Vector<Employee> v) {
	// TODO Auto-generated method stub
	for(Employee e:v)
	{
		System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
	}
}
}

