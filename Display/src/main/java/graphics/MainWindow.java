package graphics;

import 1lab.ArOperations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class MainWindow extends JFrame {

    public MainWindow(String title){
        super(title);

        this.setLayout(new GridLayout(7,1));

        String error = "Invalid input";

        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(new JLabel("Addition"));
        JTextField aAdd = new JTextField();
        aAdd.setPreferredSize(new Dimension(100,20));
        JTextField bAdd = new JTextField();
        bAdd.setPreferredSize(new Dimension(100,20));
        JTextField resAdd = new JTextField();
        resAdd.setPreferredSize(new Dimension(100,20));
        JButton equalAdd = new JButton("=");
        p1.add(aAdd);
        p1.add(new JLabel("+"));
        p1.add(bAdd);
        p1.add(equalAdd);
        p1.add(resAdd);
        JLabel errorAdd = new JLabel(error);
        errorAdd.setForeground(Color.red);
        errorAdd.setVisible(false);
        p1.add(errorAdd);

        JPanel p2 = new JPanel(new FlowLayout());
        p2.add(new JLabel("Substraction"));
        JTextField aSub = new JTextField();
        aSub.setPreferredSize(new Dimension(100,20));
        JTextField bSub = new JTextField();
        bSub.setPreferredSize(new Dimension(100,20));
        JTextField resSub = new JTextField();
        resSub.setPreferredSize(new Dimension(100,20));
        JButton equalSub = new JButton("=");
        p2.add(aSub);
        p2.add(new JLabel("-"));
        p2.add(bSub);
        p2.add(equalSub);
        p2.add(resSub);
        JLabel errorSub = new JLabel(error);
        errorSub.setForeground(Color.red);
        errorSub.setVisible(false);
        p2.add(errorSub);

        JPanel p3 = new JPanel(new FlowLayout());
        p3.add(new JLabel("Multiplication"));
        JTextField aMul = new JTextField();
        aMul.setPreferredSize(new Dimension(100,20));
        JTextField bMul = new JTextField();
        bMul.setPreferredSize(new Dimension(100,20));
        JTextField resMul = new JTextField();
        resMul.setPreferredSize(new Dimension(100,20));
        JButton equalMul = new JButton("=");
        p3.add(aMul);
        p3.add(new JLabel("*"));
        p3.add(bMul);
        p3.add(equalMul);
        p3.add(resMul);
        JLabel errorMul = new JLabel(error);
        errorMul.setForeground(Color.red);
        errorMul.setVisible(false);
        p3.add(errorMul);

        JPanel p4 = new JPanel(new FlowLayout());
        p4.add(new JLabel("Division"));
        JTextField aDiv = new JTextField();
        aDiv.setPreferredSize(new Dimension(100,20));
        JTextField bDiv = new JTextField();
        bDiv.setPreferredSize(new Dimension(100,20));
        JTextField resDiv = new JTextField();
        resDiv.setPreferredSize(new Dimension(100,20));
        JButton equalDiv = new JButton("=");
        p4.add(aDiv);
        p4.add(new JLabel("/"));
        p4.add(bDiv);
        p4.add(equalDiv);
        p4.add(resDiv);
        JLabel errorDiv = new JLabel(error);
        errorDiv.setForeground(Color.red);
        errorDiv.setVisible(false);
        p4.add(errorDiv);

        JPanel p5 = new JPanel(new FlowLayout());
        p5.add(new JLabel("Factorial"));
        JTextField numFac = new JTextField();
        numFac.setPreferredSize(new Dimension(100,20));
        JTextField resFac = new JTextField();
        resFac.setPreferredSize(new Dimension(100,20));
        JButton equalFac = new JButton("=");
        p5.add(numFac);
        p5.add(new JLabel("!"));
        p5.add(equalFac);
        p5.add(resFac);
        JLabel errorFac = new JLabel(error);
        errorFac.setForeground(Color.red);
        errorFac.setVisible(false);
        p5.add(errorFac);

        JPanel p6 = new JPanel(new FlowLayout());
        p6.add(new JLabel("Logarithm"));
        JTextField numLog = new JTextField();
        numLog.setPreferredSize(new Dimension(100,20));
        JTextField resLog = new JTextField();
        resLog.setPreferredSize(new Dimension(100,20));
        JButton equalLog = new JButton("=");
        p6.add(numLog);
        p6.add(equalLog);
        p6.add(resLog);
        JLabel errorLog = new JLabel(error);
        errorLog.setForeground(Color.red);
        errorLog.setVisible(false);
        p6.add(errorLog);

        JPanel p7 = new JPanel(new FlowLayout());
        p7.add(new JLabel("Power"));
        JTextField aPow = new JTextField();
        aPow.setPreferredSize(new Dimension(100,20));
        JTextField bPow = new JTextField();
        bPow.setPreferredSize(new Dimension(100,20));
        JTextField resPow = new JTextField();
        resPow.setPreferredSize(new Dimension(100,20));
        JButton equalPow = new JButton("=");
        p7.add(aPow);
        p7.add(new JLabel("^"));
        p7.add(bPow);
        p7.add(equalPow);
        p7.add(resPow);
        JLabel errorPow = new JLabel(error);
        errorPow.setForeground(Color.red);
        errorPow.setVisible(false);
        p7.add(errorPow);

        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
        this.add(p7);

        ArithmeticOperations oper = new ArithmeticOperations();

        equalAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    errorAdd.setVisible(false);
                    BigDecimal a = new BigDecimal(aAdd.getText());
                    BigDecimal b = new BigDecimal(bAdd.getText());
                    resAdd.setText(String.valueOf(oper.add(a.doubleValue(), b.doubleValue())));
                }catch(NumberFormatException ex){
                    errorAdd.setVisible(true);
                }catch (NullPointerException ex){
                    errorAdd.setVisible(true);
                }
            }
        });

        equalSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    errorSub.setVisible(false);
                    BigDecimal a = new BigDecimal(aSub.getText());
                    BigDecimal b = new BigDecimal(bSub.getText());
                    resSub.setText(String.valueOf(oper.sub(a.doubleValue(), b.doubleValue())));
                }catch(NumberFormatException ex){
                    errorSub.setVisible(true);
                }catch (NullPointerException ex){
                    errorSub.setVisible(true);
                }
            }
        });

        equalMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    errorMul.setVisible(false);
                    BigDecimal a = new BigDecimal(aMul.getText());
                    BigDecimal b = new BigDecimal(bMul.getText());
                    resMul.setText(String.valueOf(oper.mul(a.doubleValue(), b.doubleValue())));
                }catch(NumberFormatException ex){
                    errorMul.setVisible(true);
                }catch (NullPointerException ex){
                    errorMul.setVisible(true);
                }
            }
        });


        equalDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    errorDiv.setVisible(false);
                    BigDecimal a = new BigDecimal(aDiv.getText());
                    BigDecimal b = new BigDecimal(bDiv.getText());
                    resDiv.setText(String.valueOf(oper.div(a.doubleValue(), b.doubleValue())));
                }catch(NumberFormatException ex){
                    errorDiv.setVisible(true);
                }catch (NullPointerException ex){
                    errorDiv.setVisible(true);
                }
            }
        });

        equalPow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    errorPow.setVisible(false);
                    BigDecimal number = new BigDecimal(aPow.getText());
                    Integer deg = Integer.parseInt(bPow.getText());
                    resPow.setText(String.valueOf(oper.pow(number.doubleValue(), deg)));
                }catch(NumberFormatException ex){
                    errorPow.setVisible(true);
                }catch (NullPointerException ex){
                    errorPow.setVisible(true);
                }
            }
        });

        equalLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    errorAdd.setVisible(false);
                    Integer number = Integer.parseInt(numLog.getText());
                    resLog.setText(String.valueOf(oper.lg(number)));
                }catch(NumberFormatException ex){
                    errorLog.setVisible(true);
                }catch (NullPointerException ex){
                    errorLog.setVisible(true);
                }
            }
        });

        equalFac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    errorFac.setVisible(false);
                    Integer number = Integer.parseInt(numFac.getText());
                    resFac.setText(String.valueOf(oper.factorial(number)));
                }catch(NumberFormatException ex){
                    errorFac.setVisible(true);
                }catch (NullPointerException ex){
                    errorFac.setVisible(true);
                }
            }
        });
    }
}
