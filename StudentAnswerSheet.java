import java.util.List;
import java.util.ArrayList;
/**
 * Checks student's test scores
 *
 * @author Emily Wilber
 * @version January 31, 2019
 */
public class StudentAnswerSheet
{
    //  the list of the student's answers
    private ArrayList<String> answers;
    private String name;
    
    /**
     * Constructor for StudentAnswerSheet
     */
    public StudentAnswerSheet(ArrayList<String> answers, String name) {
        this.answers = answers;
        this.name = name;
    }
    
    /**
     * @param  key  the list of correct answers, represented as strings of length one
     *      Precondition: key.size() is equal to the number of answers in 
     *      this answer sheet
     * @return    this student's test score
     */
    public double getScore(ArrayList<String> key) 
    {
        double score = 0;
        for (int i = 0; i < key.size(); i++) {

           
            if (key.get(i).equals(answers.get(i))) {
                score++;
            }
            else if (!answers.get(i).equals("?")) {
                score -= 0.25;
            }
        }
        return score;
    }
    
    /**
     * @return the name of the student*/
    public String getName() {
        return name;
    }
}
