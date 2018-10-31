package LuckyTickets;

public class LuckyTicketsCount {

    private int firstWayCount;
    private int secondWayCount;

    int numeral[] = new int[6];

    public int[] getNumeral(int number) {

        for (int i=0; i<6; i++) {
            numeral[i] = number % 10;
            number = number / 10;
        }
        return numeral;
    }

    public boolean isLuckyFirstWay(){
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i < numeral.length/2; i++){
        sum1+= numeral[i];
        }
        for (int i=numeral.length/2; i < numeral.length; i++) {
            sum2 += numeral[i];
        }
        return sum1==sum2;
    }

    public boolean isLuckySecondWay(){
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i < numeral.length; i++){
            if (numeral[i]%2==0) {
                sum1 += numeral[i];
            }
        }
        for (int i=0; i < numeral.length; i++) {
            if (numeral[i]%2!=0) {
                sum2 += numeral[i];
            }
        }
        return sum1==sum2;
    }

    public String count(TicketsPack pack){
        String result;
        for (int num = pack.getFirstInPack(); num<=pack.getLastInPack();num++){
            getNumeral(num);
            if(isLuckyFirstWay()){
                firstWayCount++;
            }
            if(isLuckySecondWay()){
                secondWayCount++;
            }

        }
        if (firstWayCount > secondWayCount){
            result = "First count: " + firstWayCount +"\n"+ "Second count: " + secondWayCount+"\n" + "First way is luckier" ;
        } else if (firstWayCount < secondWayCount){
            result = "First count: " + firstWayCount +"\n"+ "Second count: " + secondWayCount+"\n" + "Second way is luckier" ;
        } else {
            result = "First count: " + firstWayCount +"\n"+ "Second count: " + secondWayCount+"\n" + "Both are lucky" ;
        }
        return result;
    }

}
