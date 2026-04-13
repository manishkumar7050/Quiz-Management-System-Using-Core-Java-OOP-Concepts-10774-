import java.util.Scanner;

class Quiz {
    private String questionText;
    private String[] options;
    private String correctAnswer;

    public Quiz(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println("\n" + questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean checkAnswer(String userAnswer) {
        // Allow both option number and text
        try {
            int choice = Integer.parseInt(userAnswer);
            if (choice >= 1 && choice <= options.length) {
                return options[choice - 1].equalsIgnoreCase(correctAnswer);
            }
        } catch (NumberFormatException e) {
            return userAnswer.equalsIgnoreCase(correctAnswer);
        }
        return false;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}

class QuizManager {
    private Quiz[] quizzes;
    private int score;

    public QuizManager(Quiz[] quizzes) {
        this.quizzes = quizzes;
        this.score = 0;
    }

    public void startQuiz() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < quizzes.length; i++) {
            quizzes[i].displayQuestion();
            System.out.print("Enter your answer (number or text): ");
            String userAnswer = sc.nextLine().trim();

            if (quizzes[i].checkAnswer(userAnswer)) {
                System.out.println("✅ Correct Answer!");
                score++;
            } else {
                System.out.println("❌ Wrong Answer!");
                System.out.println("Correct Answer is: " + quizzes[i].getCorrectAnswer());
            }
        }
        sc.close();
        displayResult();
    }

    public void displayResult() {
        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Total Score: " + score + "/" + quizzes.length);
        double percentage = ((double) score / quizzes.length) * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (percentage >= 80) {
            System.out.println("Remark: Excellent!");
        } else if (percentage >= 50) {
            System.out.println("Remark: Good Job!");
        } else {
            System.out.println("Remark: Need Improvement!");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Quiz[] quizzes = {
            new Quiz("What is the capital of India?",
                    new String[]{"Delhi", "Mumbai", "Kolkata", "Chennai"}, "Delhi"),
            new Quiz("Which language is platform independent?",
                    new String[]{"C", "Java", "Python", "Assembly"}, "Java"),
            new Quiz("OOP stands for?",
                    new String[]{"Object Oriented Programming", "Open Output Process", "Object Output Program", "None"},
                    "Object Oriented Programming")
        };

        QuizManager quizManager = new QuizManager(quizzes);
        quizManager.startQuiz();
    }
}