package 适配器模式;

/**
 * 测试类
 */

public class Main {
    public static void main(String[] args) {
        //中国,直接使用两孔插座
        TwoPinSoketChina twoPinSoketChina = new TwoPinSoketChina();
        HUAWEI myphone = new HUAWEI();
        myphone.setTwoPinSoket(twoPinSoketChina);
        myphone.chargeRequest();

        //到达美国,美国拥有的是三孔插座
        ThreePinSoketAmerica threePinSoketAmerica = new ThreePinSoketAmerica();
        testThreePin(threePinSoketAmerica);

        //有配过适配器,一头接入了三孔插座,一头接转换两孔插座
        AmericaAdapter americaAdapter = new AmericaAdapter(threePinSoketAmerica);
        testTwoPin(americaAdapter);

        myphone.setTwoPinSoket(americaAdapter);
        myphone.chargeRequest();

    }

    private static void testTwoPin(TwoPinSoket twoPinSoket) {
        twoPinSoket.chargeWithTwoPin();
        System.out.println("电压是" + twoPinSoket.voltage() + "伏特\n");
    }

    private static void testThreePin(ThreePinSoket threePinSoket) {
        threePinSoket.chargeWithThreePin();
        System.out.println("电压是" + threePinSoket.voltage() + "伏特");
    }
}
