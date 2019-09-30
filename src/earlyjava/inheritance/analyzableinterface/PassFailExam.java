package earlyjava.inheritance.analyzableinterface;

public class PassFailExam extends GradedActivity {
   private double pointsEach;
    private int numMissed;

   public PassFailExam(int questions, int missed,
                        double minPassing) {
        super(minPassing);
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