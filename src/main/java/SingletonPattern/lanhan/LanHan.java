package SingletonPattern.lanhan;

public class LanHan {

    //volatile 的作用？？？
    private volatile static LanHan lanHanInstance;

    private LanHan() {
    }

    public static LanHan getLanHanInstance() {
        if (lanHanInstance == null) {
            synchronized (LanHan.class) {
                if (lanHanInstance == null) {
                    lanHanInstance = new LanHan();
                }
            }
        }
        return lanHanInstance;
    }
}
