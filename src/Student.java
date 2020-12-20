import java.util.Arrays;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String studentID;
    private final Double[] scores = new Double[100];

    public Student(String buf_info, int index) {
        String[] temp_info = buf_info.split(",");
        this.firstName = temp_info[0];
        this.lastName = temp_info[1];
        this.studentID = temp_info[2];
        this.scores[index] = Double.parseDouble(temp_info[3]);
    }

    public String toString() {
        return lastName + "," + firstName + "\t" + studentID + "\t" + Arrays.toString(scores);
    }

    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + "," + lastName;
    }

    public Double[] getScores() {
        return scores;
    }

    public double getScore(int index) {
        if (scores[index] == null) return -1.0;
        return scores[index];
    }


    public void setScore(double score, int index) {

        scores[index] = score;
    }

    public int size() {
        return scores.length;
    }


    public String Grade(int index) {
        double score = scores[index];
        if (score >= 93) return "A+";
        else if (score >= 88) return "A";
        else if (score >= 83) return "A-";
        else if (score >= 78) return "B+";
        else if (score >= 72) return "B";
        else if (score >= 68) return "B-";
        else if (score >= 63) return "C+";
        else if (score >= 58) return "C";
        else if (score >= 53) return "C-";
        else if (score >= 50) return "D";
        else if (score >= 40) return "F";
        else return "O";
    }
}
