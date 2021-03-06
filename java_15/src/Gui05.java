import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame05 extends Frame {
	Panel pan01, pan02, pan03;
	//패널은 각 컴포넌트를 묶어서 처리하는 컨테이너 레이아웃이다. 패널을 기준으로 레이아웃
	//배치를 하면 수월하게 배치할 수 있다.

	public Frame05() {
		pan01 = new Panel();
		pan02 = new Panel();
		pan03 = new Panel();

		pan01.setBackground(Color.orange);
		pan02.setBackground(Color.blue);
		pan03.setBackground(Color.red);

		add(BorderLayout.NORTH, pan01); //첫번쨰 패널을 프레임 북쪽에 배치
		add(BorderLayout.CENTER, pan02); //첫번쨰 패널을 프레임 북쪽에 배치
		add(BorderLayout.SOUTH, pan03); //첫번쨰 패널을 프레임 북쪽에 배치

		//각 패널에 컴포넌트 버튼을 추가해서 그룹화 시킴.
		pan01.add(new Button("Button 01"));
		pan02.add(new Button("Button 02"));
		pan03.add(new Button("Button 03"));

		setSize(300,130);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();System.exit(0);
			}			
		});
	}

}
public class Gui05 {
	public static void main(String[] args) {
		new Frame05();
	}
}
