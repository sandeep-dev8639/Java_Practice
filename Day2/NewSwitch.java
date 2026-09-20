public class NewSwitch {
    public static void main(String[] args) {

        String day1 = "sanday";

        String day = "monday";

        switch (day) {
            case "monday", "sanday" -> System.out.println("6 am"); // arrow
                
            case "satarday" -> System.out.println("8 am");
                
            default -> System.out.println("9 am");
        }

            switch (day1) {
            case  "monday" -> System.out.println("6 am"); // arrow
                
            case "sanday" -> System.out.println("8 am");
            
            default -> System.out.println("9 am");
        }
    }
}
