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
		
		ButtonListener2 handler = new ButtonListener2(this); //this키워드는 내자신 정보
		redBtn.addActionListener(handler);
		yellowBtn.addActionListener(handler);
		
		setSize(300,200);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose(); System.exit(0);
			}
		});
	}//생성자
}//Frame07 class

//이벤트 처리클래스
class ButtonListener2 implements ActionListener{
    Frame frm = null;
    
    public ButtonListener2() {}
    
    public ButtonListener2(Frame frm) {
    	this.frm = frm;//프레임 정보를 전달받음.
    }//생성자 오버로딩
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="red") {
			//getActionCommand()메서드는 버튼위 캡션문자열을 반환
			frm.setBackground(Color.red);//프레임 배경색을 빨강으로 변경
		}else {
			frm.setBackground(Color.YELLOW);
		}
	}//버튼 클릭했을때 호출	
}
public class Gui07 {
	public static void main(String[] args) {
		new Frame07();
	}
}
