import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class InterestCalculatorTest {

    Person charles = new Person("Charles");
    Person mia = new Person("Mia");
    Wallet wallet1 = new Wallet("Wallet1");
    Wallet wallet2 = new Wallet("wallet2");
    Card card1 = new Card(100.00,"visa");
    Card card2 = new Card(100.00,"mastercard");
    Card card3 = new Card(100.00,"discover");
    Card card4 = new Card(100.00,"mastercard");
    InterestCalculator interestCalculator = new InterestCalculator();
    ArrayList<Person> people = new ArrayList<>();


    @Test
    public void onePerson() {
        charles.addWallet(wallet1);
        charles.addWallet(wallet2);
        wallet1.addCard(card1);
       // wallet1.addCard(card2);
        wallet1.addCard(card3);
        wallet2.addCard(card4);

        //test case 1
       /* assertEquals("Charles" + "\n" + "visa interest  =  $" + 10.0 + "\n" + "mastercard interest  =  $" + 5.0
        + "\n" + "discover interest  =  $" + 1.0 + "\n" + "Total interest =  $" + 16.0,interestCalculator.onePerson(charles));
        */

        //test case 2
        assertEquals("Charles" + "\n" + "Wallet1 interest =  $" + 11.0 + "\n" + "wallet2 interest =  $" + 11.0
                + "\n" + "Total interest =  $" + 22.0,interestCalculator.onePerson(charles));
    }

    @Test
    public void multiPeople() {
        charles.addWallet(wallet1);
        mia.addWallet(wallet2);
        people.add(charles);
        people.add(mia);


        wallet1.addCard(card2);
        wallet1.addCard(card1);
        wallet1.addCard(card2);
        wallet2.addCard(card1);
        wallet2.addCard(card2);

        assertEquals("[Charles" + "\n" + "Wallet1 interest = " + " $" + 20.00 + "\n" + "Total interest = " + " $" + 20.00 +
                "\n" + "Mia" + "\n" + "Wallet2 interest = " + " $" + 15.00 + "\n" + "Total interest = " + " $" + 15.00 +"]",
                interestCalculator.multiPeople(people));

    }

    @Test
    public void printStatements() {
    }

    @Test
    public void calInterest() {
    }

    @Test
    public void getRate() {
    }
}