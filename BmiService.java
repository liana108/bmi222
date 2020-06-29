public class BmiService {
    public float calculate(float weight) {
        float tall = 0.016F;
        float bmi = weight / (tall * tall);
        return bmi;

    }
}
