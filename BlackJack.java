import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cardGuest = 0;
        int cardDialer = 0;
        int blinkCard = 0;
        int choice = 0;
        int exit = 0;
        int bank = 0;

        System.out.println("How many chips do you need?");
        int vznos = scanner.nextInt();
        Guest khambar = new Guest(vznos);
        while(exit != 2) {
            Dialer igor = new Dialer();
            for(;;) {
                System.out.println("Make your bet");
                int bet = scanner.nextInt();
                khambar.MakeBet(bet);
                if(khambar.getBank() < bet){
                    System.out.println("insufficient fund!");
                }else{
                    break;
                }
            }
            System.out.println("Your cards: ");
            for (int i = 0; i < 2; i++) {
                cardGuest = khambar.getCard();
                System.out.println(khambar.get_the_name_for_card(cardGuest));
                khambar.calculateTotal(cardGuest);
            }
            khambar.ifBlackJack(khambar.getTotal());
            System.out.println("Your total: " + khambar.getTotal());

            System.out.println("Dialers cards: ");
            cardDialer = igor.getCard();
            igor.calculateTotal(cardDialer);
            blinkCard = igor.getCard();
            igor.calculateTotal(blinkCard);
            System.out.println(igor.get_the_name_for_card(cardDialer) + " blink");

            if (khambar.isBlackJack()) {
                khambar.calculatePrizeForBJ(khambar);
                khambar.setBank(khambar.getPrizeforBJ());
                System.out.println("You've got Black Jack, you won: " + khambar.getPrizeforBJ() + "$");
            }

            while (khambar.getTotal() < 21 && !khambar.isBlackJack()) {
                System.out.println("pass(press 1); check(press 2); one more card(press 3)");
                choice = scanner.nextInt();
                if (choice == 1) {
                    khambar.ifPass();
                    break;
                } else if (choice == 3) {
                    cardGuest = khambar.getCard();
                    khambar.calculateTotal(cardGuest);
                    System.out.println("Your card: " + khambar.get_the_name_for_card(cardGuest));
                    System.out.println("Your total: " + khambar.getTotal());

                } else if (choice == 2) {
                    break;
                }
            }
            System.out.println("Second card was " + igor.get_the_name_for_card(blinkCard));
            System.out.println("Dialers total: " + igor.getTotal());
            while (igor.getTotal() < 16 && !khambar.isPass() && !khambar.isBlackJack()) {
                cardDialer = igor.getCard();
                System.out.println(igor.get_the_name_for_card(cardDialer));
                igor.calculateTotal(cardDialer);
                System.out.println("Dialers total: " + igor.getTotal());

            }
            if (!khambar.isBlackJack()) {
                if (!khambar.isPass()) {
                    try {
                        if (khambar.whoWin(khambar.getTotal(), igor.getTotal())) {
                            khambar.calculatePrize(khambar);
                            khambar.setBank(khambar.getPrize());
                            System.out.println("You win, your prize is " + khambar.getPrize() + "$");
                        } else {
                            System.out.println("You lose");
                            khambar.setBank(-khambar.getBet());
                        }
                    } catch (isclucheniya z) {
                        System.out.println("Tie");
                    }
                } else {
                    System.out.println("You lose");
                    khambar.setBank(-khambar.getBet());
                }
            }

            khambar.eraseTotal();
            System.out.println("Now you have: " + khambar.getBank());
            System.out.println("one more/exit (1/2)");
            exit = scanner.nextInt();
        }

    }
}
