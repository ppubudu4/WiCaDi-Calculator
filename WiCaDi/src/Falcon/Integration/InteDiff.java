package Falcon.Integration;
/**
 *
 * @author Falcon -> Nethmi,Pubudu,Achintha,Rajitha,Mano(Team Falcon)
 */
//import Falcon.Integration.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.*;
import javax.swing.border.*;

public class InteDiff {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                InteDiff window = new InteDiff();
                window.initialize();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });


    }

    public void initialize() {
        JFrame intediff = new JFrame();
        intediff.setTitle("WiCaDi");
        intediff.setBounds(100, 100, 400, 500);
        intediff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        intediff.getContentPane().setLayout(null);
        intediff.setVisible(true);
        intediff.setSize(550, 450);
//        intediff.setBackground(Color.WHITE);
        intediff.setForeground(Color.RED);
        


        JTextField  jTextpolinomial1= new JTextField();
        jTextpolinomial1.setText("");
        jTextpolinomial1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        jTextpolinomial1.setBounds(200, 25, 300, 45);
        intediff.getContentPane().add(jTextpolinomial1);
        jTextpolinomial1.setColumns(10);

        JTextField jTextpolinomial2 = new JTextField();
        jTextpolinomial2.setText("");
        jTextpolinomial2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        jTextpolinomial2.setBounds(200, 100, 300, 45);
        intediff.getContentPane().add(jTextpolinomial2);
        jTextpolinomial2.setColumns(10);

        JLabel jlabelpolinomial1 = new JLabel();
        jlabelpolinomial1.setText("Polynomial 1 :- ");
        jlabelpolinomial1.setBounds(15, 35, 100, 25);
        intediff.getContentPane().add(jlabelpolinomial1);


        JLabel jlabelpolinomial2 = new JLabel();
        jlabelpolinomial2.setText("Polynomial 2 :- ");
        jlabelpolinomial2.setBounds(15, 110, 100, 25);
        intediff.getContentPane().add(jlabelpolinomial2);

        JLabel jlabelpolinomial3 = new JLabel();
        jlabelpolinomial3.setText("Answer ...");
        jlabelpolinomial3.setBounds(15, 330, 100, 25);
        intediff.getContentPane().add(jlabelpolinomial3);
        
        JButton add = new JButton();
        add.setText("+");
        add.setBounds(210, 180, 50, 45);
        add.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        add.setHorizontalAlignment(JButton.CENTER);
        add.setVerticalAlignment(JButton.CENTER);
        add.setBorder( new LineBorder(Color.WHITE) );
        add.setBackground(Color.ORANGE);
        add.setForeground(Color.WHITE);
        // these next two lines do the magic..
        add.setContentAreaFilled(false);
        add.setOpaque(true);
        intediff.add(add);

        JButton sub = new JButton();
        sub.setText("-");
        sub.setBounds(260, 180, 50, 45);
        sub.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        sub.setHorizontalAlignment(JButton.CENTER);
        sub.setVerticalAlignment(JButton.CENTER);
        sub.setBorder( new LineBorder(Color.WHITE) );
        sub.setBackground(Color.ORANGE);
        sub.setForeground(Color.WHITE);
        // these next two lines do the magic..
        sub.setContentAreaFilled(false);
        sub.setOpaque(true);
        intediff.add(sub);

        JButton mul = new JButton();
        mul.setText("*");
        mul.setBounds(310, 180, 50, 45);
        mul.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        mul.setHorizontalAlignment(JButton.CENTER);
        mul.setVerticalAlignment(JButton.CENTER);
        mul.setBorder( new LineBorder(Color.WHITE) );
        mul.setBackground(Color.ORANGE);
        mul.setForeground(Color.WHITE);
        // these next two lines do the magic..
        mul.setContentAreaFilled(false);
        mul.setOpaque(true);
        intediff.add(mul);

        JButton div = new JButton();
        div.setText("/");
        div.setBounds(360, 180, 50, 45);
        div.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        div.setHorizontalAlignment(JButton.CENTER);
        div.setVerticalAlignment(JButton.CENTER);
        //div.setEnabled(false);
        div.setBorder( new LineBorder(Color.WHITE) );
        div.setBackground(Color.ORANGE);
        div.setForeground(Color.WHITE);
        // these next two lines do the magic..
        div.setContentAreaFilled(false);
        div.setOpaque(true);
        intediff.add(div);


        JTextField jTextresult = new JTextField();
        jTextresult.setEditable(false);
        jTextresult.setBounds(200, 330, 300, 45);
        jTextresult.setHorizontalAlignment(JTextField.CENTER);
        intediff.getContentPane().add(jTextresult);
        jTextresult.setColumns(10);

        
        JButton der = new JButton();
        der.setText("Dif");
        der.setBounds(200, 235, 100, 72);
        der.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
        der.setHorizontalAlignment(JButton.CENTER);
        der.setVerticalAlignment(JButton.CENTER);
        der.setBorder( new LineBorder(Color.WHITE) );
        der.setBackground(Color.ORANGE);
        der.setForeground(Color.WHITE);
        // these next two lines do the magic..
        der.setContentAreaFilled(false);
        der.setOpaque(true);
        intediff.getContentPane().add(der);

        JButton integ = new JButton();
        integ.setText("Int");
        integ.setBounds(345, 235, 100, 72);
        integ.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
        integ.setHorizontalAlignment(JButton.CENTER);
        integ.setVerticalAlignment(JButton.CENTER);
        intediff.getContentPane().add(integ);
        integ.setBorder( new LineBorder(Color.WHITE) );
        integ.setBackground(Color.ORANGE);
        integ.setForeground(Color.WHITE);
        // these next two lines do the magic..
        integ.setContentAreaFilled(false);
        integ.setOpaque(true);
        

        ArrayList <JButton> button = new ArrayList <JButton>();
        button.add(add);
        button.add(sub);
        button.add(div);
        button.add(mul);
        button.add(der);
        button.add(integ);

        for (JButton a : button) {
            AtomicInteger ok = new AtomicInteger(1);
            a.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Polinomial poli1 = new Polinomial(jTextpolinomial1.getText());
                    Polinomial poli2 = new Polinomial(jTextpolinomial2.getText());
                    Polinomial op = IO.getInstance(a.getText()).compute(poli1, poli2);
                    ResultType divop = new ResultType();

                    if (a.equals(div)) {
                        if (jTextpolinomial2.getText().equals("") || jTextpolinomial2.getText().equals("0") || jTextpolinomial2.getText().equals("0x^0") || jTextpolinomial2.getText().equals("0x^")) {
                            JOptionPane.showMessageDialog(intediff, "Null", "Eror", JOptionPane.ERROR_MESSAGE);
                            ok.set(0);
                        } else
                            divop = new Divition().computeR(poli1, poli2);
                    }


                    Collections.sort(op.getElem(), new Comparator<Formula>() {
                        @Override
                        public int compare(Formula a, Formula b) {
                            return b.getGrad() - a.getGrad();
                        }
                    });

                    if (a.equals(div) && ok.get() == 1)
                        jTextresult.setText(divop.toString());
                    else
                        jTextresult.setText(op.toString());

                }
            });
        }
    }
}
