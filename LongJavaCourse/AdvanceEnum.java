public enum AdvanceEnum {
    Macbook(2000), XPS(1800), Surface(1600), Thinkpad(2000);

    private int price;

    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    private AdvanceEnum(int price) {
        this.price = price;
    }   

}

class EnumCheck{
    public static void main(String [] args){
       
        AdvanceEnum advanceEn = AdvanceEnum.Macbook;
        advanceEn.setPrice(2100);

        AdvanceEnum advanceE = AdvanceEnum.XPS;
        advanceE.setPrice(2500);
       // System.out.println(advanceEnum +" : " + advanceEnum.getPrice());

       AdvanceEnum [] advanceEnum = AdvanceEnum.values();
       for (AdvanceEnum advanceEnum2 : advanceEnum) {
            System.out.println(advanceEnum2 + " : " + advanceEnum2.getPrice());
       }


    }
}
