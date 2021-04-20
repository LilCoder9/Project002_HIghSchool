import java.util.*;

public class Amusement
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
        int adult;
        int child;
        double cost;
        double tax;
        double totalcost;

        //Input
        System.out.printf("What is the month number (1 -12):");
        month = console.nextInt();
        System.out.printf("What is the day: ");
        day = console.nextInt();
        System.out.printf("What is the year(4 digits): ");
        year = console.nextInt();
        System.out.printf("How many ADULT tickets are you purchasing? ");
        adult = console.nextInt();
        System.out.printf("How many CHILD tickets are you purchasing? ");
        child = console.nextInt();
        
        //Math
        if( month < 3 ){
            year = year - 1;
        }
        wy = (3+ year) +( year / 4 ) - ( year / 100 ) + ( year / 400 )% 7;
        m = ( month + 9 ) % 12;
        wm = (int)( (2.6 * m) + .50) % 7;
        wd = ( day  - 1 );
        w = (wy + wm + wd ) % 7;
        
        
        
       if( w == 6 || w == 0 ){
           cost = ( adult * 25.95) + ( child * 15.95);  //weekends
        }
       else if( w == 2){
           cost = (adult * 10.95) + ( child * 6.95);    //tuesday special
        }
       else {  
           cost = ( adult * 15.95) + ( child * 8.95);   //weekdays
        }

        
       tax = cost * .07;
       totalcost = tax + cost;
            
       //Output
       if(w == 0){
        System.out.printf("You will be visiting the park on SUNDAY \n");
    }
       else if(w ==1){
      System.out.printf("You will be visting the park on MONDAY \n");
    }
    else if(w == 2){
      System.out.printf("You will be visiting the park on TUESDAY \n");
    }
    else if(w == 3){
        System.out.printf("You will be visiting the park on WEDNESDAY \n");
    }
    else if(w == 4){
        System.out.printf("You will be visiting the park on THURSDAY \n");
    }
    else if(w == 5){
        System.out.printf("You will be visiting the park on FRIDAY \n");
    }
    else{//saturday
        System.out.printf("You will be visiting the park on SATURDAY \n");
    }
        System.out.printf(" The pre-tax cost of %d adult and %d child tickets is $%.2f \n", adult, child, cost);
        System.out.printf("TOTAL COST (including tax) = %.2f \n", totalcost);
        // Complete this program
        
    }
}