package Envelope;

public class EnvelopeAnalysis {

    private Envelope env1;
    private Envelope env2;

    public static boolean compare(Envelope env1, Envelope env2) {

        return (((env1.getWidth() < env2.getWidth()) &&
                env1.getHeight() < env2.getHeight()) ||
                (env1.getWidth() < env2.getHeight()) &&
                        (env1.getHeight() < env2.getWidth())) ||
                (((env1.getWidth() > env2.getWidth()) &&
                        env1.getHeight() > env2.getHeight()) ||
                        (env1.getWidth() > env2.getHeight()) &&
                                (env1.getHeight() > env2.getWidth()));
    }
}
