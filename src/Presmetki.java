public class Presmetki
{
    private int a,b;


    public Presmetki(int _a, int _b)
    {
        a = _a;
        b = _b;
    }

    public Presmetki()
    {
        this(0,0);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }



    public int getA() {
        return a;
    }

    /**
     * Subtracts a - b
     */
    void subtract()
    {
        int res = a-b;
        System.out.println("a(" + a + ")"  + " - b(" + b+") " + "= " + res);
    }
    void add()
    {
        int res = a+b;
        System.out.println("a(" + a + ")"  + " + b(" + b+") " + "= " + res);
    }

    String multiply()
    {
        int res = a*b;
        String soodvetno = "a(" + a + ")"  + " * b(" + b+") " + "= " + res;
//        System.out.println("a(" + a + ")"  + " * b(" + b+") " + "= " + res);
        return soodvetno;
    }

    public int getB() {
        return b;
    }
}
