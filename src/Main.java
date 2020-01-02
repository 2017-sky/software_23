
public class Main {

    public static void main(String[] args) {
//        Wine xianghuacun = new Xinghuacun(10,50);
//        Shop chaoshi = new Chaoshi(xianghuacun,1000);
//        System.out.println(chaoshi.getName()+xianghuacun.getName()+chaoshi.gethesuanyingshou());

        Wine Zhuyeqing = new Zhuyeqing(20,40);
        Shop chaoshi = new Chaoshi(Zhuyeqing,1000);
        System.out.println(chaoshi.getName()+Zhuyeqing.getName()+chaoshi.gethesuanyingshou());
    }
}
