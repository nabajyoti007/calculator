import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{

    JFrame f;
    JTextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, bclr, bsum, bsub, bmul, bdiv,bmod,bequ;
    JPanel p1,p2;
    double num1=0,num2=0,result=0;
    char operator;

    Calculator() {
        f = new JFrame("Calculator");

        t = new JTextField();
        t.setBounds(50,25,300,50);
        t.setEditable(false);

        b1 = new JButton("1");
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.addActionListener(this);

        b0 = new JButton("0");
        b0.addActionListener(this);

        bdot = new JButton(".");
        bdot.addActionListener(this);

        bclr = new JButton("CLR");
        bclr.addActionListener(this);

        bsum = new JButton("+");
        bsum.addActionListener(this);

        bsub = new JButton("-");
        bsub.addActionListener(this);

        bmul = new JButton("*");
        bmul.addActionListener(this);

        bdiv = new JButton("/");
        bdiv.addActionListener(this);

        bmod = new JButton("%");
        bmod.addActionListener(this);

        bequ = new JButton("=");
        bequ.addActionListener(this);

        p1 = new JPanel();
        p1.setBounds(50, 100, 225, 300);
        p1.setLayout(new GridLayout(4,3));

        p2 = new JPanel();
        p2.setBounds(275, 100, 75, 300);
        p2.setLayout(new GridLayout(6,1));

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b0);
        p1.add(bdot);
        p1.add(bclr);

        p2.add(bsum);
        p2.add(bsub);
        p2.add(bmul);
        p2.add(bdiv);
        p2.add(bmod);
        p2.add(bequ);


        f.add(p1);
        f.add(p2);
        f.add(t);
        f.setSize(425,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }


    public static void main(String[] args) {

        new Calculator();

    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));
        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));
        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));
        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));
        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));
        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));
        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));
        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));
        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));
        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));
        if(e.getSource()==bdot)
            t.setText(t.getText().concat("."));
        if(e.getSource()==bclr)
            t.setText("");
        if(e.getSource()==bsum)
        {
            num1=Double.parseDouble(t.getText());
            operator='+';
            t.setText("");
        }
        if(e.getSource()==bsub)
        {
            num1=Double.parseDouble(t.getText());
            operator='-';
            t.setText("");
        }
        if(e.getSource()==bmul)
        {
            num1=Double.parseDouble(t.getText());
            operator='*';
            t.setText("");
        }
        if(e.getSource()==bdiv)
        {
            num1=Double.parseDouble(t.getText());
            operator='/';
            t.setText("");
        }
        if(e.getSource()==bmod)
        {
            num1=Double.parseDouble(t.getText());
            operator='%';
            t.setText("");
        }
        if(e.getSource()==bequ)
        {
            num2=Double.parseDouble(t.getText());

            switch (operator)
            {
                case '+' :
                    result=num1+num2;
                    break;

                case '-' :
                    result=num1-num2;
                    break;

                case '*' :
                    result=num1*num2;
                    break;

                case '/' :
                    result=num1/num2;
                    break;

                case '%' :
                    result=num1%num2;
                    break;

                default :
                    result=0;
            }
            t.setText(""+result);
        }
    }
}
