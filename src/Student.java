import java.util.Arrays;

public class Student {
    private String surnName;
    private String givenName;
    private String ID;
    private Double[] Score = new Double[100];


    public Student(String givenName, String surnName, String ID, double score, int index) {
        this.surnName = surnName;
        this.givenName = givenName;
        this.ID = ID;
        Score[index] = score;
    }

    public Student(String givenName, String surnName, String id, String s, int index) {
        this.surnName = surnName;
        this.givenName = givenName;
        this.ID = id;
        Score[index] = Double.valueOf(s);
    }

    public String toString() {
        return surnName + "," + givenName + "\t" + ID + "\t" + Arrays.toString(Score);
    }

    public String getID() {
        return ID;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurnName() {
        return surnName;
    }

    public String getName() {
        return givenName + "," + surnName;
    }

    public Double[] getScore() {
        return Score;
    }

    public double getScore(int index) {
        if (Score[index] == null) return -1.0;
        return Score[index];
    }

    public void setSurnName(String surnName) {
        this.surnName = surnName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setScore(double score, int index) {

        Score[index] = score;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public int size() {
        return Score.length;
    }


}
