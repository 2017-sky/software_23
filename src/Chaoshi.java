
public class Chaoshi extends Shop{
    public Chaoshi(Wine wine, Integer rijunrenwue) {
        super(wine, rijunrenwue);
    }

    @Override
    public String getName(){
        return "超市 ";
    }
    @Override
    public Integer gethesuanyingshou() {
        return rijunrenwue-wine.getPrice()*wine.getNum();
    }
}
