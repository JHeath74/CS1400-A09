import java.util.Random;
 
public class Dice
{
    public static void main( String[] args)
    {
        Random rand = new Random();
        int[] array = new int[ 13 ]; 
       
       
        
        for ( int roll = 1; roll <=36000; roll++ )
        {
            int dice1 = rand.nextInt ( 6 ) + 1;
            int dice2 = rand.nextInt ( 6 ) + 1;
            int dicetotal = dice1+dice2;
            ++array[dicetotal];
            
        }     
        System.out.printf( "%5s%12s%15s\n", "Sum", "Frequency", "Percentage" );
        
        
        
        for ( int Sum = 2; Sum < array.length; Sum++ )
            {
            
            double percent = ((double)array[Sum] * 100 / 36000);
            System.out.printf( "%4d%10d%15.2f\n", Sum, array[ Sum ], percent);
            }
       
    }
     
}

