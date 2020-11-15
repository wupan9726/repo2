package AbsFactory;


public class Client {
    public static void main(String[] args) {
        AbsFactory factory=new WindowsFactory();
        Button button=factory.creatButton();
        button.buttonType();
        Lable lable=factory.creatLable();
        lable.lableType();
        TextBox textbox=factory.creatTextBox();
        textbox.textType();
        System.out.println("---------------------");
        AbsFactory factory1=new MotifFactory();
        Button button1=factory1.creatButton();
        button1.buttonType();
        Lable lable1=factory1.creatLable();
        lable1.lableType();
        TextBox textbox1=factory1.creatTextBox();
        textbox1.textType();
        System.out.println("---------------------");
        factory.show(factory);
        factory1.show(factory1);
    }
}
