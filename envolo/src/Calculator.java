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

        if(y>=0) {
            int sum = 1;
            int i = y;
            while (i > 0) {
                sum = multiply(sum, x);
                i = subtract(i, 1);
            }
            return sum;
        }else {
            return 0;
        }
    }

   public double divide(double x, double y) throws Exception {

        try {
            if (y != 0) {
                NewFormOfNumberDouble n1 = new NewFormOfNumberDouble(x, this);
                NewFormOfNumberDouble n2 = new NewFormOfNumberDouble(y, this);

                if (n1.getDecimalPlace() > n2.getDecimalPlace()) {
                    int tmp = subtract(n1.getDecimalPlace(), n2.getDecimalPlace());
                    int i = 0;
                    while (i < tmp) {
                        n2.setNumber(multiply(n2.getNewValue(), 10));
                        i = add(i, 1);
                    }
                } else if (n1.getDecimalPlace() < n2.getDecimalPlace()) {
                    int tmp = subtract(n2.getDecimalPlace(), n1.getDecimalPlace());
                    int i = 0;
                    while (i < tmp) {
                        n1.setNumber(multiply(n1.getNewValue(), 10));
                        i = add(i, 1);
                    }

                }

                int a, b, c, d;
                int restA, restB, restC;
                int n1clone, n2clone;


                n1clone = n1.getNewValue();
                n2clone = n2.getNewValue();

                a = 0;
                restA = n1clone;

                while (restA >= n2clone) {
                    a = add(a, 1);
                    restA = subtract(restA, n2clone);

                }

                b = divideScore(restA, n2.getNewValue());
                restB = divideRest(restA, n2.getNewValue());
                c = divideScore(restB, n2.getNewValue());
                restC = divideRest(restB, n2.getNewValue());
                d = divideScore(restC, n2.getNewValue());

                String s;
                if( (x<0||y<0) && !(x<0&&y<0)) {
                     s = "-"+a + "." + b + c + d;
                }else{
                     s = +a + "." + b + c + d;
                }
                Double finaldouble = new Double(s);
                return finaldouble;
            } else {
                throw new Exception("nie można dzielić przez zero");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());;
            return 0.0;
        }
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

        try {
            if (x >= 0) {
                int sum = 1;
                int i = 1;
                while (i <= x) {
                    sum = multiply(sum, i);
                    i = add(i, 1);
                }
                return sum;
            } else {
                throw new Exception("Silnia tylko dla liczb całkowitoliczbowych");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public double xProcentOfy(double x,double y) throws Exception {

        try {
            if (x >= 0) {
                NewFormOfNumberDouble n1 = new NewFormOfNumberDouble(x, this);
                NewFormOfNumberDouble n2 = new NewFormOfNumberDouble(y, this);

                int divider = 100;

                int i = 0;
                int tmp = n1.getDecimalPlace();
                tmp = multiply(tmp, 2);
                while (i < tmp) {
                    divider = multiply(divider, 10);
                    i = add(i, 1);
                }

                int value = multiply(n1.getNewValue(), n2.getNewValue());

                int a, b, c, d;
                int restA, restB, restC;
                int xclone, yclone;

                xclone = value;
                yclone = divider;

                a = 0;
                restA = xclone;

                while (restA >= yclone) {
                    a = add(a, 1);
                    restA = subtract(restA, yclone);

                }

                b = divideScore(restA, divider);
                restB = divideRest(restA, divider);
                c = divideScore(restB, divider);
                restC = divideRest(restB, divider);
                d = divideScore(restC, divider);
                String s;
                if (y < 0) {
                    s = "-" + a + "." + b + c + d;
                } else {
                    s = a + "." + b + c + d;
                }
                Double finalvalue = new Double(s);

                return finalvalue;
            } else {
                throw new Exception("tak nie można");
            }
        }catch (Exception e){
            System.out.println("ujemny procent?");;
            return 0.0;
        }
    }
}
