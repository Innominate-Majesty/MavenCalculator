package sjcc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double A = 0.0;
        double B = 0.0;

        printMenu(A, B);
    }

    public static void printMenu(double A, double B){
        System.out.println("****************************************\n");
        System.out.println("    Chavvi Calculator    \n");
        System.out.println("****************************************\n");
        System.out.println("    A = 0.0000    |    B = 0.0000\n");
        System.out.println("****************************************\n");
        System.out.println("a    :    add value for A\n");
        System.out.println("b    :    add value for B\n");
        System.out.println("+    :    addition\n");
        System.out.println("-    :    subtraction\n");
        System.out.println("*    :    multiplication\n");
        System.out.println("/    :    division\n");
        System.out.println("c    :    clear\n");
        System.out.println("q    :    quit\n");
        System.out.println("****************************************\n");

    }
}
