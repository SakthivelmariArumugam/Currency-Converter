import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Currency_Conveter {
    public static void converter()
    {
        JFrame jf=new JFrame("Currency Conveter");
        JLabel l1,l2,l0;
        JTextField t1,t2;
        JButton b1,b2,b3;
        l0=new JLabel("Currency Conveter");
        l0.setBounds(550,50,500,150);
        l0.setFont(l0.getFont().deriveFont(50f));
        l1=new JLabel("Indian Rupees");
        l1.setBounds(350,200,200,100);
        l1.setFont(l1.getFont().deriveFont(24f));
        l1.setForeground(Color.green);
        l2=new JLabel("Usa dollars");
        l2.setBounds(850,200,200,100);
        l2.setFont(l1.getFont().deriveFont(24f));
        l2.setForeground(Color.blue);
        b1=new JButton("Dollars");
        b1.setBounds(500,300,150,50);
        b1.setFont(b1.getFont().deriveFont(20f));
        b1.setBackground(Color.blue);
        b2=new JButton("Rupees");
        b2.setBounds(1000,300,150,50);
        b2.setFont(b1.getFont().deriveFont(20f));
        b2.setBackground(Color.green);
        t1=new JTextField("0");
        t1.setFont(t1.getFont().deriveFont(20f));
        t1.setBounds(580,220,200,50);
        t2=new JTextField("0");
        t2.setFont(t2.getFont().deriveFont(20f));
        t2.setBounds(1050,220,200,50);
        b3=new JButton("Close");
        b3.setBounds(750,300,150,50);
        b3.setFont(b3.getFont().deriveFont(20f));
        jf.add(l0);
        jf.add(l1);
        jf.add(l2);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(t1);
        jf.add(t2);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double s1=Double.parseDouble(t1.getText());
                double cal1=s1/83.30;
                String val1=String.valueOf(cal1);
                t2.setText(val1);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double s2=Double.parseDouble(t2.getText());
                double cal2=s2*83.50;
                String val2=String.valueOf(cal2);
                t2.setText(val2);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.dispose();
            }
        });
    }
    public static void main(String args[])
    {
        converter();
    }
}
