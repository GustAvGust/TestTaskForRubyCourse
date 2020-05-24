import java.util.LinkedList;

public class Main {
    private static LinkedList<Integer> findNum(LinkedList<Integer> num) {
        int counter = 1;
        LinkedList<Integer> res = new LinkedList<>();

        for (int i = 0; i < num.size() - 1; i++) {
            if (num.get(i).equals(num.get(i + 1))) {
                counter++;
            }

            if (!num.get(i).equals(num.get(i + 1))) {
                res.add(counter);
                res.add(num.get(i));
                counter = 1;
            }

            if (i == num.size() - 2) {
                if (!num.get(i).equals(num.get(i + 1))) {
                    res.add(1);
                } else {
                    res.add(counter);
                }
                res.add(num.get(i + 1));
            }
        }

        return res;
    }

    /*
    * 1
    * 11
    * 21
    * 1211
    * 111221
    * 312211
    * 13112221
    * 1113213211
    * 31131211131221
    */

    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();

        int n = 10;
        num.add(1);
        System.out.println(num); // [1]

        num.add(1);
        System.out.println(num); // [1, 1]

        for (int i = 0; i < n - 2; i++) {
            num = findNum(num);
            System.out.println(num);
        }
    }
}
