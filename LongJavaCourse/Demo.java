
class Calculator{

  int price;

  public Calculator(int price){
    this.price = price;
  }
  public String getPen(int amount){

    Calculator calculator = new Calculator(44);
    System.out.println(calculator.price);
   /*  if (amount < 100) 
    System.out.println("Please add " + (100 - amount) + "# to get the pen" );
    else if(amount > 100)
    System.out.println("Your change is " + (amount - 100));
    
    */  return "Thank you for your patronage";

  }

  public int add(int a, int b){
        return a + b;

  }

  
 }

  public class Demo{
 
  public static void main(String a[]){
   // Calculator calculator = new Calculator();
   // String result = calculator.getPen(30);
    // System.out.println(result);

   // int sum = calculator.add(23, 43);
   // System.out.println(sum);


  /*  int nums[][] = new int [3][4];                       Normal Array

   for(int i = 0; i < 3; i++){
    for(int j = 0; j < 4; j++){
       nums[i][j] = (int)(Math.random()*10);
    }
  }

   for(int i = 0; i < 3; i++){
    for(int j = 0; j < 4; j++){
        System.out.print(nums[i][j] + " ");
    }
    System.out.println();
   }
   */


  int nums[][] = new int[3][];                   //Jagged Array
  nums[0] = new int[3];
  nums[1] = new int[4];
  nums[2] = new int[2];

  for(int i = 0; i<nums.length; i++){
    for(int j = 0; j < nums[i].length; j++){
      nums[i][j] = (int) (Math.random()*10);
      System.out.print(nums[i][j] + " ");
    }
    System.out.println();
   
  }

  Calculator calculator = new Calculator(44);
  calculator.getPen(34);
 

  }

  

}

  


