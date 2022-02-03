import java.util.ArrayList;

public class NewFormOfNumberDouble {
    private double number;
    private Calculator calculator;
    private ArrayList<Integer> tab;
    private String numberString;
    private String[] numberStringTab;
    private int lenghtofStringTab;
    private int decimalPlace;
    private int newValue;

    public NewFormOfNumberDouble(double number,Calculator calculator){
        setNumber(number);
        setCalculator(calculator);
        setTab(new ArrayList<>());
        setNumberString(String.valueOf(number));
        setNumberStringTab(numberString.split(""));
        setLenghtofStringTab(CalculationOfLenght(calculator,numberString));
        setDecimalPlace(FindDecimalPlace(calculator,numberStringTab,lenghtofStringTab));
        setNewValue(CreateNewValue(calculator,numberStringTab,tab,lenghtofStringTab));
    }

    public int getDecimalPlace() {
        return decimalPlace;
    }

    public int getNewValue() {
        return newValue;
    }

    public int getLenghtofStringTab() {
        return lenghtofStringTab;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    private void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    private void setTab(ArrayList<Integer> tab) {
        this.tab = tab;
    }

    private void setNumberString(String numberString) {
        this.numberString = numberString;
    }

    private void setNumberStringTab(String[] numberStringTab) {
        this.numberStringTab = numberStringTab;
    }

    private void setLenghtofStringTab(int lenghtofStringTab) {
        this.lenghtofStringTab = lenghtofStringTab;
    }

    private void setDecimalPlace(int decimalPlace) {
        this.decimalPlace = decimalPlace;
    }

    private void setNewValue(int newValue) {
        this.newValue = newValue;
    }

    private int CreateNewValue(Calculator calculator, String[] numberStringTab, ArrayList<Integer> tab, int lenghtofStringTab){
        int vaule = 0;
        int i=0;
        while(i< lenghtofStringTab) {
            if (!numberStringTab[i].equals(".")) {
                tab.add(Integer.valueOf(numberStringTab[i]));
            }
            i = calculator.add(i, 1);
        }
        int Tabsize = calculator.subtract(lenghtofStringTab,1);
        i=0;
        while (i<calculator.subtract(lenghtofStringTab,1)){
            int quantityMultiplier = 1;
            int size = Tabsize;
            while (size>1){
                quantityMultiplier = calculator.multiply(quantityMultiplier,10);
                size = calculator.subtract(size,1);
            }
            int nextNumber = calculator.multiply(tab.get(i),quantityMultiplier );
            vaule=calculator.add(vaule,nextNumber);
            Tabsize = calculator.subtract(Tabsize,1);
            i= calculator.add(i,1);
        }
        return vaule;
    }

    private int FindDecimalPlace(Calculator calculator, String[] numberStringTab, int lenghtofStringTab){
        int place = 0;
        int i=0;
        while(i< lenghtofStringTab){
            if(numberStringTab[i].equals(".")){
                place=i;
            }
            i = calculator.add(i,1);
        }
        int finalvalue = calculator.subtract(lenghtofStringTab,place);
        finalvalue=calculator.subtract(finalvalue,1);
        return finalvalue;
    }

    private int CalculationOfLenght(Calculator calculator, String numberString){
        int i=0;
        for(char ch : numberString.toCharArray()){
            i =calculator.add(i,1);
        }
        return i;
    }
}
