import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    int number1 = 1;
    int number2 = 1;
    int number3 = 1;
    public void start(){
        Random randomNumber = new Random();
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        int userAnswer = 0;
        int [] totalResult = new int[3];
        System.out.println("В игре Quiz учавствуют 3 человека. Введите имя и отвечайте по очереди на 3 вопроса!");
        String[] playerNames = new String[3];

        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Введите имя: ");
            playerNames[counter] = scanner.next();
            int result = 0;
            for (int counter1 = 0; counter1 < 3; counter1 = counter1 + 1) {
                number1 = randomNumber.nextInt(0, 100);
                number2 = randomNumber.nextInt(0, 100);
                number3 = randomNumber.nextInt(0, 3);
                int correctAnswer = 0;
                if (number3 == 0) {
                    System.out.println("Сложите числа: " + number1 + " и " + number2);
                    int add = calculator.add(number1, number2);
                    correctAnswer = add;
                    userAnswer = scanner.nextInt();
                    System.out.println("Ваш ответ: " + userAnswer + " Правильный ответ: " + correctAnswer);
                }
                if (number3 == 1) {
                    System.out.println("Вычтите числа: " + number1 + " и " + number2);
                    int substract = calculator.subtract(number1, number2);
                    correctAnswer = substract;
                    userAnswer = scanner.nextInt();
                    System.out.println("Ваш ответ: " + userAnswer + " Правильный ответ: " + correctAnswer);
                }
                if (number3 == 2) {
                    System.out.println("Умножте числа: " + number1 + " и " + number2);
                    int multyply = calculator.multiply(number1, number2);
                    correctAnswer = multyply;
                    userAnswer = scanner.nextInt();
                    System.out.println("Ваш ответ: " + userAnswer + " Правильный ответ: " + correctAnswer);
                }
                if (number3 == 3) {
                    System.out.println("Поделите числа: " + number1 + " и " + number2);
                    int divide = calculator.divide(number1, number2);
                    correctAnswer = divide;
                    System.out.println("Ваш ответ: " + userAnswer + " Правильный ответ: " + correctAnswer);
                }
                if (userAnswer == correctAnswer) {
                    result = result + 5;
                    System.out.println("Отлично! Верный ответ, вы получаете 5 очков, общее количество очков " + result);
                } else {
                    result = result - 3;
                    System.out.println("Неверный ответ, отнимаем 5 очков, общее количество очков " + result);
                }
                totalResult[counter] = result;
            }
        }
        System.out.println("Ура, игра завершилась! Итоговые результаты: ");
        System.out.println(playerNames[0] + ": " + totalResult[0] + " баллов");
        System.out.println(playerNames[1] + ": " + totalResult[1] + " баллов");
        System.out.println(playerNames[2] + ": " + totalResult[2] + " баллов");
    }
}
