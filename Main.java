public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        float bmi = bmiService.calculate(0.005F);
        System.out.println(bmi);
    }


}
