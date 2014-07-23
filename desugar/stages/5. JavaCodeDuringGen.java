import static java.util.Arrays.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class SomeJavaCode implements java.lang.Runnable {

     
    public static final java.util.List defaults;

    public <init>() {
        super();
        actuals = new java.util.TreeSet(java.lang.invoke.LambdaMetafactory.metafactory());
    }
     
    static void <clinit>() {
        defaults = java.util.Arrays.asList(new java.lang.Integer[]{java.lang.Integer.valueOf(3), java.lang.Integer.valueOf(2), java.lang.Integer.valueOf(1)});
        static {
            Collections.sort(defaults, new SomeJavaCode$1());
        }
    }
    private java.util.Collection actuals;

    public static void main(java.lang.String[] args) {
        new SomeJavaCode().run();
    }
    
    @Override()
    public void run() {
        for (/*synthetic*/ java.util.Iterator i$ = defaults.iterator(); i$.hasNext(); ) {
            java.lang.Integer i = (java.lang.Integer)i$.next();
            actuals.add(i);
        }
        java.lang.System.out.println(new java.lang.StringBuilder().append("Hello world ").append(actuals).toString());
    }
    
    /*synthetic*/ private static int lambda$new$0(final java.lang.Integer first, final java.lang.Integer second) {
        return first.intValue() - second.intValue();
    }
}


class SomeJavaCode$1 implements java.util.Comparator {
    
    <init>() {
        super();
    }
    
    @Override()
    public int compare(final java.lang.Integer first, final java.lang.Integer second) {
        return first.intValue() % 2 - second.intValue() % 2;
    }
    
    @Override()
    /*synthetic*/ public int compare(/*synthetic*/ final Object first, /*synthetic*/ final Object second) {
        return this.compare((java.lang.Integer)first, (java.lang.Integer)second);
    }
}