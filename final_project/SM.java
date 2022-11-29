import java.util.*;

class SM{

  static int schools = 5;
  
  public static void stableMarriage(int prefer[][]){
    int schoolList[][] = new int[schools][];
    for(int i = 0; i < schools; i++){
      schoolList[i] = new int[200];
    }

    System.out.println(schooList);
  }
  
  public static void main(String[] args){ 
      int prefer[][] = new int[][]{{7, 5, 6, 4}, 
                                   {5, 4, 6, 7}, 
                                   {4, 5, 6, 7}, 
                                   {4, 5, 6, 7}, 
                                   {0, 1, 2, 3}, 
                                   {0, 1, 2, 3}, 
                                   {0, 1, 2, 3}, 
                                   {0, 1, 2, 3}}; 
      stableMarriage(prefer); 
  }
}