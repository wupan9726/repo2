package Computer;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void off() {
        System.out.println("关闭鼠标");
    }
    public void kick(){
        System.out.println("点击鼠标");
    }
}
