package algo;

import java.util.Random;

class EuclideanAlgorithm
{ 
    public static int GCD(int a, int b) 
    {
        if (a == 0)
            return b;
        return GCD(b % a, a);
    }

    // Driver Program 
    public static void main(String[] args) 
    { 
        Random rand = new Random(); // built-in funtion provided by the library java.util.Random in Java for Random Number Generation
        int a = 3;   // use random inputs 
        int b = 15;  
        System.out.println("GCD(" + a +  " , " + b+ ") = " + GCD(a, b)); 

       

    }
} 
