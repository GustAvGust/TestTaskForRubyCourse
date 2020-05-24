package kpfu.ru.MaximovKA;

import org.junit.Assert;
import org.junit.Test;

public class SequenceTest {

    @Test
    public void sequenceZeroLength() {
        Sequence zeroLengthSequence = new Sequence(0);
        Assert.assertEquals("Is empty sequence", zeroLengthSequence.toString());
    }

    @Test
    public void sequenceOneLength() {
        Sequence oneLengthSequence = new Sequence(1);
        Assert.assertEquals("1", oneLengthSequence.toString());
    }

    @Test
    public void sequenceSevenLength() {
        Sequence sevenLengthSequence = new Sequence(7);
        Assert.assertEquals("1\n" +
                            "11\n" +
                            "21\n" +
                            "1211\n" +
                            "111221\n" +
                            "312211\n" +
                            "13112221", sevenLengthSequence.toString());
    }

    @Test
    public void sequenceNegativeLength() {
        Sequence negativeLengthSequence = new Sequence(-1);
    }
}
