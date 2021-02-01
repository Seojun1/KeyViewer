import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JScrollPane;

public class Main {

	public static void main(String[] args) {

		Frame f = new Frame("버튼테스트");// 프레임생성
		JScrollPane p = new JScrollPane();// 패널생성

		f.setTitle("KeyViewer"); // 제목
		f.setSize(400, 400); // 크기

		p.setBackground(Color.lightGray);

		p.setLayout(null);
		
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);

			}

		});

		Button b1 = new Button("↑");
		Button b2 = new Button("↓");
		Button b3 = new Button("←");
		Button b4 = new Button("→");
		Button b5 = new Button("CTRL");
		Button b6 = new Button("Shift");

		p.add(b1);// 패널에 버튼붙이기
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		f.add(p);// 프레임에에 패널붙이기

		b1.setBounds(230, 10, 90, 50);
		b2.setBounds(230, 60, 90, 50);
		b3.setBounds(155, 60, 75, 50);
		b4.setBounds(305, 60, 75, 50);
		b5.setBounds(10, 60, 100, 50);
		b6.setBounds(10, 10, 150, 50);
		
		
		f.setVisible(true); // 실행
		f.setFocusable(true);
	}
}