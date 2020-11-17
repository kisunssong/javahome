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
		setLayout(new FlowLayout()); //��ġ������ ����
		
		redBtn = new Button("Red");
		blueBtn = new Button("blue");
		add(redBtn);//������ ��ư�߰�
		add(blueBtn);//������ ��ư�߰�
		
		ButtonListener handler = new ButtonListener();
		redBtn.addActionListener(handler); //�� ��ư �̺�Ʈ ���
		blueBtn.addActionListener(handler); //�� ��ư �̺�Ʈ ���
		
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
		System.out.println("��ư�� Ŭ��");
	}
}
public class Gui06 {
	public static void main(String[] args) {
		new Frame06();
	}
}