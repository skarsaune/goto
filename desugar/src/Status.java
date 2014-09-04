public enum Status extends Enum<Status> {
    /*public static final*/ YES /* = new Status("YES", 0) */,
    /*public static final*/ NO /* = new Status("NO", 1) */,
    /*public static final*/ MAYBE /* = new Status("MAYBE", 2) */;
    /*synthetic*/ private static final Status[] $VALUES = new Status[]{Status.YES, Status.NO, Status.MAYBE};
    
    public static Status[] values() {
        return (Status[])$VALUES.clone();
    }
    
    public static Status valueOf(String name) {
        return (Status)Enum.valueOf(Status.class, name);
    }
    
    private Status(/*synthetic*/ String $enum$name, /*synthetic*/ int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }
}
