import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class traffic_light  extends JFrame implements ActionListener {
	
	JLabel label;
    JTextField display;
    JRadioButton r1,r2,r3;
    ButtonGroup bg;
    Container c;

    traffic_light()
    {
    	setLayout(new FlowLayout());
        c = getContentPane();
        label = new JLabel(" Traffic Light");
        display = new JTextField(20);

        r1 = new JRadioButton("Stop");
        r2 = new JRadioButton("Go");
        r3 = new JRadioButton("Wait");
        
        bg = new ButtonGroup();
        
        c.add(label);
        c.add(r1);
        c.add(r2);
        c.add(r3);
        c.add(display);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        setSize(400,400);
        setVisible(true);
        c.setBackground(Color.white);
}

public void actionPerformed(ActionEvent ie)
{
  if(ie.getSource()==r1)
  {
    c.setBackground(Color.red);
    display.setText("STOP");
  }
  else if (ie.getSource()==r3)
  {
    c.setBackground(Color.yellow);
    display.setText("WAIT");
   }
  else if (ie.getSource()==r2)
   {
    c.setBackground(Color.green);
    display.setText("GO");
   }
}

public static void main(String[] args) {

       new traffic_light ();
}

}

