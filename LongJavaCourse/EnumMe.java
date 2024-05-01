public enum EnumMe {
    RUNNING, PENDING, FAILED, SUCCESS;
    
}

class Checking{
    public static void main(String [] args){
        EnumMe enumMe = EnumMe.SUCCESS;

        System.out.println(enumMe.getClass().getSuperclass());

       switch (enumMe) {
        case RUNNING:
            System.out.println("All good");
            break;

            case PENDING:
            System.out.println("Please wait");
            break;

            case FAILED:
            System.out.println("Try again");
            break;

        default:
            System.out.println("Done");
            break;
       }
    }
}
