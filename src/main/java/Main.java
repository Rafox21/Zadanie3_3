// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
  
      
      int[][] tablica = new int[10][10];
      
      for (int i = 0; i < 10; i++) 
      {
          for (int j = 0; j < 10; j++) 
          {
              tablica[i][j] = (i + 1) * (j + 1);
          }
      }
      System.out.print("   * |");
      
      for (int k = 1; k <= 10; k++) 
      {
          System.out.printf("%4d", k);
      }
      
      System.out.println("\n-----+-----------------------------------------");
      for (int i = 0; i < 10; i++) 
      {
          
          System.out.printf("%4d |", (i + 1));
          for (int j = 0; j < 10; j++) 
          {
              System.out.printf("%4d", tablica[i][j]);
          }
          System.out.println();
      }
    

      
      
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}