public class CheckingCode {
    double cashValue;
    public CheckingCode(double cashValue){
        this.cashValue = cashValue;
    }
}
 class CheckCkech{
    public static void main( String args[]){
        double cashValue = 100;
        CheckingCode checkingCode = new CheckingCode(cashValue);
       System.out.println(checkingCode.cashValue);
 }
}