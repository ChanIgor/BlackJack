import javax.swing.*;
import java.util.jar.JarEntry;

abstract class TwentyOne {
    protected int card;
    protected boolean BJ;
    protected int Ace = 11;
    protected int King = 10;
    protected int Queen = 10;
    protected int Jack = 10;
    protected int Nine = 9;
    protected int Eight = 8;
    protected int Seven = 7;
    protected int Six = 6;
    protected int Five = 5;
    protected int Four = 4;
    protected int Three = 3;
    protected int total = 0;
    protected int prize = 0;

    public TwentyOne(){

    }

    public void ifBlackJack (int total){
            if(total == 21){
                this.BJ = true;
            }else{
                this.BJ = false;
            }
    }
    public boolean isBlackJack(){
        return BJ;
    }
    public int getCard (){
        this.card = (int)(Math.random() * (12 - 3) + 3);
        return card;
    }
    /*
    public void setTotal(int c, int total){
        if(c == 11 && (getTotal() + c > 21)){
            c = 1;
            this.total = total - c;
        }else {
            this.total = total;
        }

    }
    public int getTotal(){
        return total;
    }
    */
    public void calculateTotal(int card){
        if(card == 11 && (total + card) > 21){
            this.total += 1;
        }else{
            this.total += card;
        }

    }
    public int getTotal(){
        return total;
    }
    public void eraseTotal(){
        this.total = 0;
    }
    public void calculatePrizeForBJ(Guest guest){
        this.prize = (guest.getBet()) * 3;
    }
    public int getPrizeforBJ(){
        return prize;
    }
    public void calculatePrize(Guest guest){
        this.prize = (guest.getBet()) * 2;
    }
    public int getPrize(){
        return prize;
    }
    public String get_the_name_for_card(int card){
        if(card == Three) {
            return "Three";
        }else if(card == Four){
            return "Four";
        }else if(card == Five){
            return "Five";
        }else if(card == Six) {
            return "Six";
        }else if(card == Seven) {
            return "Seven";
        }else if(card == Eight) {
            return "Eight";
        }else if(card == Nine){
            return "Nine";
        }
        if(card == 10) {
            int choose = (int)(Math.random() * 3) + 1;
            if(choose == 1) {
                return "Jack";
            } else if(choose == 2) {
                return "Queen";
            }else {
                return "King";
            }
        }else {
            return "Ace";
        }

    }

    public boolean whoWin  (int totalGuest, int totalDialer) throws isclucheniya{
        if (totalGuest > 21 && totalDialer <= 21) {
            return false;
        } else if (totalGuest <= 21 && totalDialer > 21) {
            return true;
        } else if (totalGuest <= 21 && totalDialer <= 21) {
            if(totalGuest > totalDialer){
                return true;
            }else if(totalDialer > totalGuest){
                return false;
            }
        }else if(totalDialer >= 21 && totalGuest >= 21){
            if(totalDialer < totalGuest){
                return false;
            }else if(totalDialer > totalGuest){
                return true;
            }
        }
        throw new isclucheniya();
    }


}
