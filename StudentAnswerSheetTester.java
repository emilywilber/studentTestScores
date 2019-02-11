import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * tests the thing
 *
 * @author Emily Wilber
 * @version Jan 31, 2019
 */
public class StudentAnswerSheetTester
{
    public static void main(String[] args)
    {
        ArrayList<String> key = new ArrayList<String>
                        (Arrays.asList(new String[] {"A", "C", "D", "E", "B", "C", "E", "B", "B", "C"}));
                        
        ArrayList<String> paulAns = new ArrayList<String>
                        (Arrays.asList(new String[] {"A", "B", "D", "E", "A","C", "?", "B", "D", "C"}));
                        
        ArrayList<String> daveAns = new ArrayList<String>
                        (Arrays.asList(new String[] {"A", "?", "A", "E", "A","C", "?", "B", "D", "C"}));
                        
        ArrayList<String> timmyAns = new ArrayList<String>
                        (Arrays.asList(new String[] {"A", "C", "D", "E", "A","C", "?", "B", "D", "C"}));
        
        StudentAnswerSheet paul = new StudentAnswerSheet(paulAns, "Paul");
        System.out.println(paul.getName() + ": " + paul.getScore(key));
        StudentAnswerSheet dave = new StudentAnswerSheet(daveAns, "Dave");
        System.out.println(dave.getName() + ": " + dave.getScore(key));
        StudentAnswerSheet timmy = new StudentAnswerSheet(timmyAns, "Timmy");
        System.out.println(timmy.getName() + ": " + timmy.getScore(key));
        
        ArrayList<StudentAnswerSheet> mysheets = new ArrayList<StudentAnswerSheet>();
        
        mysheets.add(paul);
        mysheets.add(dave);
        mysheets.add(timmy);
        
        TestResults T = new TestResults(mysheets);
        //ArrayList<StudentAnswerSheet> students = new ArrayList<StudentAnswerSheet>();
        //    students.add(paul);
            
        //    TestResults theClass = new TestResults(students);
        System.out.println("Best: " + T.highestScoringStudent(key));
    }
}