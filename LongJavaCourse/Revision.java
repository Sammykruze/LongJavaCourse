public class Revision {

    public void hi(){
        System.out.println("I love you baby");  

        int sum = 0;
        for(int i = 0; i <= 10; i++){
            sum = sum + i;
        }
        System.out.println(sum);


        int a[] = {3,23,5,6,7,8,78,9};
        for (int i : a) {
            System.out.println(i);
        }      
        
    }


    public void check(){
         int firstNum = 3;
         int secondNum = 20;
         for(int i = 1; i <= secondNum; i++){
            System.out.println(firstNum + " * " + i + " = " + firstNum*i);
            
         }
    }
}

class Rev{
    public static void main(String args[]){
        Revision ref = new Revision();
        ref.hi();
        ref.check();
    }
}
