public class Card {
    private String name;
    private Double amount;
    private String cardType;

    public Card(Double amount,String cardType){
        this.amount = amount;
        this.cardType = cardType;
    }

    public String getName(){
        return name;
    }

    public Double getAmount(){
        return amount;
    }

    public String getCardType(){
        return cardType;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setName(String name) {
        this.name = name;
    }
}
