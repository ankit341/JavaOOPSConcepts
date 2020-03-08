public class Main {
    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println(obj.add(10, 94));
        System.out.println(obj.subtract(10, 94));
        System.out.println(obj.multiply(10, 94));
        System.out.println(obj.divide(10, 94));


        Student student = new Student("Jack", 60, 70);
        System.out.println(student.calcTotal());


        SquareSum squareSum = new SquareSum(2,3,4);
        System.out.println(squareSum.squareSum(squareSum.getA(),squareSum.getB(),squareSum.getC()));

    }
}
