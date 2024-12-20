package PersonalityQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizEngine {

    private List<QuizQuestion> questions;
    private List UserResponse userResponse;

    public QuizEngine(UserResponse userResponse) {
        this.questions = new ArrayList<>();
        this.userResponses = new ArrayList<>();
    }

    // Add a question to the quiz
    public void addQuestion(QuizQuestion question) {
        questions.add(question);
    }

    // Start the quiz and manage the flow
    public void startQuiz() {
        Scanner sc = new Scanner(System.in);
        for (QuizQuestion question : questions) {
            System.out.print("Enter your choice (1-" + question.getAnswerChoices().length + "): ");
            int userChoice = sc.nextInt();
            if (question.isValidChoice(userChoice)) {
                userResponse.processAnswer(userChoice - 1, question);
            } else {
                System.out.println("Invalid choice. No score recorded for this question.");
            }
        }
        sc.close();
    }

    public void displayFinalScores() {
        userResponse.displayScores();
        int light = userResponse.getLightSide();
        int dark = userResponse.getDarkSide();
        if (light > dark) {
            System.out.println("You have chosen the path of the Light Side!");
        } else if (dark > light) {
            System.out.println("You have chosen the path of the Dark Side!");
        } else {
            System.out.println("You are balanced between the Light and Dark sides.");
        }
    }

    public static void main(String[] args) {
        UserResponse user = new UserResponse("Luke");
        QuizEngine engine = new QuizEngine(user);

        // Example questions
        String[] answers1 = {"Help them", "Ignore them", "Harm them"};
        int[] scores1 = {2, 0, -2};
        QuizQuestion q1 = new QuizQuestion("You encounter an injured stranger. What do you do?", answers1, scores1);

        String[] answers2 = {"Wait patiently", "Act rashly", "Seize control"};
        int[] scores2 = {2, 0, -2};
        QuizQuestion q2 = new QuizQuestion("Your mentor advises patience, but opportunity arises...", answers2, scores2);

        engine.addQuestion(q1);
        engine.addQuestion(q2);

        engine.startQuiz();
        engine.displayFinalScores();
    }
}

