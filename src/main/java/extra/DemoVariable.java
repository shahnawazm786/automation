package extra;


public class DemoVariable {
    public static void main(String[] args) {
        ParentClassVariable p=new ParentClassVariable();
        System.out.println(p.speed);
        p.disp();
        SubClassVariable s=new SubClassVariable();
        System.out.println(s.speed);
        s.disp();
        ParentClassVariable p1=new SubClassVariable();
        System.out.println(p1.speed);
        p1.disp();

    }
}
