public class SomeJavaCode {
    
    enum Valid {
        /*public static final*/ TRUE /* = new Valid() */,
        /*public static final*/ FALSE /* = new Valid() */,
        /*public static final*/ MAYBE /* = new Valid() */;
    }
    public static final List<Integer> defaults = asList(3, 2, 1);
    static {
        Collections.sort(defaults, new Comparator<Integer>(){
            
            @Override()
            public int compare(final Integer first, final Integer second) {
                return first % 2 - second % 2;
            }
        });
    }
    private Valid status = Valid.MAYBE;
    
    public void run() {
        for (Integer i : defaults) System.out.println("entry: " + i);
        switch (this.status) {
        case FALSE: 
            System.out.println(this.status.name());
            break;
        
        default: 
            break;
        
        }
    }
}