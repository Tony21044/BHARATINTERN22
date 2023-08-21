import java.util.*;
public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz App!");

        // Load questions for different quiz topics.
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the 'Red Planet'?",
            "What is the largest mammal on Earth?",
            // Add more questions here
        };

        String[] correctAnswers = {"Paris", "Mars", "Blue Whale"};

        // Display available quiz topics and let the user choose one.
        System.out.println("Choose a quiz topic:");
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
        }

        int selectedTopic = scanner.nextInt();

        // Loop through questions, display them, get user's answer, and update score.
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            scanner.nextLine(); // Consume newline left by previous nextInt()
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswers[i]);
            }
        }

        System.out.println("\nQuiz completed! Your score: " + score + " out of " + questions.length);

        scanner.close();
    }
}

