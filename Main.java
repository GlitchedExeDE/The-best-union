import java.util.Scanner;


public class Main {
   public static int a;
   public static void main(String[] args) {
      try (Scanner Input = new Scanner(System.in)) {
         System.out.println("Welcome comrade, to the best union!");
         System.out.println("(I)nput 1 for Game");
         a = Input.nextInt();
      if(a == 1) {
         System.out.println("Game selected");
         game();
      }
   }
   }
   public static void game() {
      System.out.println("Welcome to game");
   }
}
