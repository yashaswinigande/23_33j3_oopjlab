class Demo{
    
    Demo(){
        System.out.println("empty constructor");
    }
    Demo(int a){
        a=a*a;
        System.out.println(a);
    }
    int c;
    Demo(int a,int b){
       c=a*b;
        System.out.println(c);
    }
    int d;
    Demo(int a,int b,int c){
       d=a*b*c;
        System.out.println(d);
    }
    
}
class Main{
    public static void main(String[]args){
        Demo obj1=new Demo(8);
        Demo obj2=new Demo(10,5);
        Demo obj3=new Demo(18,5,9);
    }
}
output
64
50
810