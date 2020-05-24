package kpfu.ru.MaximovKA;

import java.util.LinkedList;

public class Line {
    private LinkedList<Integer> dig;

    public Line(LinkedList<Integer> dig) {
        this.dig = dig;
    }

    @Override
    public String toString() {
        String res = "";

        for (Integer integer : this.dig) {
            res += integer;
        }

        return res;
    }

    public Line findNextLine() {
        int counter = 1;
        LinkedList<Integer> res = new LinkedList<>();

        if (this.dig.size() == 1) {
            res.add(counter);
            res.add(this.dig.get(0));
        }

        for (int i = 0; i < this.dig.size() - 1; i++) {
            if (this.dig.get(i).equals(this.dig.get(i + 1))) {
                counter++;
            }

            if (!this.dig.get(i).equals(this.dig.get(i + 1))) {
                res.add(counter);
                res.add(this.dig.get(i));
                counter = 1;
            }

            if (i == this.dig.size() - 2) {
                if (!this.dig.get(i).equals(this.dig.get(i + 1))) {
                    res.add(1);
                } else {
                    res.add(counter);
                }
                res.add(this.dig.get(i + 1));
            }
        }

        return new Line(res);
    }
}
