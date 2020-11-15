package Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.openDevic();
        USB mouse=new Mouse();
        computer.useDevice(mouse);
        USB keyboard =new KeyBoard();
        computer.useDevice(keyboard);
        computer.offDevice();
    }
}
