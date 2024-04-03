public class Main {
    public static void main(String[] args) {
      
        // winter, spring, summer, autumn
        // warm jacket, T-shirt, swimming suit, rain coat

        String season = "autumn";

        if (season.equals("winter")) {
            System.out.println("Wear a warm jacket!");
        } else if (season.equals("spring")) {
            System.out.println("Wear a T-shirt!");
        } else if (season.equals("summer")) {
            System.out.println("Wear a swimming suit!");
        } else if (season.equals("autumn")) {
            System.out.println("Wear a rain coat!");
        } else {
            System.out.println("I don't recognize this season");
        }
        
        double temp = 10.23;

        if (temp <= 5) {
            System.out.println("Wear something super warm!");
        } else if (temp <= 15) {
            System.out.println("Wear something warm!");
        } else if (temp <= 30) {
            System.out.println("It's nice weather!");
        } else {
            System.out.println("It's too hot!");
        }
    }
}
