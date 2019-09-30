package earlyjava.inheritance.analyzableinterface;

public class FinalExam extends GradedActivity {
    private double pointsEach;
    private int numMissed;

    public FinalExam(int questions, int missed) {
        double numericScore;
        numMissed = missed;
        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);
        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
