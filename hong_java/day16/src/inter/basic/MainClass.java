package inter.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		//�������̽��� ��ü�� ������ �� �����ϴ�.
//		Inter1 i1 = new Inter1();
		
		InterClass ic = new InterClass();
		
		System.out.println(Inter1.INCH);
		System.out.println(Inter2.ABC);
		ic.method1();
		ic.method2();
		ic.method3();
		
		/*
		 * �������̽� �̸��� �ϳ��� Ÿ������ ����� �� �ֽ��ϴ�.
		 * �������̽��� ���� ��� ���̵� �������� ������ �� �ֽ��ϴ�.
		 */
		Inter1 i1 = ic; //Promotion: InterClass -> Inter1
		Inter2 i2 = new InterClass(); //InterClass -> Inter2 
		
//		i1.method3();
//		i2.method3();
		//method3()�� InterClass�޼���� ���β��̱⶧���� Ÿ�Ժ���� ���Ұ�
		//�Ʒ��� ĳ������ ���Ŀ� ����
		InterClass icc = (InterClass)i1; 
		InterClass icc2 = (InterClass)i2; 
		icc.method3();
	}

}