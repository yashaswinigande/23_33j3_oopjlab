class Person{
    String name;
    int age;
    void displaydetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class Main
{
    public static void main(String[]args){
    Person person=new Person();
    person.name="yashu";
    person.age=18;
    person.displaydetails();
}
}
output:
Name:yashu
Age:18