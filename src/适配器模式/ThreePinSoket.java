package 适配器模式;

/**
 * adaptee(被适配者) -美国的三孔插口
 */
public interface ThreePinSoket {

    public void chargeWithThreePin();
    public int voltage();
}
