import java.util.InputMismatchException;
import java.util.Scanner;

public class StartCal {
    private Calculator cal;
    private Scanner scan ;
    private InterfejsText it;

    public StartCal() throws Exception {
        this.cal=new Calculator();
        this.scan=new Scanner(System.in);
        this.it= new InterfejsText();
        try {
            it.Menu(cal, scan);
        }catch (InputMismatchException e){
            System.out.println("ŹLE WPISANA WARTOŚĆ");
            new StartCal();
        }
    }

}
