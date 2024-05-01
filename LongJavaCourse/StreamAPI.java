
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String []args){
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(1);
        nums.add(6);
        nums.add(3);
        nums.add(4);
        nums.add(7);

        System.out.println("Printing all values with for loop");
       
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            int n = nums.get(i);
            if(n%2==0){
            n =n*2;
            sum = sum + n;
        }
    }
        System.out.println(sum);


        System.out.println("Printing all values with enhanced for loop");

        int summ = 0;
        for(int i : nums){
        if(i%2==0){
            i = i*2;
            summ = summ + i;
        }
    }
    System.out.println(summ);


        System.out.println("Printing all values with while loop");

        int sum1 = 0;
        int i = 0;
       while (i< nums.size()) {
            int n = nums.get(i);
            if(n%2==0){
                n = n * 2;
                sum1 = sum1 + n;
            }
            i++;
       }
       System.out.println(sum1);

       /* 
 
       System.out.println("Printing all values with do while loop");

       int sum2 = 0;
        int j = 0;
       do {
             int n = nums.get(j);
            if(n%2==0){
                n = n * 2;
                sum2 = sum2 + n;
            }
            i++;
       } while (j < nums.size());
       */


       
   /*  System.out.println("Printing all values with for each loop"); 
       
           Consumer<Integer> consumer = new Consumer<Integer>() {

            int sum4 = 0;
            public void accept(Integer n) {
                
               if (n%2==0){
                n = n*2;
                sum4 =sum4 + n;

                System.out.println(sum4);
            }             
            }    
               
           };
         

     nums.forEach(consumer);

    // nums.forEach(n -> System.out.println(n));
  */
  
  System.out.println("Printing value with stream method");

   List<Integer> nuum = Arrays.asList(2,5,3,1,6,4);

   Stream<Integer> s1 = nuum.stream();
    Stream<Integer> s2 = s1.filter(n -> n%2==0);
    Stream<Integer> s3 = s2.map(n -> n*2);
    int show = s3.reduce(0, (c,e) -> c+e);
    System.out.println(show);

    System.out.println("Printing value with one line stream method ");

   int result = nums.stream()
                    .filter(n-> n%2==0)
                    .map(n -> n*2)
                    .reduce(0,(c,e) ->  c+e);

    System.out.println(result);

    }
  
}
