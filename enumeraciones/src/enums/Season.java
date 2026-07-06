package enums;

public enum Season {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;

    public static int totalSeasons(){
        return values().length;
    }
}
