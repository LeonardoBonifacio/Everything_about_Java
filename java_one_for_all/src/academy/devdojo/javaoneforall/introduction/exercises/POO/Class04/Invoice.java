package academy.devdojo.javaoneforall.introduction.exercises.POO.Class04;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfItemBeingPurchased;
    private double priceForItem;


    public Invoice(String partNumber, String partDescription, int quantityOfItemBeingPurchased, double priceForItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (quantityOfItemBeingPurchased > 0 && priceForItem > 0) {
            this.quantityOfItemBeingPurchased = quantityOfItemBeingPurchased;
            this.priceForItem = priceForItem;
        }
        else{
            this.quantityOfItemBeingPurchased = 0;
            this.priceForItem = 0.0;
        }
    }

    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public void setQuantityOfItemBeingPurchased(int quantityOfItemBeingPurchased){
        if (quantityOfItemBeingPurchased > 0) {
            this.quantityOfItemBeingPurchased = quantityOfItemBeingPurchased;
        }
    }

    public void setPriceForItem(double priceForItem){
        if (priceForItem > 0) {
            this.priceForItem = priceForItem;
        }
    }

    public String getPartNumber(){
        return this.partNumber;
    }

    public String getPartDescription(){
        return this.partDescription;
    }

    public int getQuantityOfBeingPurchased(){
        return this.quantityOfItemBeingPurchased;
    }

    public double getPriceForItem(){
        return this.priceForItem;
    }

    public double getInvoiceAmount(){
        double invoiceAmount = this.priceForItem * this.quantityOfItemBeingPurchased;
        if (invoiceAmount > 0) {
            return invoiceAmount;
        }
        return 0.0;
    }

    public void printAll(){
        System.out.println("The partNumber is: " + this.partNumber);
        System.out.println("The partDescription is: " + this.partDescription);
        System.out.println("The QuantityOfItemBeingPurchased is: " + this.quantityOfItemBeingPurchased);
        System.out.println("The priceForItem is: " + this.priceForItem);
    }
}
