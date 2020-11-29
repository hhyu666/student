import edu.princeton.cs.algs4.StdOut;

import java.io.BufferedReader;
import java.io.IOException;

public class AddStudent {
    public static void ChooseStudent(String classtxt, int NumberClass, AllStudent allStudent) throws IOException {//处理班级文件
        BufferedReader br = tool.ReadTxt(classtxt);
        assert br != null;
        String line = br.readLine();
        line = br.readLine();
        int number = Integer.parseInt(line);
        for (int i = 0; i < number; i++) {
            line = br.readLine();
            String[] student = tool.SpiltString(line);
            int ok = FindStudent(student[2], allStudent);
            if (ok != -1) {

                UpdateStudent(allStudent.AllStudent.get(ok), Double.parseDouble(student[3]), NumberClass);

            } else {
                addStudent(allStudent, student[0], student[1], student[2], Double.parseDouble(student[3]), NumberClass);
            }

            StdOut.println();
        }
    }

    public static int FindStudent(String id, AllStudent allStudent) {
        for (int i = 0; i < allStudent.AllStudent.size(); i++) {
            if (id.equals(allStudent.AllStudent.get(i).getID())) {
                return i;
            }
        }
        return -1;
    }

    public static void UpdateStudent(Student student, double score, int index) {
        student.setScore(score, index);
    }

    public static void addStudent(AllStudent allStudent, String surnName, String givenName, String ID, double score, int index) {
        allStudent.AllStudent.add(new Student(surnName, givenName, ID, score, index));
    }


}
