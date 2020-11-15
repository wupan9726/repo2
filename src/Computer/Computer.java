package Computer;


import java.security.Key;

public class Computer {
   public void openDevic(){
       System.out.println("打开电脑");
   }
   public void offDevice(){
       System.out.println("关闭电脑");
   }
   public void useDevice(USB usb){
       usb.open();
       if(usb instanceof Mouse){
           Mouse mouse=(Mouse) usb;
           mouse.kick();
       }else if(usb instanceof KeyBoard){
           KeyBoard keyBoard=(KeyBoard) usb;
           keyBoard.scanner();
       }
       usb.off();
   }


}
