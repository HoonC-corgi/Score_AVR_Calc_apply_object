package scoreAVR_Calc;

public class Grade {
    private double math, science, english;

    public Grade(double math, double science, double english) {
        this.math=math; this.science=science; this.english=english;
    }

    public double average() {
        return (math+english+science)/3;
    }
}
