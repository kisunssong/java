
public class Date08 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		//StringŬ������ ��ü ������ ������ �� ����, String Ŭ����
		//������ �޼��带 �̿��Ͽ� ���ڿ��� �����ϸ� ������ ������
		//���� ���ο� ���ڿ� ��ü�� �����ȴ�.
		//StringBuffer�� ���ο� ���ڿ� ��ü�� �����Ǵ°��� �ƴ϶�
		//�ڽ��� ���� ������ �� �ִٴ°��� String Ŭ�������� ū ������
		
		System.out.println("sb == sb2 ? "+(sb == sb2));
		//sb == sb2 ? false
		
		System.out.println("sb.equals(sb2) ? "+(sb2.equals(sb2)));
		//sb.equals(sb2) ? false
		//s()�޼��尡 �������̵� ���� �ʾƼ� ����Object equals()�޼��带
		//��ӹ޾Ƽ� ����ϸ� �ڼ�Ŭ�������� � ���� �߰��Ǿ�����
		//�˼��� ����, �ּҰ��� ���ؼ� �ᱹ false�� �ȴ�.
		//sb�� String�� �����ε��� �����ڸ� Ȱ���ϰ�, sb2�� ��Ʈ��������
		//�޼��带 Ȱ������
		
		String s = new String(sb);
		String s2 = sb2.toString();
		
		sb.append("def");
		System.out.println(sb.toString());
		
		
	}
}