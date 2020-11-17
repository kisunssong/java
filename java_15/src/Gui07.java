import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame07 extends Frame {
	Button redBtn;
	Button yellowBtn;
	
	public Frame07() {
		setLayout(new FlowLayout());
		
		redBtn = new Button("red");
		yellowBtn = new Button("yellow");
		add(redBtn); 
		add(yellowBtn);
		
		ButtonListener2 handler = new ButtonListener2(this); //thisŰ����� ���ڽ� ����
		redBtn.addActionListener(handler);
		yellowBtn.addActionListener(handler);
		
		setSize(300,200);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose(); System.exit(0);
			}
		});
	}//������
}//Frame07 class

//�̺�Ʈ ó��Ŭ����
class ButtonListener2 implements ActionListener{
    Frame frm = null;
    
    public ButtonListener2() {}
    
    public ButtonListener2(Frame frm) {
    	this.frm = frm;//������ ������ ���޹���.
    }//������ �����ε�
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="red") {
			//getActionCommand()�޼���� ��ư�� ĸ�ǹ��ڿ��� ��ȯ
			frm.setBackground(Color.red);//������ ������ �������� ����
		}else {
			frm.setBackground(Color.YELLOW);
		}
	}//��ư Ŭ�������� ȣ��	
}
public class Gui07 {
	public static void main(String[] args) {
		new Frame07();
	}
}