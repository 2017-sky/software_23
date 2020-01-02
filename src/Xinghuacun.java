
public class Xinghuacun implements Wine{
    private Integer num;
    private Integer price;

    public Xinghuacun(Integer num, Integer price) {
        this.num = num;
        this.price = price;
    }

    @Override
    public String getName() {
        return "杏花村 ";
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
