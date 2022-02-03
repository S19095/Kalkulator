public class Calculator {

    public Calculator() {}

    public int add(int x, int y){

       while (y != 0)
       {
           int carry = x & y;
           x = x ^ y;
           y = carry << 1;
       }
       return x;
    }

    public int subtract(int x, int y) {

        while (y != 0) {
            int borrow = (~x) & y;
            x = x ^ y;
            y = borrow << 1;
        }
        return x;
    }

    public int multiply(int x, int y){

        int sum=0;
        while(y!=0){
            sum=add(sum,x);
            y=subtract(y,1);
        }
        return sum;
    }

    public int power(int x, int y){

        int sum =1;
        int i = y;
        while(i>0){
            sum = multiply(sum,x);
            i=subtract(i,1);
        }
        return sum;
    }

   public double divide(double x, double y) {

        NewFormOfNumberDouble n1 = new NewFormOfNumberDouble(x,this);
        NewFormOfNumberDouble n2 = new NewFormOfNumberDouble(y,this);

       if(n1.getDecimalPlace()>n2.getDecimalPlace()){
           int tmp= subtract(n1.getDecimalPlace(),n2.getDecimalPlace());
           int i =0;
           while(i<tmp){
               n2.setNumber(multiply(n2.getNewValue(),10));
               i =add(i,1);
           }
       }else if(n1.getDecimalPlace()<n2.getDecimalPlace()){
           int tmp= subtract(n2.getDecimalPlace(),n1.getDecimalPlace());
           int i =0;
           while(i<tmp){
               n1.setNumber(multiply(n1.getNewValue(),10));
               i =add(i,1);
           }
       }

       int a,b,c,d;
       int restA,restB,restC;
       int n1clone , n2clone;


       n1clone = n1.getNewValue();
       n2clone = n2.getNewValue();

        a = 0;
        restA = n1clone;

        while (restA >= n2clone) {
            a = add(a,1);
            restA= subtract(restA,n2clone);

        }

        b = divideScore(restA,n2.getNewValue());
        restB =divideRest(restA,n2.getNewValue());
        c =divideScore(restB,n2.getNewValue());
        restC =divideRest(restB,n2.getNewValue());
        d = divideScore(restC,n2.getNewValue());

        String s = a+"."+b+c+d;
        Double finaldouble = new Double(s);

        return finaldouble;
    }

    public int divideScore(int x, int y) {

        int xclone , yclone;
        int result , rest;
        xclone = multiply(x,10);
        yclone = y;
        result = 0;
        rest = xclone;
        while (rest >= yclone) {
            result = add(result,1);
            rest = subtract(rest,yclone);
        }
        return result;
    }

    public int divideRest(int x, int y) {

        int xclone , yclone;
        int result , rest;
        xclone = multiply(x,10);
        yclone = y;
        result = 0;
        rest = xclone;
        while (rest >= yclone) {
            result = add(result,1);
            rest = subtract(rest,yclone);
        }
        return rest;
    }

    public int factorial(int x){

        int sum =1;
        int i =1;
        while(i<=x){
            sum = multiply(sum,i);
            i=add(i,1);
        }
        return sum;
    }

    public double xProcentOfy(double x,double y){

        NewFormOfNumberDouble n1 = new NewFormOfNumberDouble(x,this);
        NewFormOfNumberDouble n2 = new NewFormOfNumberDouble(y,this);

        int divider = 10;

        if(n1.getDecimalPlace()>n2.getDecimalPlace()){
            int tmp= subtract(n1.getDecimalPlace(), n2.getDecimalPlace());
            int i =0;
            while(i<tmp){
                n2.setNumber(multiply(n2.getNewValue(),10));
                i =add(i,1);
            }
            i=0;
            tmp = subtract(n1.getLenghtofStringTab(),n1.getDecimalPlace());
            while(i<tmp){
                divider = multiply(divider,10);
                i =add(i,1);
            }

        }else if(n1.getDecimalPlace()<n2.getDecimalPlace()){
            int tmp= subtract(n2.getDecimalPlace(), n1.getDecimalPlace());
            int i =0;
            while(i<tmp){
                n1.setNumber(multiply(n1.getNewValue(),10));
                i =add(i,1);
            }
            i=0;
            tmp = subtract(n2.getLenghtofStringTab(),n2.getDecimalPlace());
            while(i<tmp){
                divider = multiply(divider,10);
                i =add(i,1);
            }
        }else{
            int i=0;
            int tmp = subtract(n1.getLenghtofStringTab(),n1.getLenghtofStringTab());
            while(i<tmp){
                divider = multiply(divider,10);
                i =add(i,1);
            }
        }

        int value = multiply(n1.getNewValue(), n2.getNewValue());

        int a,b,c,d;
        int restA,restB,restC;
        int xclone , yclone;


        System.out.println(value);
        System.out.println(divider);
        xclone = value;
        yclone = divider;

        a = 0;
        restA = xclone;

        while (restA >= yclone) {
            a = add(a,1);
            restA= subtract(restA,yclone);

        }

        b = divideScore(restA,divider);
        restB =divideRest(restA,divider);
        c =divideScore(restB,divider);
        restC =divideRest(restB,divider);
        d = divideScore(restC,divider);

        String s = a+"."+b+c+d;
        Double finalvalue = new Double(s);

        return finalvalue;

    }
}
