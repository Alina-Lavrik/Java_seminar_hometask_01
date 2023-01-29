// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000
import java.io.FileWriter;
import java.io.IOException;


public class hometask_002 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("input.txt", false)) {  
            fw.write("b 3");
            fw.append('\n');
            fw.write("a 10");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    } 
    public void readpow(int a, int b) {
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            if (a == 0 && b == 0) {
                fw.write("Not defined");
                fw.close();
            } else {
                fw.write(String.format("a = %d, b = %d, a in degree b = %s", a, b, Math.pow(a, b)));
                fw.close();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

