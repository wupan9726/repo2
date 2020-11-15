package AbsFactory;


public interface AbsFactory {
    public Button creatButton();
    public Lable creatLable();
    public TextBox creatTextBox();
    public abstract void show(AbsFactory factory);
}
