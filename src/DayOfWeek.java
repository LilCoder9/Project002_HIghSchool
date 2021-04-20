/* DayOfWeek - Calculate the day of the week for a given
 *             month/day/year.
 * input:  month, day and year
 * output: a number indicating the day of the week. Specifically,
 *         Sunday   = 0, Monday = 1, Tuesday = 2, Wednesday= 3, 
 *         Thursday = 4, Friday = 5, and Saturday = 6.
 *             
 */
import java.util.*;

public class DayOfWeek
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //Declaration
        int month;
        int day;
        int year;
        int wy;
        int m;
        int wm;
        int wd;
        int w;
       
        
        
        //Input
        System.out.printf("What is the month number (1 -12):");
        month = console.nextInt();
        System.out.printf("What is the day: ");
        day = console.nextInt();
        System.out.printf("What is the year(4 digits): ");
        year = console.nextInt();
        
        //Math
        if( month < 3 ){
            year = year - 1;
        }
        wy = (3+ year) +( year / 4 ) - ( year / 100 ) + ( year / 400 )% 7;
        m = ( month + 9 ) % 12;
        wm = (int)( (2.6 * m) + .50) % 7;
        wd = ( day  - 1 );
        w = (wy + wm + wd ) % 7;
        
        // Output 
        System.out.printf("Day number is %d ", w);
        // Complete this program
        
    }
}