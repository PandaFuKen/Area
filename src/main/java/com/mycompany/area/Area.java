

package com.mycompany.area;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Area extends JFrame implements ActionListener{
    private JLabel lb1 ,lba , lbb , lbc, lbp , lbaa;
    private JTextField txt1,txta ,txtb , txtc ,txtp, txtaa;
    private JButton b1 , b2;
    
    public Area(){
       setTitle("Triangulo");
       setLayout(null);
       //Texto de inicio
       lb1 = new JLabel("Ingresa tus valores "
               + "\t para calcular Perimetro y Area");
       lb1.setBounds(50,10 ,300 , 40);
       add(lb1);
       //JButton
       b1 = new JButton("ACEPTAR");
       b1.setBounds(230 , 100 , 100 , 30);
       add(b1);
       b1.addActionListener(this);
       
       b2 = new JButton("Cerrar");
       b2.setBounds(230 , 400 , 100 , 30);
       add(b2);
       b2.addActionListener(this);
       //a
       lba = new JLabel("Ingresa el valor de a");
       lba.setBounds(10 , 50 , 200, 30);
       add(lba);
       
       txta = new JTextField("");
       txta.setBounds(140,50,50, 30);
       add(txta);
       
       //b 
       lbb = new JLabel("Ingresa el valor de b ");
       lbb.setBounds(10 , 100, 200, 30);
       add(lbb);
       
       txtb = new JTextField("");
       txtb.setBounds(140 , 100 , 50 , 30);
       add(txtb);
       
      //c 
      lbc = new JLabel("Ingresa el valor de c");
      lbc.setBounds(10 , 150 , 200, 30 );
      add(lbc);
      
      txtc = new JTextField("");
      txtc.setBounds(140 , 150 , 50 ,30);
      add(txtc);
      
      //Perimetro
      lbp = new JLabel("Perimetro");
      lbp.setBounds(10 , 200 , 70 , 30);
      add(lbp);
      
      txtp = new JTextField("");
      txtp.setBounds(70 , 200 , 70 , 30);
      add(txtp);
      
      //Area
      lbaa = new JLabel("Area");
      lbaa.setBounds(10 , 250 , 50 , 30 );
      add(lbaa);
      
      txtaa = new JTextField("");
      txtaa.setBounds(70 , 250 , 70 , 30);
      add(txtaa);
       
       
       
    
}
   
    public void actionPerformed(ActionEvent ae){
        double  a ,b ,c ,p , are,po;
        
        if(ae.getSource()==b1){
            a = Double.parseDouble(txta.getText());
            b = Double.parseDouble(txtb.getText());
            c = Double.parseDouble(txtc.getText());
            
            p = (a)+(b)+(c)/(2);
            are = (p*(p-a)*(p-b)*(p-c));
            po = Math.pow(are, 1/2);
            
            txtp.setText(""+po);
            txtaa.setText(""+are);
      
        }
        if(ae.getSource()==b2){
            System.exit(0);
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Area window1 = new Area();
        window1.setBounds(10 , 10 , 400, 500);
        window1.setVisible(true);
        window1.setLocationRelativeTo(null);
        window1.setResizable(false);
        window1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window1.getContentPane().setBackground(Color.CYAN); 
         
    }

    
    
}
