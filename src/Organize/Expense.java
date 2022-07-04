package Organize;

public class Expense{

    private int id;
    private String name;
    private Double amount;
    private String expiredDate;
    private String category;

    public Expense(int id, String name, Double amount, String category, String expiredDate){

        this.id = id;
        this.name = name;
        this.amount = amount;
        this.expiredDate = expiredDate;
        this.category = category;

    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void SetName(){
        this.name = name;
    }

    public Double getAmount(){
        return amount;
    }
    public void setAmount(){
        this.amount = amount;
    }

    public String getExpiredDate(){
        return expiredDate;
    }
    public void setExpiredDate(){
        this.expiredDate = expiredDate;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(){
        this.category = category;
    }
}