import java.util.*;
import javax.swing.JOptionPane;
public class TestScore {
    static ArrayList<Integer> Score = new ArrayList<Integer>();
    static ArrayList<String> ID = new ArrayList<String>();
    static int i = 0;
    public static void main(String[] args) throws Exception {
        ID.add("2001");
        ID.add("2002");
        ID.add("2003");
        ID.add("2004");
        ID.add("2005");
        
        JOptionPane.showMessageDialog(null, "Student IDs:\n" + ID.get(0) + "\n" + ID.get(1) + "\n" + ID.get(2) + "\n" + ID.get(3) + "\n" + ID.get(4));
        while(i < ID.size()) {
            
        try {
            askForScores();
        }catch (ScoreException e) {
            JOptionPane.showMessageDialog(null, "The Score entered for Student " + ID.get(i) + " is not a valid Score (it must be between 0 and 100)\nYou Entered: " + Score.get(i));
            System.out.println("score exp");
            Score.set(i, 0);
        }catch (Exception f) {
            
            JOptionPane.showMessageDialog(null, "The Score entered for Student " + ID.get(i) + " is not a valid Score (it must be between 0 and 100)\n");
            System.out.println("reg exp");
            Score.set(i, 0);
        }
            i++;
        }
        dispIDandScores();
        

    }

    public static void askForScores() throws ScoreException {
        
            Score.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Please type a score for Student ID: " + ID.get(i))));
            if(Score.get(i) < 0 || Score.get(i) > 100){
                throw(new ScoreException("Score must be between 0 and 100"));
            }

    }
    public static void dispIDandScores(){
        int l = 0;
        StringBuilder display = new StringBuilder();
        while(l < ID.size()){
            display.append(ID.get(l) + ": " + Score.get(l) + "\n");
            l++;
        }
        JOptionPane.showMessageDialog(null, display.toString());

    }

}
