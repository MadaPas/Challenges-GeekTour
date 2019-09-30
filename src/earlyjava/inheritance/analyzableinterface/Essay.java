package earlyjava.inheritance.analyzableinterface;

class Essay extends GradedActivity {
    private int grammar, spelling, correctLength, content;

    public Essay(int g, int s, int cL, int ct) {
        grammar = g;
        spelling = s;
        correctLength = cL;
        content = ct;
    }

    public void doTotal() {
        super.setScore(grammar + spelling + correctLength + content);
    }

}
