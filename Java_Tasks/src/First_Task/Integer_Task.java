package First_Task;
public class Integer_Task {
    public int Add(int x, int y) {
        return x+y;
    }
    public int Sub(int x, int y) {
        return x-y;
    }
    public int Mul(int x, int y) {
        return x*y;
    }
    public int Div(int x, int y) {
        return x/y;
    }
    public static void main(String[] args) {
        Integer_Task obj = new Integer_Task();
        System.out.println("Addition = "+obj.Add(30, 10));
        System.out.println("Subtraction = "+obj.Sub(30, 20));
        System.out.println("Multication = "+obj.Mul(20, 10));
        System.out.println("Division = "+obj.Div(30, 10));
    }
}