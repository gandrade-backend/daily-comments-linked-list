package model;

public enum Humor {
    HAPPY(1),
    SAD(2),
    ANXIOUS(3),
    TIRED(4),
    MOTIVATED(5),
    STRESSED(6),
    NEUTRAL(7);

    private final int humor;

    Humor(int humor){
        this.humor = humor;
    }

    public int getHumor(){
        return humor;
    }

    public static Humor fromInt(int humor){
        for(Humor h : Humor.values()){
            if(h.getHumor() == humor)
                return h;
        }
        throw new IllegalArgumentException("Invalid Humor: " + humor);
    }
}
