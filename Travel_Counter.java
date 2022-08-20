package Travel_Counter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Travel_Counter{
    public static void main(String[] args) {
      
    Plane plane=new Plane();
    Car car=new Car();

    
    JFrame frame=new JFrame("Travel Counter");
    frame.setSize(525,400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLayout(null);

     
    JPanel panel = new JPanel(null);
    
       panel.setBorder(BorderFactory.createTitledBorder("Travel Counter"));
       panel.setBounds(5, 5,520, 370);
       panel.setBackground(Color.WHITE);
    
       
JLabel i=new JLabel(new ImageIcon("/Users/asma/Desktop/Userinterfaces/html-1/ooo.JPG"));// Her we added image
    i.setBounds(1,60,480,320);       ///Users/asma/Desktop/Icons1000/ooo.jpg
       
   Font f=new Font("Baghdad",Font.PLAIN,11);
       frame.setFont(f);
    
   
    JLabel label1=new JLabel("Do You Want To Travel By A Plane Or A Car?");
    label1.setBounds(100, 10, 1000, 50);
  
    
    JButton b1=new JButton("Plane");
    JButton b2=new JButton("Car");
 
    b1.setBounds(150, 50, 35, 20);
    b2.setBounds(300, 50, 35, 20);
    
    b1.setFont(f);
    b2.setFont(f);

  
    panel.add(label1);
    panel.add(b1);
    panel.add(b2);

    panel.add(plane.label2);// From this line we added components from Plane class by it't object plane
    panel.add(plane.r);
    panel.add(plane.d);
    panel.add(plane.m);
    panel.add(plane.j);
    panel.add(plane.label3);
    panel.add(plane.label4);//To this line 
   
    
    panel.add(car.label2);// Her we added Components from Car class by it's object car
    panel.add(car.r);
    panel.add(car.d);
    panel.add(car.m);
    panel.add(car.j);
    panel.add(car.label5);
    panel.add(car.br1);
    panel.add(car.br2);
    panel.add(car.br3);
    panel.add(car.label3);
    panel.add(car.label4);
    panel.add(car.label6);// Into this line
    
  b1.addActionListener(new ActionListener() {    //If The User Click "Plane" this set of instruction will run
            @Override
            public void actionPerformed(ActionEvent e) {
               
              plane.City();
              plane.Cities();
                
                {// Her the button options started 
                
    plane.r.addActionListener(new ActionListener() {    //Button "Riyadh"
            @Override
            public void actionPerformed(ActionEvent e) {
               plane.tripTime(628);
            }});
                    
    plane.d.addActionListener(new ActionListener() {    //Button "Dammam"
            @Override
            public void actionPerformed(ActionEvent e) {  
              plane.tripTime(1026);
            }});
     
    plane.m.addActionListener(new ActionListener() {    //Button "Mecca"
            @Override
            public void actionPerformed(ActionEvent e) { 
               plane.tripTime(688);
            }});
                 
    plane.j.addActionListener(new ActionListener() {    //Button "Jedah"
            @Override
            public void actionPerformed(ActionEvent e) {
               plane.tripTime(768);
            }});

                }//The Button options ends
            }
        });
     
      //---------------------------------------------------------------------------
   
   b2.addActionListener(new ActionListener() {    //If The User Click "Car" this set of instruction will run
            @Override
            public void actionPerformed(ActionEvent e) {
                car.City();
                car.Cities();
                
                {// This braces for arrange the options
        car.r.addActionListener(new ActionListener() {    //Button "Riyadh"
            @Override
            public void actionPerformed(ActionEvent e) {
              car.Break();
               
                car.br1.addActionListener(new ActionListener() {    // One Break
                @Override
                public void actionPerformed(ActionEvent e) {
                car.tripTime(628,15);
                 }});
                 car.br2.addActionListener(new ActionListener() {     // Two Break
                 @Override
                 public void actionPerformed(ActionEvent e) {
                car.tripTime(628,30);
                 }});
                car.br3.addActionListener(new ActionListener() {    //Three Break
                @Override
                public void actionPerformed(ActionEvent e) {
                car.tripTime(628,45);
                 }});
    
            }});
                    
        car.d.addActionListener(new ActionListener() {    //Button "Dammam"
            @Override
            public void actionPerformed(ActionEvent e) {
               car.Break();
               
            car.br1.addActionListener(new ActionListener() {    //One Break
            @Override
            public void actionPerformed(ActionEvent e) {
               car.tripTime(1026,15);
            }});
            
            car.br2.addActionListener(new ActionListener() {    //two Break
            @Override
            public void actionPerformed(ActionEvent e) {
               car.tripTime(1026,30);
            }});
            
            car.br3.addActionListener(new ActionListener() {    //Three Break
            @Override
            public void actionPerformed(ActionEvent e) {
              car.tripTime(1026,45);
            }});
    
            }});
             
        car.m.addActionListener(new ActionListener() {    //Button "Mecca
            @Override
            public void actionPerformed(ActionEvent e) {
               car.Break();
               
            car.br1.addActionListener(new ActionListener() {   //One break 
            @Override
            public void actionPerformed(ActionEvent e) {
               car.tripTime(688,15);
            }});
            
            car.br2.addActionListener(new ActionListener() {    //two Break
            @Override
            public void actionPerformed(ActionEvent e) {
               car.tripTime(688,30);
            }});
            
            car.br3.addActionListener(new ActionListener() {    //Three Break
            @Override
            public void actionPerformed(ActionEvent e) {
               car.tripTime(688,45);
            }});
    
            }});
        
        car.j.addActionListener(new ActionListener() {    // Butto "Jedah"
            @Override
            public void actionPerformed(ActionEvent e) {
               car.Break();
               
            car.br1.addActionListener(new ActionListener() {    //One Break
            @Override
            public void actionPerformed(ActionEvent e) {
              car.tripTime(768,15);
            }});
            
            car.br2.addActionListener(new ActionListener() {    //Two Break
            @Override
            public void actionPerformed(ActionEvent e) {
              car.tripTime(768,30);
            }});
            
            car.br3.addActionListener(new ActionListener() {    //Three Break
            @Override
            public void actionPerformed(ActionEvent e) {
             car.tripTime(768,45);
            }});
    
            }});
     
                }//her the options ends
                
                
            }});
    
    
    
    
  frame.add(panel);//Add The Panel into the Frame
  panel.add(i);//Add the image into tha Panel
    
       
        
    }
    
}
