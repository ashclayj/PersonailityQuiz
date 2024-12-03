
package PersonalityQuiz;

/**
 *
 * @author Lukas Hamm
 * Date: 12 / 3 / 2024
 * Project Part 2 (Place Holder)
 * Description: Our overall project will have 3 separate classes those being:
 * UserResponse (this class), QuizQuestion, and QuizEngine. UserResponse class
 * deals with handling of user responses and updates to the overall score, which decides
 * whether or not the end user is on the Light/Dark Side of The Force.
 * 
 */
public class UserResponse {
    
    
    //Attributes
    
    String userName; 
    int lightSideScore;
    int darkSideScore;
    
    //Default constructor
    
    public UserResponse(){
        this.userName = "Random";
        this.lightSideScore = 0;
        this.darkSideScore = 0;
    }
    
    //Constructor w/ parameters
    
    public UserResponse (String userName){
        this.userName = userName;
        this.lightSideScore = 0;
        this.darkSideScore = 0;
    }
    
    //Getter for username
    
    public String getUserName(){
        return userName;
    }
    
    //Setter for username
    
    public void setUserName(String userName){
        this.userName = userName; 
    }
    
    //Getter for light side scoring
    
    public int getLightSide(){
        return lightSideScore;
    }
    
    //Getter for dark side scoring
    
    public int getDarkSide(){
        return darkSideScore;
    }
    
    //Method to process the user's answers and update their scores
    
    public void processAnswer(int answer, QuizQuestion question ){
        int score = question.getScores()[answer];
        if (score > 0){
            lightSideScore += score;
        }else{
            darkSideScore += Math.abs(score);
        }
        
    }
    
    //Method to display scores/ current score status
    
    public void displayScores(){
        System.out.println("Your current score: ");
        System.out.println("Light side: " + lightSideScore);
        System.out.println("Dark side: " + darkSideScore);
    }
}
