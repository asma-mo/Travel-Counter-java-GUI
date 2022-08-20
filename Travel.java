package Travel_Counter;
import javax.swing.*;
import java.awt.*;
public class Travel {
 

    
  Font f=new Font("Baghdad",Font.PLAIN,11);
    
  JLabel label2=new JLabel();
  JLabel label3=new JLabel();
  JLabel label4=new JLabel();
  JLabel label5=new JLabel();
  
  JButton r=new JButton();
  JButton d=new JButton();
  JButton m=new JButton();
  JButton j=new JButton();
    
  JButton br1=new JButton();
  JButton br2=new JButton();
  JButton br3=new JButton();
    
     
      
    
  
    public void City(){
     label2.setText("Choose One Of The Following Cities You Want To Travel To:");       
     label2.setBounds(70, 70, 1000, 50);
    }
    
    public void Cities(){
        
        r.setText("Riyadh");
        r.setBounds(80,110,50,20);
        d.setText("Dammam");
        d.setBounds(180,110,60,20);
        m.setText("Mecca");
        m.setBounds(280,110,50,20);
        j.setText("Jeddah");
        j.setBounds(380,110,50,20);
        
        r.setFont(f);
        d.setFont(f);
        j.setFont(f);
        m.setFont(f);
    }
    
    public void tripTime(int dis){

      int tripTime= dis;
      label3.setText("--------------- Your Trip Will Take About "+tripTime+":00 Hourse --------------- ");       
      label3.setBounds(5, 130, 1000, 50);
      label4.setText("The Time Is Approximate..Thank You For Using Travel Counter ...");
      label4.setBounds(50,160 , 1000, 50);
   
    }
    
    public void Break(){
        
       label5.setText("How Many Break You Will Take?");
       label5.setBounds(150, 130, 1000, 50);
       
       br1.setText("One");
       br1.setBounds(125,170,50,20);
       br2.setText("Two");
       br2.setBounds(225,170,50,20);
       br3.setText("Three");
       br3.setBounds(325,170,50,20);
       
       br1.setFont(f);
       br2.setFont(f);
       br3.setFont(f);

    }
    
    
    
}
