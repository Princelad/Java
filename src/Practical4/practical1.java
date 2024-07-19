package Practical4;

class Parent {

    public Parent() {
    }
    
    public void  printParent() {
        System.out.println("This is a Parent class.");
    }
}

class Child extends Parent {
    public Child() {       
    }
    public void printChild() {
        System.out.println("This is a Child class.");
    }
}

public class practical1 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.printParent();
        c.printChild();
        c.printParent();
    }
}
