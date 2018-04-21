public class Guest extends TwentyOne{
    protected int bet;
    protected boolean pass;
    protected int bank;

    public Guest( int bank){
        this.bank = bank;
    }
    public void MakeBet(int bet) {
        this.bet = bet;
    }
    public int getBet(){
        return bet;
    }
    public void setBank (int b){
        this.bank += b;
    }
    public int getBank(){
        return bank;
    }
    public void ifPass(){
        this.pass = true;
    }
    public boolean isPass(){
        return pass;
    }



}
