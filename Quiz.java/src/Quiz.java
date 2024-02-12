import java.util.*;

class QuizQuestion {
    private String question;
    private List<String> options;
    private int correctOptionIndex;

    public QuizQuestion(String question, List<String> options, int correctOptionIndex) {
        this.question = question;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public boolean isCorrect(int selectedOptionIndex) {
        return selectedOptionIndex == correctOptionIndex;
    }
}

public class Quiz {
    private List<QuizQuestion> questions;
    private int score;

    public Quiz(List<QuizQuestion> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (QuizQuestion question : questions) {
            System.out.println(question.getQuestion());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            System.out.print("Enter your choice: ");
            int selectedOptionIndex = scanner.nextInt() - 1;

            if (question.isCorrect(selectedOptionIndex)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println();
        }

        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of " + questions.size());
        scanner.close();
    }

    public static void main(String[] args) {
        // Sample quiz questions
        List<QuizQuestion> questions = new ArrayList<>();
        questions.add(new QuizQuestion("What is the capital of France?",
                Arrays.asList("London", "Paris", "Berlin", "Madrid"), 1));
        questions.add(new QuizQuestion("Which planet is known as the Red Planet?",
                Arrays.asList("Mars", "Venus", "Jupiter", "Saturn"), 0));
        questions.add(new QuizQuestion("What is the chemical symbol for water?",
                Arrays.asList("H2O", "CO2", "O2", "CH4"), 0));

        Quiz quiz = new Quiz(questions);
        quiz.startQuiz();
    }
}
