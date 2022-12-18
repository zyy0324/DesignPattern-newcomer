package SingletonPattern.ehan;

public class Ehan {
    private Ehan() {}

    private static Ehan ehanInstance = new Ehan();

    public static Ehan getInstance()
    {
        return ehanInstance;
    }
}
