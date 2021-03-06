import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame08 extends Frame implements ActionListener {
	Button redBtn;
	Button blueBtn;
	
	public Frame08() {
		setLayout(new FlowLayout());
		
		redBtn = new Button("red");
		blueBtn = new Button("blue");
		add(redBtn);
		add(blueBtn);
		
		redBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	public void actionPerformed(ActionEvent e) { //추상메서드 오버라이딩
		if(e.getSource() == redBtn) { // getSource(): 이벤트 소스객체 반환
			this.setBackground(Color.red);
		}else if (e.getSource() == blueBtn) {
			this.setBackground(Color.blue);
		}
	}
}
public class Gui08 {
	public static void main(String[] args) {
		new Frame08();
	}
}
