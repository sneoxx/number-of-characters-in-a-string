import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class Service {

    /**
     * Получить число вхождений символов в пришедшей строке
     *
     * @param inputString - пришедшая строка
     * @return - HashMap содержащая число вхождений каждого символа их прищедшей строки
     */
    static HashMap<Character, Integer> getNumberOfCharactersInAString (String inputString ) {
        HashMap<Character, Integer> result = new HashMap<>();
        char[] charArrayFromInputString = inputString.toLowerCase().replaceAll("\\s+","").toCharArray();

        for (char c : charArrayFromInputString) {
            result.merge(c, 1, Integer::sum);
        }

        return result;
    }

    /**
     * Записать из пришедшего HashMap в файл по указанному имени
     *
     * @param hashMapToWrite - HashMap из которой будем записывать в файл
     * @param fileName - имя файла куда будем записывать
     */
    public static void writeHashMapToFile(HashMap<Character, Integer> hashMapToWrite, String fileName) {
        try (Writer writer = new BufferedWriter(
                new FileWriter(fileName)
        )) {
            for (Map.Entry<Character, Integer> entry: hashMapToWrite.entrySet()) {
                writer.write(entry.getKey() + " - " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
