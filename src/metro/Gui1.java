package metro;
/** 
 * ���ܣ�GUI���� 
 */  
import javax.swing.*;  
import java.awt.*;  
  
//JFrame��һ�����������ࣨ�����������swing������ࣩ  
public class Gui1 extends JFrame {  
    //��Ҫ��swing��������嵽����  
    JButton jb1 = null;  
    // ���캯��  
    public Gui1() {  
          
        // ������һ��Button��ť  
        jb1 = new JButton("��ť");  
          
        // ������  
        add(jb1);  
          
        // ���������ñ���  
        setTitle("hello,world!");  
  
        // ���ô�С�������ؼ���  
        setSize(200, 200);  
        // ���ó�ʼλ��  
        setLocation(100, 200);  
        // ���õ����ڹر�ʱ����֤JVMҲ�˳�  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        // ��ʾ  
        setVisible(true);  
    }  
    public static void main(String[] args) {  
        Gui1 gui1 = new Gui1();  
    }  
}  