
public class Ziyingdian extends Shop{
    public Ziyingdian(Wine wine, Integer rijunrenwue) {
        super(wine, rijunrenwue);
    }

    @Override
    public String getName(){
        return "自营店";
    }
    @Override
    public Integer gethesuanyingshou() {
        return rijunrenwue-wine.getPrice()*wine.getNum();
    }
}
