interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("I am coding with a laptop");
    }
}

class Desktop implements Computer {
    public void code(){
        System.out.println("I am coding with a desktop");
    }
}
public class ReasonForInterface {
  public void developer(Computer computer){
    computer.code();
  }
}

class Check{
    public static void main(String []args){
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

      ReasonForInterface reason = new ReasonForInterface();
      ReasonForInterface reason1 = new ReasonForInterface();
      reason.developer(laptop);
      reason1.developer(desktop);
  }
}
