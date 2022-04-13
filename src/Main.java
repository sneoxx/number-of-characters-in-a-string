// Задача:
// На Java написать метод, которому на вход даётся строка,
// а на выходе формируется файл, содержащий количество использования каждый буквы в строке.
// Например, на вход подана строка "Java". На выходе формируется файл примерно такого содержания:
// a - 2
// j - 1
// v - 1

// Решение:
// Судя по примеру нужно привести символы к нижнему регистру
// И если верно понял формулировку "На выходе формируется файл" нужно записать результат в файл
//
// Задача решена с использование двух методов:
// 1 Получить число вхождений символов в пришедшей строке
// 2 Записать из пришедшего HashMap в файл по указанному имени
// если необходимо, чтобы точно как по условию, могу объединить в один метод
public class Main {

    public static void main(String[] args) {

        String stringExample1 = "Java";
        String stringExample2 = "Hello World";
        String stringExample3 = "The test task for counting the number of occurrences of a character in a string has been completed";

        System.out.println(Service.getNumberOfCharactersInAString(stringExample1));
        Service.writeHashMapToFile(Service.getNumberOfCharactersInAString(stringExample1), "file1.txt");

        System.out.println(Service.getNumberOfCharactersInAString(stringExample2));
        Service.writeHashMapToFile(Service.getNumberOfCharactersInAString(stringExample2), "file2.txt");

        System.out.println(Service.getNumberOfCharactersInAString(stringExample3));
        Service.writeHashMapToFile(Service.getNumberOfCharactersInAString(stringExample3), "file3.txt");
    }
}