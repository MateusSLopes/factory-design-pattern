package entities;

public abstract class Account {
    private Integer number;
    private User holder;
    private Double amount;

    abstract double getTax();

    public Account() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public User getHolder() {
        return holder;
    }

    public void setHolder(User holder) {
        this.holder = holder;
    }

    public Double getAmount() {
        return amount;
    }

}
