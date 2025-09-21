package fi.utu.tech.exercise1.calculator;

public class CalculatorUser {
    public void use1() throws Exception {
        int[] nums = new int[]{};

        float result = -1;
        try {
            result = new Calculator().avg(nums);
        } catch (EmptyArrayException e) {
            System.out.println("Oho, tapahtui hassuja");
        }
    }

    public void use2() throws Exception {
        int[] nums = new int[]{1, 2, 3, 4};
        var result = new Calculator().avg(nums);
        //System.out.println(result);
    }

    public void use3() throws Exception {
        int[] nums = new int[]{-1, -2, -3};
        float result = -1;
        try {
            result = new Calculator().avgPos(nums);
            System.out.println(result);
        } catch (EmptyArrayException | NegativeNumberException e){
            if (e.getMessage() != null) System.out.println(e.getMessage());
            else System.out.println("Oho, tapahtui hassuja");
        }
    }

    public static void main(String[] args) throws Exception {
        CalculatorUser calculatorUser = new CalculatorUser();
        calculatorUser.use1();
        calculatorUser.use2();
        calculatorUser.use3();
    }
}
