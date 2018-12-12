package 适配器模式;

/**
 * adaptee的一个实现类
 */

public class ThreePinSoketAmerica  implements  ThreePinSoket{
    @Override
    public void chargeWithThreePin() {
        System.out.println("美国标准的三孔插座");
    }

    @Override
    public int voltage() {
        return 110; //美国标准110伏电压
    }
}
