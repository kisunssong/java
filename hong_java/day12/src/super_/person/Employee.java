package super_.person;

public class Employee extends Person{
		
	String department;
	
	String info() {
		return "�̸�: " + name + ", ����: " + age + ", �μ�: " + department;
	}
}