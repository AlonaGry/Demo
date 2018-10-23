package Envelope;

import org.junit.jupiter.api.Test;

import static Envelope.EnvelopeAnalysis.compare;
import static org.junit.jupiter.api.Assertions.*;

class EnvelopeAnalysisTest {

    @Test
    void compareTheSameEnvelopes() throws Exception {

        Envelope env1 = new Envelope();
        Envelope env2 = new Envelope();
        env1.setHeight(1);
        env1.setWidth(1);
        env2.setHeight(1);
        env2.setWidth(1);

        boolean actual = compare(env1, env2);
        boolean expected = false;
        assertEquals(expected,actual);

    }

    @Test
    void compareTheDifferentHorizontallyCompatibleEnvelope() throws Exception {

        Envelope env1 = new Envelope();
        Envelope env2 = new Envelope();
        env1.setHeight(1);
        env1.setWidth(2);
        env2.setHeight(2);
        env2.setWidth(3);

        boolean actual = compare(env1, env2);
        boolean expected = true;
        assertEquals(expected,actual);

    }


    @Test
    void compareTheDifferentVerticallyCompatibleEnvelope() throws Exception {

        Envelope env1 = new Envelope();
        Envelope env2 = new Envelope();
        env1.setHeight(10);
        env1.setWidth(4);
        env2.setHeight(8);
        env2.setWidth(20);

        boolean actual = compare(env1, env2);
        boolean expected = true;
        assertEquals(expected,actual);

    }


}