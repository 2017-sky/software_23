

public class Fenjiu implements Wine{
    private Integer num;
    private Integer price;

    public Fenjiu(Integer num, Integer price) {
        this.num = num;
        this.price = price;
    }

    @Override
    public String getName() {
        return "汾酒 ";
    }

    @Override
    public Integer getNum() {
        return this.num;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }
}
