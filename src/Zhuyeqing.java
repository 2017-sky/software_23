
public class Zhuyeqing implements Wine{
    private Integer num;
    private Integer price;

    public Zhuyeqing(Integer num, Integer price) {
        this.num = num;
        this.price = price;
    }

    @Override
    public String getName() {
        return "竹叶青 ";
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
