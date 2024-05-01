public class ThreadWay {
    
    
}


class Check{
    public static void main(String a[]){
        Runnable one  = () -> {
                for(int i = 1; i<=5; i++){
                    System.out.println("I am one");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {e.printStackTrace();
                    }
                }        
        };
        Runnable two = () -> {
                for(int i = 1; i <= 5; i++){
                    System.out.println("We are two");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {e.printStackTrace();
                    }
                }
        };

        Thread thread = new Thread(one);
        Thread thread2 = new Thread(two);


       // System.out.println(two.getPriority());
       thread.start();
       thread2.start();
    }
}