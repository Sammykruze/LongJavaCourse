@FunctionalInterface
public interface FunctnInterface {
    String show(String firstName, String lastName);
}



class AnonymousInnerClassDemo{
    public static void main(String [] args){

        FunctnInterface function =  new FunctnInterface() {

            public String show(String firstName, String lastName){ 
                return (firstName + lastName);
            } 
      };
             
        String name = function.show("Samuel ", "Kunle");
        System.out.println("My name is " + name);
           
    }

    
    
}

