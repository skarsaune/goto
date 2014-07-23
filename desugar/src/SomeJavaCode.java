
import static java.util.Arrays.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class SomeJavaCode implements Runnable {
    
    public SomeJavaCode() {
        super();
    }
    
    enum Valid {
        /*public static final*/ TRUE /*enum*/ ,
        /*public static final*/ FALSE /*enum*/ ,
        /*public static final*/ MAYBE /*enum*/ ;
        
        private Valid() {
            super();
        }
    }
    public static final List defaults = asList(3, 2, 1);
    static {
        Collections.sort(defaults, new Comparator(){
            
            () {
                super();
            }
            
            @Override()
            public int compare(final Integer first, final Integer second) {
                return first % 2 - second % 2;
            }
            
            @Override()
            /*synthetic*/ public int compare(/*synthetic*/ final Object first, /*synthetic*/ final Object second) {
                return this.compare((Integer)first, (Integer)second);
            }
        });
    }
    private Collection actuals = new TreeSet(java.lang.invoke.LambdaMetafactory.metafactory());
    private Valid status = Valid.MAYBE;
    
    public static void main(String... args) {
        new SomeJavaCode().run();
    }
    
    @Override()
    public void run() {
        for (Integer i : defaults) actuals.add(i);
        System.out.println("Hello world " + actuals);
        switch (this.status) {
        case FALSE: 
            System.out.println(this.status);
            break;
        
        default: 
            break;
        
        }
    }
    
    /*synthetic*/ private static int lambda$new$0(final Integer first, final Integer second) {
        return first - second;
    }
}
