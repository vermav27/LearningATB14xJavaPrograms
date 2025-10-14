package ex_23_Exception;

public class Lab188_Bank_Class {

    private String currency;
    private Integer amount;

    public Lab188_Bank_Class(String currency_c, Integer amount_c) {
        this.currency = currency_c;
        this.amount = amount_c;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Lab188_Bank_Class bankName){

        if(!bankName.currency.equalsIgnoreCase("INR")){
            try {
                throw new Exception("Currency Mismatch, Can't Proceed");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                return 0;
            }
        }else{

            return bankName.amount + this.amount;

        }
    }
}
