class Calculator {
    private double n1;
    private double n2;

    public Calculator() {
        n1 = 0;
        n2 = 0;
    }

    double add(double n1, double n2) {
       return n1 + n2;
    }

    double subtract(double n1, double n2) {
       return n1-n2;
    }

    double multiply(double n1, double n2) {
       return n1*n2;
    }

    double divide(double n1, double n2) {
       return n1/n2;
    }

}
