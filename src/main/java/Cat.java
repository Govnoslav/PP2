import org.springframework.stereotype.Component;


public class Cat {
    private int number;

    public Cat(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
