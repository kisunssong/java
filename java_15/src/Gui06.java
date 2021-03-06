import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame06 extends Frame {
	Button redBtn; 
	Button blueBtn;
	
	public Frame06() {
		setLayout(new FlowLayout()); //배치관리자 설정
		
		redBtn = new Button("Red");
		blueBtn = new Button("blue");
		add(redBtn);//프레임 버튼추가
		add(blueBtn);//프레임 버튼추가
		
		ButtonListener handler = new ButtonListener();
		redBtn.addActionListener(handler); //각 버튼 이벤트 등록
		blueBtn.addActionListener(handler); //각 버튼 이벤트 등록
		
		setSize(300,200);
		setVisible(true);
		addWindowListener(new WindowAdapter() {

		public void windowClosing(WindowEvent e) {
			dispose(); System.exit(0);
		}		
		});
	}
}
class ButtonListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 클릭");
	}
}
public class Gui06 {
	public static void main(String[] args) {
		new Frame06();
	}
}
