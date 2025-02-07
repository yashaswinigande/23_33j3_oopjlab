class Constructor
{
    int m,n;
    Constructor()
    {
        m=34;
        n=25;
    }
    public void Display()
    {
        System.out.println("m value is:"+m);
        System.out.println("n value is:"+n);
    }
    public static void main(String[]args){
        Constructor obj1=new Constructor();
        obj1.Display();
        Constructor obj2=new Constructor();
        obj2.Display();
    }
}
output
m value is:34
n value is:25
m value is:34
n value is:25
