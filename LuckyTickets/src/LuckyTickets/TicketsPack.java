package LuckyTickets;

public class TicketsPack {

    private int firstInPack;
    private int lastInPack;

    public TicketsPack(){}

    public void setFirstInPack(int firstInPack) throws  MyException {
        if (firstInPack < 0 || firstInPack > 999999) throw new MyException("The number must be >= 0");
           this.firstInPack = firstInPack;
        }

    public void setLastInPack(int to) throws MyException {
        if (lastInPack < 0 || lastInPack > 999999) throw new MyException("The number must be >= 0");
        this.lastInPack = lastInPack;
    }

    public int getFirstInPack() {
        return firstInPack;
    }

    public int getLastInPack() {
        return lastInPack;
    }
}
