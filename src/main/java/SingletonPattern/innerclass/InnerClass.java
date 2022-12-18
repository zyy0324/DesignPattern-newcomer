package SingletonPattern.innerclass;

public class InnerClass {

    private InnerClass () {}

    private static InnerClass innerClassInstance;

    private static class innerClassHolder
    {
        private static final InnerClass innerClassInstance = new InnerClass();
    }

    public static final InnerClass getInnerClassInstance()
    {
        return innerClassHolder.innerClassInstance;
    }

}
