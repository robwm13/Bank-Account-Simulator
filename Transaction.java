public class Transaction {
    
    public static final String DEPOSIT = "DEPOSIT";
    public static final String WITHDRAWAL = "WITHDRAWAL";
    public static final String TRANSFER = "TRANSFER";
    private static int nextID = 0;

    private final String type;
    private final String transactionID;
    private final double amount;
    private final String timeStamp;
    private final String description;
    private final double resultingBalance;

    public Transaction (String type, double amount, String timeStamp, String description, double resultingBalance) {
        this.type = type;
        this.amount = amount;
        this.timeStamp = timeStamp;
        this.description = description;
        this.resultingBalance = resultingBalance;
        this.transactionID = String.valueOf(++nextID);
    }

    public String getType() {
        return this.type;
    }

    public double getAmount() {
        return this.amount;
    }

    public String toString() {

        return String.format("|| Transaction ID: %5s | Type: %10s | Amount: %15.2f | Timestamp: %20s | Description: %20s | Resulting Balance: %15.2f ||",
                this.transactionID, this.type, this.amount, this.timeStamp, this.description, this.resultingBalance);

    }

}   
