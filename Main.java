import java.awt.Color;
import java.util.Scanner;


class Main {

   static String country[] = {"Soviet Union","Poland","Finland","Romania"};
   static boolean country_status[] = {true, true, true, true};
   static double country_stats[][];
   static boolean resources_swing[][];
   static double resources_production[][];

   public static void main(String[] args) {
      try (Scanner Input = new Scanner(System.in)) {
         System.out.println("Welcome comrade, to the best union!");
         System.out.println("(I)nput 1 for Game");
         int a = Input.nextInt();
      if(a == 1) {
         System.out.println("Game selected");
         menu();
      }else{
         System.out.println("Invalid input");
         main(args);
      }
   }
   }
   public static void menu() {
      System.out.println("Welcome to the Soviet Union!");
      stats();
   }
   public static void stats() {
      try (Scanner Input = new Scanner(System.in)) {
         System.out.println("1 - Player nation; 2 - Others");
         int a = Input.nextInt();
         if(a == 1) {
            System.out.printf("Player country stats:",Color.green);
            System.out.println("Stability: "+country_stats[0][0]);
            if(resources_swing[0][0] = true){
               
            }
            System.out.println("Population: "+country_stats[0][1]);
            System.out.println("Supplies: "+country_stats[0][2]);
            System.out.println("Oil reserves: "+country_stats[0][3]);
         }
      }
   }
   public static void game() {

   }
}
