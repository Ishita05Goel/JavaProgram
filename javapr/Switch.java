public class Switch {
    public static void main(String[] args) {
        /*
         * Switch case - menu driven and equality comparison
         * to stop fall use break
         */
        System.out.println("1.Tea\n2.Soft drink\n3.pizza\n4.Pasta");
        int choice = 2;
        switch(choice){
            case 1:
            System.out.println("rs 50");
            //break;
            case 2:
            System.out.println("rs 60");
            //break;
            case 3:
            System.out.println("rs 60");
            //break;
            case 4:
            System.out.println("rs 60");
            //break;
            default:
            System.out.println("wrong choice");
        }
        //java7 - switch with string before switch cannot take string as an input and they used final int drink = 1;
    }

}
