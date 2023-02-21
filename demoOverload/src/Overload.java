public class Overload {

    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    public void add(float a,float b)
    {
        float c=a+b;
        System.out.println(c);

    }
    public void add(int a,int b, int c)
    {
        int d=a+b+c;
        System.out.println(d);
    }

    public static void main(String[] args)
    {
        Overload ol=new Overload();
        ol.add(23,45);
        ol.add(43.12f,23.32f);
        ol.add(34,54,65);
    }
}
