package api.lang.string;

public class StringIndexOf {
	
	public static void main(String[] args) {
		
		String sbj = "�ڹ� ���α׷���";
		
		//���ڿ��� ���ڰ���(����)�� �����ϴ� length()
		System.out.println("sbj�� ����: " + sbj.length());
		
		//���ڿ��� Ư�� �ε��� ���ڸ� �����ϴ� charAt()
		System.out.println("sbj�� 6��° �ε���: " + sbj.charAt(6));
		
		//���ڿ��� Ư�� ������ �ε��� ��ȣ�� �����ϴ� indexOf()
		int location = sbj.indexOf("��");
		System.out.println("'��'�� �ε�����ȣ: " + location);
		
	}
}