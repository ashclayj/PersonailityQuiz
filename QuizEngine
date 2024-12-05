package PersonalityQuiz;

import java.util.ArrayList;
import java.util.List;

public class QuizEngine {

    private List<QuizQuestion> questions;
    private List<UserResponse> userResponses;

    public QuizEngine() {
        this.questions = new ArrayList<>();
        this.userResponses = new ArrayList<>();
    }

    // Add a question to the quiz
    public void addQuestion(QuizQuestion question) {
        questions.add(question);
    }

    // Add a user response
    public void addUserResponse(UserResponse response) {
        userResponses.add(response);
    }

    // Start the quiz and manage the flow
    public void startQuiz() {
        for (QuizQuestion question : questions) {
            System.out.println(question.getQuestionText());
            // Assume input is handled externally and captured here.
            String userInput = getUserInput();
            UserResponse response = new UserResponse(question.getQuestionId(), userInput);
            addUserResponse(response);
        }
    }

    // Recalculate results based on user responses
    public void calculateResults() {
        // Implement scoring logic as needed
        int score = 0;

        for (UserResponse response : userResponses) {
            QuizQuestion question = findQuestionById(response.getQuestionId());
            if (question != null && question.isCorrect(response.getAnswer())) {
                score++;
            }
        }

        System.out.println("Your score is: " + score + "/" + questions.size());
    }

    // Helper method to find a question by ID
    private QuizQuestion findQuestionById(int questionId) {
        for (QuizQuestion question : questions) {
            if (question.getQuestionId() == questionId) {
                return question;
            }
        }
        return null;
    }

    // Placeholder for getting user input
    private String getUserInput() {
        // Replace with actual input logic, e.g., Scanner
        return "sample answer";
    }

    public static void main(String[] args) {
        QuizEngine engine = new QuizEngine();

        // Example questions
        QuizQuestion q1 = new QuizQuestion(1, "Landed on the Light Side", null);
        QuizQuestion q2 = new QuizQuestion(2, "Landed on the Dark Side", null);

        engine.addQuestion(q1);
        engine.addQuestion(q2);

        engine.startQuiz();
        engine.calculateResults();
    }
}

// Mock classes for QuizQuestion and UserResponse
class QuizQuestion {
    private int questionId;
    private String questionText;
    private String correctAnswer;

    public QuizQuestion(int questionId, String questionText, String correctAnswer) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean isCorrect(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}

class UserResponse {
    private int questionId;
    private String answer;

    public UserResponse(int questionId, String answer) {
        this.questionId = questionId;
        this.answer = answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getAnswer() {
        return answer;
    }
}
