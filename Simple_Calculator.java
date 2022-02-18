import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class simple_calculator {
	 simple_calculator() {

		    JFrame f = new JFrame();
		    f.setSize(500, 500);

		    JLabel l = new JLabel("Calculator");
		    l.setBounds(227, 10, 400, 30);
		    f.add(l);

		    JTextField t = new JTextField();
		    t.setEditable(false);
		    t.setBounds(50, 50, 400, 30);
		    f.add(t);

		    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bclr, clear, dot;

		    b1 = new JButton("1");
		    b2 = new JButton("2");
		    b3 = new JButton("3");
		    b4 = new JButton("4");
		    b5 = new JButton("5");
		    b6 = new JButton("6");
		    b7 = new JButton("7");
		    b8 = new JButton("8");
		    b9 = new JButton("9");
		    b0 = new JButton("0");
		    bdiv = new JButton("/");
		    bmul = new JButton("*");
		    bsub = new JButton("-");
		    badd = new JButton("+");
		    bdec = new JButton(".");
		    beq = new JButton("=");
		    clear = new JButton("Clear");
		    dot = new JButton(".");

		    b7.setBounds(90, 100, 50, 40);
		    b8.setBounds(180, 100, 50, 40);
		    b9.setBounds(270, 100, 50, 40);
		    bdiv.setBounds(360, 100, 50, 40);

		    b4.setBounds(90, 170, 50, 40);
		    b5.setBounds(180, 170, 50, 40);
		    b6.setBounds(270, 170, 50, 40);
		    bmul.setBounds(360, 170, 50, 40);

		    b1.setBounds(90, 240, 50, 40);
		    b2.setBounds(180, 240, 50, 40);
		    b3.setBounds(270, 240, 50, 40);
		    bsub.setBounds(360, 240, 50, 40);

		    bdec.setBounds(90, 310, 50, 40);
		    b0.setBounds(180, 310, 50, 40);
		    beq.setBounds(270, 310, 50, 40);
		    badd.setBounds(360, 310, 50, 40);
		    clear.setBounds(200, 400, 90, 40);
		    dot.setBounds(250, 470, 50, 40);

		    f.add(b7);
		    f.add(b8);
		    f.add(b9);
		    f.add(bdiv);
		    f.add(b4);
		    f.add(b5);
		    f.add(b6);
		    f.add(bmul);
		    f.add(b1);
		    f.add(b2);
		    f.add(b3);
		    f.add(bsub);
		    f.add(bdec);
		    f.add(b0);
		    f.add(beq);
		    f.add(badd);
		    f.add(clear);
		    f.add(dot);

		    f.setLayout(null);
		    f.setResizable(false);
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    f.setVisible(true);

		    b1.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "1");
		      }
		    });
		    
		    b2.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "2");
		      }
		    });
		    
		    b3.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "3");
		      }
		    });
		    
		    b4.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "4");
		      }
		    });
		    
		    b5.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "5");
		      }
		    });
		    
		    b6.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "6");
		      }
		    });
		    
		    b7.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "7");
		      }
		    });
		    
		    b8.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "8");
		      }
		    });
		    
		    b9.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "9");
		      }
		    });
		    
		    b0.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "0");
		      }
		    });
		    
		    clear.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText("");
		      }
		    });
		    
		    dot.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + ".");
		      }
		    });
		    
		    badd.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "+");
		      }
		    });
		    
		    bsub.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "-");
		      }
		    });
		    
		    bmul.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "X");
		      }
		    });
		    
		    bdiv.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (t.getText().equals("Enter two operands!") || t.getText().equals("Not defined!"))
		          t.setText("");
		        t.setText(t.getText() + "/");
		      }
		    });

		    beq.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        try {
		          String S = t.getText();
		          int i = 0;
		          char b = S.charAt(i);
		          
		          while (b != '+' && b != '-' && b != 'X' && b != '/' && b != '%') {
		            i++;
		            b = S.charAt(i);
		          }
		          
		          Float x, y, ans = 0f;
		          x = Float.parseFloat(S.substring(0, i));
		          y = Float.parseFloat(S.substring(i + 1, S.length()));
		          
		          if (b == '+') {
		            ans = x + y;
		          } else if (b == '-') {
		            ans = x - y;
		          } else if (b == 'X') {
		            ans = x * y;
		          } else if (b == '/') {
		            ans = x / y;
		          }
		          if (b == '/' && y == 0) {
		            t.setText("Not defined!");
		          } else {
		            t.setText(ans + "");
		          }
		        } catch (Exception ex) {
		          t.setText("Enter two operands!");
		        }
		      }
		    });
		  }

	 public static void main(String[] args) {
		    new simple_calculator();
		  }
}

