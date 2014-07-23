
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SomeJavaCode {
    {
    }
    
    public SomeJavaCode() {
        super();
    }
    {
    }
    public static final List defaults = java.util.Arrays.asList(new Integer[]{Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1)});
    static {
        Collections.sort(defaults, new SomeJavaCode$1());
    }
    private SomeJavaCode$Valid status = SomeJavaCode$Valid.MAYBE;
    
    public void run() {
        for (/*synthetic*/ java.util.Iterator i$ = defaults.iterator(); i$.hasNext(); ) {
            Integer i = (Integer)i$.next();
            System.out.println("entry: " + i);
        }
        switch (SomeJavaCode$2.$SwitchMap$SomeJavaCode$Valid[(this.status).ordinal()]) {
        case 1: 
            System.out.println(this.status.name());
            break;
        
        default: 
            break;
        
        }
    }
}

enum SomeJavaCode$Valid extends Enum<SomeJavaCode$Valid> {
    /*public static final*/ TRUE /* = new SomeJavaCode$Valid("TRUE", 0) */,
    /*public static final*/ FALSE /* = new SomeJavaCode$Valid("FALSE", 1) */,
    /*public static final*/ MAYBE /* = new SomeJavaCode$Valid("MAYBE", 2) */;
    /*synthetic*/ private static final SomeJavaCode$Valid[] $VALUES = new SomeJavaCode$Valid[]{SomeJavaCode$Valid.TRUE, SomeJavaCode$Valid.FALSE, SomeJavaCode$Valid.MAYBE};
    
    public static SomeJavaCode$Valid[] values() {
        return (SomeJavaCode$Valid[])$VALUES.clone();
    }
    
    public static SomeJavaCode$Valid valueOf(String name) {
        return (SomeJavaCode$Valid)Enum.valueOf(SomeJavaCode.Valid.class, name);
    }
    
    private SomeJavaCode$Valid(/*synthetic*/ String $enum$name, /*synthetic*/ int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }
}

class SomeJavaCode$1 implements Comparator {
    
    SomeJavaCode$1() {
        super();
    }
    
    @Override()
    public int compare(final Integer first, final Integer second) {
        return first.intValue() % 2 - second.intValue() % 2;
    }
    
    @Override()
    /*synthetic*/ public int compare(/*synthetic*/ final Object first, /*synthetic*/ final Object second) {
        return this.compare((Integer)first, (Integer)second);
    }
}

/*synthetic*/ class SomeJavaCode$2 {
    /*synthetic*/ static final int[] $SwitchMap$SomeJavaCode$Valid = new int[SomeJavaCode.Valid.values().length];
    static {
        try {
            SomeJavaCode$2.$SwitchMap$SomeJavaCode$Valid[SomeJavaCode.Valid.FALSE.ordinal()] = 1;
        } catch (NoSuchFieldError ex) {
        }
    }
}

