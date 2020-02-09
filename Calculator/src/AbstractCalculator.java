public abstract class AbstractCalculator {
    public float num1;
    public float num2;
    AbstractCalculator(){}
    AbstractCalculator(float num1,float num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    public abstract float add();
    public abstract float subtract();
    public abstract float multiply();
    public abstract float divide();
}
