import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Test6 extends JFrame{
	public Test6() {		
		Container con = this.getContentPane();  	
    	con.setLayout(new FlowLayout());  	
    	JTextField jtf = new JTextField("");
    	jtf.setPreferredSize(new Dimension(150, 20));
    	//��Ӱ���������
    	jtf.addKeyListener(new KeyAdapter() {
            //�����������ַ�'a'����ô���ַ����'A'
			public void keyTyped(KeyEvent e) {
                if(e.getKeyChar() == KeyEvent.VK_A)
                {
                	System.out.println("�����˼���"+e.getKeyChar());
                	e.setKeyChar((char)(KeyEvent.VK_A+32));
                	System.out.println("ת���Ժ�Ϊ��"+e.getKeyChar());
                }
				super.keyTyped(e);
			}
			public void keyPressed(KeyEvent e) {
                System.out.println("�������룡");
				super.keyPressed(e);
			}
			public void keyReleased(KeyEvent e) {
		        System.out.println("�����ͷţ�");
				super.keyReleased(e);
			}   		
		});    	
    	con.add(jtf); 


	}

	
	public static void main(String[] args){
		int i=10;
		i=i++;
		System.out.println(i);
	}
}


