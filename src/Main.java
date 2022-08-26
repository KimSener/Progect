public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(3,4,6);
        System.out.println(numbers.getA() + numbers.getB() + numbers.getC());
        System.out.println(numbers.getA() + numbers.getB() - numbers.getC());
         addMethod();

    }
    public static void addMethod() {
        Numbers numbers = new Numbers(5,6,7);
        int sum = numbers.getA() + numbers.getA();
        System.out.println(sum);
    }
}
