package Sequence;

public class Sequence {
    private int firstNumber=-1;
    private int length=-1;

    public Sequence(){}

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getLength() {
        return length;
    }

    public void SetFirstNumber(String m) throws MyException {
        int square = 0;
        try {
            square = Integer.parseInt(m);
        }
        catch (NumberFormatException e){
            throw new MyException("It is not an integer number");
        }

        if (Math.sqrt(square) == (int) Math.sqrt(square)){
            firstNumber = (int) Math.sqrt(square);
        } else {
            firstNumber = (int) Math.sqrt(square) + 1;
        }
    }

    public void SetLength (String n)throws MyException {

        try {
            length = Integer.parseInt(n);
        }
        catch (NumberFormatException e){
            throw new MyException("It is not an integer number");
        }
        if(length <= 0) throw new MyException("The number most be more then 0");
    }

    public int[] getSequenceArr() {

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = firstNumber + i;
        }
        return arr;
    }
}

