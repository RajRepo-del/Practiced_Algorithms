package heaps;

import java.util.*;

class MaximizeCapital {
  public static int findMaximumCapital(int[] capital, int[] profits, int numberOfProjects, int initialCapital) {
    int totalCapital = initialCapital;
    for(int i=0;i<numberOfProjects;i++){
      int j=0;
      while(totalCapital>capital[j] && j<capital.length-1){
        j++;
      }
      totalCapital+=profits[j];

    }


    return totalCapital;
  }

  public static void main(String[] args) {
    int result = MaximizeCapital.findMaximumCapital(new int[] { 0, 1, 2 }, new int[] { 1, 2, 3 }, 2, 1);
    System.out.println("Maximum capital: " + result);
    result = MaximizeCapital.findMaximumCapital(new int[] { 0, 1, 2, 3 }, new int[] { 1, 2, 3, 5 }, 3, 0);
    System.out.println("Maximum capital: " + result);
  }
}
