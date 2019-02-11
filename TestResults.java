import java.util.List;
import java.util.ArrayList;
/**
 * Represents the test results of a group of students
 *
 * @author Emily Wilber
 * @version Jane 31, 2019
 */
public class TestResults
{
    // instance variables - replace the example below with your own
    private ArrayList<StudentAnswerSheet> sheets; 
    
    //constructor
    public TestResults(ArrayList<StudentAnswerSheet> insheets) {
        this.sheets = insheets;
    }
    /**
     * Precondition: sheets.size() > 0;
     *               all answer sheets in sheets have the same number of answers
     * @param key    the list of correct answers represented as strings of length one
     *               Precondition: key.size() is equal to the number of answers
     *                             in each of the answer sheets in sheets
     * @return       the name of the student with the highest score
     */
    public String highestScoringStudent(ArrayList<String> key)
    {
        double max = sheets.get(0).getScore(key);
        String best = sheets.get(0).getName();
        for (int i = 0; i < sheets.size(); i++) {
            StudentAnswerSheet student = sheets.get(i);
            if (student.getScore(key) > max) {
                max = student.getScore(key);
                best = student.getName();
            }
        }
        return best;
    }

    
}