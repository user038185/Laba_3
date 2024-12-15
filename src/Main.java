import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Formatter;

public class Main {

    public static int pow(int value, int count) {
        int value_ = value;
        for (int i = 1; i < count; i++) {
            value_ = value_ * value;
        }
        return value_;
    }

    public static void main(String... A) {
        ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        String[] columnsHeader = new String[]{"Method", "1000", "10000", "100000"};
        String[][] str = new String[10][4];
        str[0][0] = "arraylist add";
        str[1][0] = "linkedlist add";
        str[2][0] = "arraylist get";
        str[3][0] = "linkedlist get";
        str[4][0] = "arraylist set";
        str[5][0] = "linkedlist set";
        str[6][0] = "arraylist delete";
        str[7][0] = "linkedlist delete";
        str[8][0] = "arraylist sort";
        str[9][0] = "linkedlist sort";
        long time;
        for (int i = 1; i <= 3; i++) {
            int I = pow(10, 2 + i);
            time = System.currentTimeMillis();
            for (int j = 0; j < I; j++) {
                array.add(j);
            }
            time = System.currentTimeMillis() - time;
            str[0][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = 0; j < I; j++) {
                list.add(j);
            }
            time = System.currentTimeMillis() - time;
            str[1][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = 0; j < I; j++) {
                array.get(j);
            }
            time = System.currentTimeMillis() - time;
            str[2][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = 0; j < I; j++) {
                list.get(j);
            }
            time = System.currentTimeMillis() - time;
            str[3][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = 0; j < I; j++) {
                array.set(j, j);
            }
            time = System.currentTimeMillis() - time;
            str[4][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = 0; j < I; j++) {
                list.set(j, j);
            }
            time = System.currentTimeMillis() - time;
            str[5][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = I - 1; j >= 0; j--) {
                array.remove(j);
            }
            time = System.currentTimeMillis() - time;
            str[6][i] = Long.toString(time);

            time = System.currentTimeMillis();
            Collections.sort(array);
            time = System.currentTimeMillis() - time;
            str[8][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = I - 1; j >= 0; j--) {
                list.remove(j);
            }
            time = System.currentTimeMillis() - time;
            str[7][i] = Long.toString(time);

            time = System.currentTimeMillis();
            Collections.sort(list);
            time = System.currentTimeMillis() - time;
            str[9][i] = Long.toString(time);

        }

        System.out.println("Time in millis.");
        Formatter formatter = new Formatter();
        System.out.println(formatter.format("%20s %20s %20s %20s", columnsHeader[0], columnsHeader[1], columnsHeader[2], columnsHeader[3]));
        for (int i = 0; i < 10; i++) {
            formatter = new Formatter();
            System.out.println(formatter.format("%20s %20s %20s %20s", str[i][0], str[i][1], str[i][2], str[i][3]));
        }
    }

}