package kpfu.ru.MaximovKA;

import java.util.LinkedList;

public class Sequence {
    private String sequence = "";

    public Sequence(int n) {
        try {
            if (n < 0) throw new Exception("BadLengthOfSequenceException");
            this.fillingSequenceTo(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillingSequenceTo(int n) {
        if (n == 0) {
            sequence = "Is empty sequence";
            return;
        }

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);

        Line line = new Line(list);

        if (n == 1) {
            sequence += line.toString();
        } else {
            sequence += line.toString() + "\n";
        }

        for (int i = 0; i < n - 1; i++) {
            line = line.findNextLine();
            sequence += line.toString();
            if (i < n - 2) {
                sequence += "\n";
            }
        }
    }

    @Override
    public String toString() {
        return sequence;
    }
}
