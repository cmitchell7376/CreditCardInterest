import java.util.ArrayList;

public class InterestCalculator {

    Visa visa = new Visa();
    MasterCard masterCard = new MasterCard();
    Discover discover = new Discover();

    public String onePerson(Person person){

        String statement = "";

        //check to see if person have more than one wallet
        if(person.getWallets().size() <= 1) {

            double total = 0;
            statement = person.getName() + "\n";

            for (Card card : person.getWallets().iterator().next().getCards()) {
                double cardInterest = calInterest(card.getAmount(), getRate(card.getCardType()));
                statement += card.getCardType() + " interest " + " = " + " $" + cardInterest + "\n";
                total += cardInterest;
            }

            statement += "Total interest = " + " $" + total;

        } else {

            double total = 0;
            statement = person.getName() + "\n";

            for (Wallet wallet: person.getWallets()) {

                double walletTotal = 0;
                statement += wallet.getName() + " interest = " + " $";

                for (Card card: person.getWallets().iterator().next().getCards()) {
                    double cardInterest = calInterest(card.getAmount(),getRate(card.getCardType()));
                    walletTotal += cardInterest;
                }

                total += walletTotal;
                statement += walletTotal + "\n";
            }
            statement += "Total interest = " + " $" + total;
        }

        return statement;
    }

    public ArrayList<String> multiPeople(ArrayList<Person> people){

        ArrayList<String>statements = new ArrayList<>();

        for (Person person: people) {

            String statement = "";
            double total = 0;
            statement += person.getName() + "\n";

            for (Wallet wallet: person.getWallets()) {

                double walletTotal = 0;
                statement += wallet.getName() + " interest = " + " $";

                for (Card card: person.getWallets().iterator().next().getCards()) {
                    double cardInterest = calInterest(card.getAmount(),getRate(card.getCardType()));
                    walletTotal += cardInterest;
                }

                total += walletTotal;
                statement += walletTotal + "\n";
            }
            statement += "Total interest = " + " $" + total;
            statements.add(statement);
        }

        return statements;
    }

    public void printStatements(ArrayList<String>statements){
        for (String statement:statements) {
            System.out.println(statement + "\n");
        }
    }

    public Double calInterest(double p,double r){
        double interest;
        interest = p * r;
        return interest;
    }

    public Double getRate(String cardType){

        double rate = 0;

        if(cardType.equalsIgnoreCase(visa.getName())){
            rate = visa.getRate();
        }
        else if(cardType.equalsIgnoreCase(masterCard.getName())){
            rate = masterCard.getRate();
        }else if(cardType.equalsIgnoreCase(discover.getName())){
            rate = discover.getRate();
        }
        return rate;
    }
}
