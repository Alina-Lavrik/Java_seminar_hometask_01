
import java.io.*;
import java.util.stream.Collectors;
import java.io.BufferedReader;

public class hometask_002_read {

    String numberA;
    String numberB;
    int a;
    int b;

    public int fileRead(String variable) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            if (str.contains("a")) {
                numberA = str.chars()
                        .filter(c -> !Character.isLetter(c))
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
                        .trim();

            } else if (str.contains("b")) {
                numberB = str.chars()
                        .filter(c -> !Character.isLetter(c))
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
                        .trim();
            } else {
                System.out.println("Error!");
                break;
            }
        }
        br.close();

        if (variable == "a") {
            return a = Integer.parseInt(numberA);
        } else {
            return b = Integer.parseInt(numberB);
        }    
    }

}
