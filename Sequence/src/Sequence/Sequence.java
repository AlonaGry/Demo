package Sequence;

public class Sequence {
    private int firstNumber;
    private int length;

    public Sequence(){}

    public void SetFirstNumber(String m) {
        int square = 0;
        try {
            square = Integer.parseInt(m);
        }
        catch (NumberFormatException e){
            new NumberFormatException("It is not an integer number");
        }

        if (Math.sqrt(square) == (int) Math.sqrt(square)){
            firstNumber = (int) Math.sqrt(square);
        } else {
            firstNumber = (int) Math.sqrt(square) + 1;
        }
    }

    public void SetLength (String n)throws SequenceException{

        if(Integer.parseInt(n) <= 0) throw new SequenceException("The number most be more then 0");

        try {
            length = Integer.parseInt(n);
        }
        catch (NumberFormatException e){
            new NumberFormatException("It is not an integer number");
        }
    }

    public int[] getSequenceArr() {

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = firstNumber + i;
        }
        return arr;
    }
}

