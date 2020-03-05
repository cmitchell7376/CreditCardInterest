import java.util.ArrayList;

public class TmpTest {
    public static void main(String [] args){

        ArrayList<Person> people = new ArrayList<>();
        Person charles = new Person("charles");
       // Person mia = new Person("mia");
        people.add(charles);
       // people.add(mia);

        Wallet charlesWallet = new Wallet("wallet1");
        Wallet charlesWallet2 = new Wallet("wallet2");
       // Wallet miaWallet = new Wallet("wallet1");

        Card card1 = new Card(100.00,"visa");
        Card card2 = new Card(100.00,"discover");
        Card card3 = new Card(100.00,"mastercard");

        charlesWallet.addCard(card1);
        charlesWallet.addCard(card2);
        charlesWallet2.addCard(card3);

        charles.addWallet(charlesWallet);
        charles.addWallet(charlesWallet2);
        //mia.addWallet(miaWallet);

        InterestCalculator interestCalculator = new InterestCalculator();
        interestCalculator.printStatements(interestCalculator.multiPeople(people));
    }
}
