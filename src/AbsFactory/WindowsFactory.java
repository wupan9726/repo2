package AbsFactory;

import org.w3c.dom.Text;

public class WindowsFactory implements AbsFactory {

    @Override
    public Button creatButton() {
        return new WindowsButton();
    }

    @Override
    public Lable creatLable() {
        return new WindowsLable();
    }

    @Override
    public TextBox creatTextBox() {
        return new WindowsText();
    }
    @Override
    public void show(AbsFactory factory){
        Button button=factory.creatButton();
        button.buttonType();
        Lable lable=factory.creatLable();
        lable.lableType();
        TextBox textbox=factory.creatTextBox();
        textbox.textType();
    }
}
