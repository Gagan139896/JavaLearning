package First_Task;
public class Float_Task {
    public float Add(float x, float y) {
        return x+y;
    }
    public float Sub(float x, float y) {
        return x-y;
    }
    public float Mul(float x, float y) {
        return x*y;
    }
    public float Div(float x, float y) {
        return x/y;
    }
    public static void main(String[] args) {
        Float_Task obj = new Float_Task();
        System.out.println("Addition = "+obj.Add(35.5f, 11.2f));
        System.out.println("Subtraction = "+obj.Sub(30.5f, 20.5f));
        System.out.println("Multication = "+obj.Mul(20.5f, 10.0f));
        System.out.println("Division = "+obj.Div(30.6f, 10.2f));
    }
}