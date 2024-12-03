/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Ashley Johnson
//Project Phase 2
//Ligt and dark side of the force 
package PersonalityQuiz;

/**
 *
 * @author ashleyjohnson
 */
public class QuizQuestion {
    // Attributes
    private String questionText; // The text of the quiz question
    private String[] answerChoices; // array of possible answers
    private int[] scores; // array of scores corresponding to each answer choice

    // Constructor: Initializes a QuizQuestion with text, answer choices, and scores
    public QuizQuestion(String questionText, String[] answerChoices, int[] scores) {
        this.questionText = questionText;
        this.answerChoices = answerChoices;
        this.scores = scores;
    }

    // Default Constructor: Initializes empty attributes
    public QuizQuestion() {
        this.questionText = "";
        this.answerChoices = new String[0];
        this.scores = new int[0];
    }

    // Getter for question text
    public String getQuestionText() {
        return questionText;
    }

    // Setter for question text
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    // Getter for answer choices
    public String[] getAnswerChoices() {
        return answerChoices;
    }

    // Setter for answer choices
    public void setAnswerChoices(String[] answerChoices) {
        this.answerChoices = answerChoices;
    }

    // Getter for scores
    public int[] getScores() {
        return scores;
    }

    // Setter for scores
    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // Method: Displays the question and answer choices
    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < answerChoices.length; i++) {
            System.out.println((i + 1) + ": " + answerChoices[i]);
        }
    }
}

