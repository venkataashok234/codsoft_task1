package Task1;
import java.util.*;
import java.util.Random;
public class Numbers_Game {
  public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Random rnd = new Random();
      // Genrating a random target betwwen range [0 - 100]
      int target = rnd.nextInt(100);
      System.out.println("Player Enter Your Details:");
      System.out.println("Enter Your Name :");
      String name=sc.next();
      System.out.println("Enter your Phone number sir");
      int mobile =sc.nextInt();
      System.out.println("Welcome To PAS GAMES Mr/Mrs  "+name +" !");
      
      //Generating id for player
      int min_id = 1000 , max_id =10000;
      int id = rnd.nextInt(min_id+(max_id-min_id+1));
      System.out.println("Your game ID is :"+id);
      System.out.println("Do you want start the game enter true or false");
      boolean flag =sc.nextBoolean();
      if(flag == false){
          System.out.println("Thank you Mr/Mrs "+ name +" visit again our PAS GAMES Bye!");
          return;
      }else{
          System.out.println("You can score from 0 to 10 points :");
      }
      int attempts =0;
      int limit =  10;
      while(flag){
          int guess =-9999;
          if(attempts < limit){
              System.out.println("Enter your guess number range between [0 - 100]:");
              guess =sc.nextInt();
              attempts++;
              if(guess < target){
                  System.out.println("It's too low !");
              }
              else if(guess > target){
                  System.out.println("It's too high !");
              }
              else{
                  System.out.println("Mr/Mrs "+name+" You win the game with "+attempts+" attempts  so your score is :"+(10-attempts+1));
                  System.out.println("Do you to play again enter true or false :");
                  flag = sc.nextBoolean();
                  if(flag  == true){
                      target = rnd.nextInt(100);
                      attempts = 0;
                  }
                  
              }
              
              if(flag == false){
                 System.out.println("Thank you Mr/Mrs "+ name +" visit again our PAS GAMES Bye!");
                 return; 
              }
              
          }
          else{
              System.out.println("Sorry You lost all your chances But you tried very well Mr/Mrs "+ name);
              System.out.println("Do you to play again enter true or false :");
                  flag = sc.nextBoolean();
                  if(flag  == true){
                      target = rnd.nextInt(100);
                      attempts = 0;
                  }
                  if(flag == false){
                      System.out.println("Thank you Mr/Mrs "+ name +" visit again our PAS GAMES Bye!");
                      return; 
                 }
                      
          }
          
          
      }
     
  }  
}
