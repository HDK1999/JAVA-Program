import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
public class SWTDemo {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		//���ô��ڵı���
		shell.setText("Hello,SWT ");
		shell.open();  //��ʾ����
		//��ⴰ���Ƿ��ͷţ�����ͷŲ��Ҳ������¼���Ҫ�����ͷ�display
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}
