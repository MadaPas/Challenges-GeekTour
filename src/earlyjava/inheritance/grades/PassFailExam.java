package earlyjava.inheritance.grades;

public class PassFailExam extends GradedActivity {

    public PassFailExam(int questions, int missed,
                        double minPassing) {
        super(minPassing);
        double numericScore;
        double pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);
        setScore(numericScore);
    }

}