import java.util.Scanner;

public class Main {
    //1. Генерация пароля
    //а.Выбор длины и сложности
    //Генерация одного символа

    public static void main(String[] args) {
        System.out.println("Введите желаемую длину пароля");
        Scanner scanner = new Scanner(System.in);
        int lengthOfPassword = scanner.nextInt();
        StringGeneration stringGenerator = new StringGeneratorImpl();
        String resultOfPassword = stringGenerator.generateString(lengthOfPassword);
        StringGeneration stringGeneratorTwo = new FakePassword();
        String resultOfFake = stringGeneratorTwo.generateString(lengthOfPassword);
        System.out.println(resultOfFake);
        System.out.println();
        System.out.println(resultOfPassword);

    }
}
