package Travel_Counter;
import javax.swing.JLabel;
public class Car extends Travel{
   
    JLabel label6=new JLabel();
    
     public void tripTime(int dis,int min){

      int tripTime= dis/120;
      label3.setText("--------------- Your Trip Will Take About "+tripTime+":"+min+" Hourse --------------- ");       
      label3.setBounds(5, 210, 1000, 50);
      label4.setText("The Time Is Approximate..");
      label4.setBounds(200,240 , 1000, 50);
      label6.setText("Thank You For Using Travel Counter ❤ ...");
      label6.setBounds(200, 270, 1000, 50);
    }
    
    
    
}
