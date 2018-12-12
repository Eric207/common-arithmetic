package 适配器模式;

/**
 * 国产手机
 */
public class HUAWEI {

    TwoPinSoket twoPinSoket;

    public void setTwoPinSoket(TwoPinSoket twoPinSoket) {
        this.twoPinSoket=twoPinSoket;
    }

    public void chargeRequest() {
        System.out.println("华为手机, "+twoPinSoket.voltage()+"伏的电压充电");
    }

}


