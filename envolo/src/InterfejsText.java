import java.util.Scanner;

public class InterfejsText {

    public InterfejsText(){

    }

    public void start(Calculator calculator, Scanner scan) throws Exception {
        int i= scan.nextInt();
        int x;
        int y;
        double a;
        double b;
        switch (i){
            case 1:
                //add
                System.out.println("PODAJ DWIE LICZBY");
                System.out.print("X = ");
                x= scan.nextInt();
                System.out.print("Y = ");
                y= scan.nextInt();
                System.out.println();
                System.out.print("WYNIK DODAWANIA = ");
                System.out.println(calculator.add(x,y));
                Menu(calculator,scan);
                break;
            case 2:
                //subtract
                System.out.println("PODAJ DWIE LICZBY");
                System.out.print("X = ");
                x= scan.nextInt();
                System.out.print("Y = ");
                y= scan.nextInt();
                System.out.println();
                System.out.print("WYNIK ODEJMOWANIA = ");
                System.out.println(calculator.subtract(x,y));
                Menu(calculator,scan);
                break;
            case 3:
                //multiply
                System.out.println("PODAJ DWIE LICZBY");
                System.out.print("X = ");
                x= scan.nextInt();
                System.out.print("Y = ");
                y= scan.nextInt();
                System.out.println();
                System.out.print("WYNIK MNOŻENIA = ");
                System.out.println(calculator.multiply(x,y));
                Menu(calculator,scan);
                break;
            case 4:
                //power
                System.out.println("PODAJ DWIE LICZBY");
                System.out.print("X = ");
                x= scan.nextInt();
                System.out.print("Y = ");
                y= scan.nextInt();
                System.out.println();
                System.out.print("WYNIK POTĘGOWANIA = ");
                System.out.println(calculator.power(x,y));
                Menu(calculator,scan);
                break;
            case 5:
                //divide
                System.out.println("PODAJ DWIE LICZBY");
                System.out.print("X = ");
                a= scan.nextDouble();
                System.out.print("Y = ");
                b= scan.nextDouble();
                System.out.println();
                System.out.print("WYNIK DZIELENIA = ");
                System.out.println(calculator.divide(a,b));
                Menu(calculator,scan);
                break;
            case 6:
                //factorial
                System.out.println("PODAJ LICZBE");
                System.out.print("X = ");
                x= scan.nextInt();
                System.out.print("WYNIK SILNI = ");
                System.out.println(calculator.factorial(x));
                Menu(calculator,scan);
                break;
            case 7:
                //xProcentOfy
                System.out.println("PODAJ DWIE LICZBY");
                System.out.print("X = ");
                a= scan.nextDouble();
                System.out.print("Y = ");
                b= scan.nextDouble();
                System.out.println();
                System.out.print("PODANY PROCENT Z DANEJ LICZBY TO: ");
                System.out.println(calculator.xProcentOfy(a,b));
                Menu(calculator,scan);
                break;
            case 10:
                System.exit(0);
                break;
            default:
                System.out.println("SPRÓBUJ JESZCZE RAZ");
                start(calculator, scan);
                break;
        }
    }

    public void Menu(Calculator calculator, Scanner scan) throws Exception {
        System.out.println();
        System.out.println("KALKULATOR");
        System.out.println();
        System.out.println("[1] - DODAWANIE");
        System.out.println("[2] - ODEJMOWANIE");
        System.out.println("[3] - MNOŻENIE");
        System.out.println("[4] - POTĘGOWANIE");
        System.out.println("[5] - DZIELENIE");
        System.out.println("[6] - SILNIA");
        System.out.println("[7] - X PROCENT LICZBY Y");
        System.out.println("[10] - KONIEC");
        start(calculator, scan);
    }
}
