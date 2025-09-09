public class Student {//every class is a child class parent class is object class.
    //class name should be noun
    //members
    //Encapsulation - binding data and methods into single unit and that unit is a class
    int id;
    String name;
    int marks[] = new int[10];
    //String course = 
    @Override //- annotation, overriding do hiding
    public int hashCode(){//here,we have override hashCode
        return 1;//hashCode is logical addressing 
    }
    @Override
    public String toString(){
        return "Id" + id+ "Name"+name;
    }
    //we override print to get meaningful objects
}
//SRP - single responsibility principle(one class has one reason)
class Demo1{
    public static void main(String[] args) {
        Student ram; //student is a custom datatype and ram is reference variable when you create a memory you create a constructor
        ram = new Student(); //new - used to memory allocate
        ram.id(101);
        System.out.println(ram);
        System.out.println();
        int x; //datatype variableName
        x = 10;
    }
}
//SOLID 
//s = SRP (single responsibility principle)
//o =  
//l = 
//i
//d = 

//this is by default injected mean we don't have to write this.name = name