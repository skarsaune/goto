
public class LambdaExample {
    
    public LambdaExample() {
        super();
    }
    private int c = 3;
    
    public Comparator bridgeLambda() {
        return java.lang.invoke.LambdaMetafactory.metafactory();
    }
    
    public Runnable withInstanceAndLocalCapture() {
        int a = 1;
        int b = 2;
        return java.lang.invoke.LambdaMetafactory.metafactory(this, a, b);
    }
    
    /*synthetic*/ private void lambda$withInstanceAndLocalCapture$1(/*synthetic*/ final int cap$0, /*synthetic*/ final int cap$1) {
        System.out.println("Captured a = " + cap$0 + " and b = " + cap$1 + " and c = " + c);
    }
    
    /*synthetic*/ private static int lambda$bridgeLambda$0(final String a, final String b) {
        return a.compareTo(b);
    }
}