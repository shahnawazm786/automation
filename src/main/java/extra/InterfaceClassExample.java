package extra;

public class InterfaceClassExample implements IExample{

    @Override
    public void add() {
        System.out.println("Add method");
    }

    @Override
    public void substract() {
        System.out.println("Substract method");
    }

    @Override
    public void multiply() {
        System.out.println("Multiply method");
    }
    public void divide(){
        System.out.println("Divide method");
    }
    public void modulo(){
        System.out.println("Modulo method");
    }
}
