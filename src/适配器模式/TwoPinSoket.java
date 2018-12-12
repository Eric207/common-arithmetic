package 适配器模式;

/**
 * target(适配目标)--手机充电器是两个插兜,需要的是两孔插座
 */
public interface TwoPinSoket {

    public void chargeWithTwoPin();
    public int voltage();
}
