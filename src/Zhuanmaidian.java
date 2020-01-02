
public class Zhuanmaidian extends Shop {
    public Zhuanmaidian(Wine wine, Integer rijunrenwue) {
        super(wine, rijunrenwue);
    }

    @Override
    public String getName(){
        return "专卖店";
    }
    @Override
    public Integer gethesuanyingshou() {
        return rijunrenwue-wine.getPrice()*wine.getNum();
    }
}
