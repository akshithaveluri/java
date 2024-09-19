import java.io.*;
import java.util.*;
abstract class Base{
    Base(){
        System.out.println("Base class constructer invoked");
    }
abstract void fun();
}
class Derived extends Base{
    Derived(){
        super();
        System.out.println("Derived class constructer invoked");
    }
    void fun(){
        System.out.println("Derived fun is invoked");
    }
}
    class Main{
        public static void main(String args[]){
            Derived d=new Derived();
            d.fun();
        }
    }
