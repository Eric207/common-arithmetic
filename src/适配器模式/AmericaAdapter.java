package 适配器模式;

//去美国旅游,带上一个美国适配器,实现了两孔的插座,组合三孔插座
public class AmericaAdapter implements TwoPinSoket {


    private  ThreePinSoket threePinSoket;   //组合三孔插座


    public AmericaAdapter(ThreePinSoket threePinSoket) {
        this.threePinSoket = threePinSoket;
    }

    //因为我的手机只能调用两孔插座里面的充电方法.
    //相当于我的手机找到适配器里面的两孔插座方法,
    //而两孔插座的方法去调用了三孔插座的方法
    @Override
    public void chargeWithTwoPin() {
        threePinSoket.chargeWithThreePin();
    }

    //相当于升压
    @Override
    public int voltage() {
        return threePinSoket.voltage()*2;
    }
}
