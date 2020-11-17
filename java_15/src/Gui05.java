import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame05 extends Frame {
	Panel pan01, pan02, pan03;
	//�г��� �� ������Ʈ�� ��� ó���ϴ� �����̳� ���̾ƿ��̴�. �г��� �������� ���̾ƿ�
	//��ġ�� �ϸ� �����ϰ� ��ġ�� �� �ִ�.

	public Frame05() {
		pan01 = new Panel();
		pan02 = new Panel();
		pan03 = new Panel();

		pan01.setBackground(Color.orange);
		pan02.setBackground(Color.blue);
		pan03.setBackground(Color.red);

		add(BorderLayout.NORTH, pan01); //ù���� �г��� ������ ���ʿ� ��ġ
		add(BorderLayout.CENTER, pan02); //ù���� �г��� ������ ���ʿ� ��ġ
		add(BorderLayout.SOUTH, pan03); //ù���� �г��� ������ ���ʿ� ��ġ

		//�� �гο� ������Ʈ ��ư�� �߰��ؼ� �׷�ȭ ��Ŵ.
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