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

		Frame f = new Frame("��ư�׽�Ʈ");// �����ӻ���
		JScrollPane p = new JScrollPane();// �гλ���

		f.setTitle("KeyViewer"); // ����
		f.setSize(400, 400); // ũ��

		p.setBackground(Color.lightGray);

		p.setLayout(null);
		
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);

			}

		});

		Button b1 = new Button("��");
		Button b2 = new Button("��");
		Button b3 = new Button("��");
		Button b4 = new Button("��");
		Button b5 = new Button("CTRL");
		Button b6 = new Button("Shift");

		p.add(b1);// �гο� ��ư���̱�
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		f.add(p);// �����ӿ��� �гκ��̱�

		b1.setBounds(230, 10, 90, 50);
		b2.setBounds(230, 60, 90, 50);
		b3.setBounds(155, 60, 75, 50);
		b4.setBounds(305, 60, 75, 50);
		b5.setBounds(10, 60, 100, 50);
		b6.setBounds(10, 10, 150, 50);
		
		
		f.setVisible(true); // ����
		f.setFocusable(true);
	}
}