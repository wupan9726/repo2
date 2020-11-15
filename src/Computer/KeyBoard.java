package Computer;

public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void off() {
        System.out.println("关闭键盘");
    }
    public void scanner(){
        System.out.println("键盘输入");
    }
}
