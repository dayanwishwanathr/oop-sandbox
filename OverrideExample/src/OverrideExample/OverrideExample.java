package OverrideExample;

// Method Overriding

class Parent {
    public void showMessage() {
        System.out.println("Message from Parent class");
    }
}

class Child extends Parent {
    @Override
    public void showMessage() {  // Correctly overriding the method
        System.out.println("Message from Child class");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        
    	Parent obj1 = new Child(); // Upcasting
        Child obj2 = new Child();
        Parent obj3 = new Parent();
        
        
        obj1.showMessage();  // Calls the overridden method in Child class
        obj2.showMessage();
        obj3.showMessage();
        
    }
}
