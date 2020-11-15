package AbsFactory;

public class MotifFactory implements AbsFactory {

    @Override
    public Button creatButton() {
        return new MotifButton();
    }

    @Override
    public Lable creatLable() {
        return new MotifLable();
    }

    @Override
    public TextBox creatTextBox() {
        return new MotifText();
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
