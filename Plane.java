package Travel_Counter;
public class Plane extends Travel{

    
     @Override
     public void tripTime(int dis){

      int tripTime= dis/500;
      label3.setText("--------------- Your Trip Will Take About "+tripTime+":00 Hourse --------------- ");       
      label3.setBounds(5, 130, 1000, 50);
      label4.setText("The Time Is Approximate..Thank You For Using Travel Counter ❤ ...");
      label4.setBounds(50,160 , 1000, 50);
   
    }
     
    
}
