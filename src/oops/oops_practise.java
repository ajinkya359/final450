package oops;

class Base {
    public void show() {
        System.out.println("Base::show() called");
    }
}

class Derived extends Base {
    
    public void show() {
        System.out.println("Derived::show() called");
    }
}

class DerivedDerived extends Base{
    public void show(){
        
    }
}

public class oops_practise {
    
    
    public static void main(String[] args) {
        Base b=new Derived();
        b.show();
    }
    
}
