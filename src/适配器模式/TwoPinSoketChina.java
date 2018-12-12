package 适配器模式;

// 适配目标的具体实现类,--中国墙壁上的是两孔插座
public class TwoPinSoketChina implements TwoPinSoket {

    @Override
    public void chargeWithTwoPin() {
        System.out.println("中国标准的两孔插座");
    }

    @Override
    public int voltage() {
        return 220;//中国标准电压220伏
    }
}
