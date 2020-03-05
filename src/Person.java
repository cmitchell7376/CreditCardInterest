import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Wallet>wallets = new ArrayList<>();

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Wallet> getWallets(){
        return wallets;
    }

    public void addWallet(Wallet wallet){
        wallets.add(wallet);
    }

    public void removeWallet(Wallet wallet){
        wallets.remove(wallet);
    }
}
