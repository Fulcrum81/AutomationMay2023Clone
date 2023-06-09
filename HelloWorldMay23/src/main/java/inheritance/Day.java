package inheritance;

public enum Day {
    MONDAY(1, "Gloomy monday"),
    TUESDAY(2, "Ruby tuesday"),
    WEDNESDAY(3, "Simply wednesday"),
    THURSDAY(4, "Thr"),
    FRIDAY(5, "Yay! Friday!"),
    SATURDAY(6, "Yay! Saturday!"),
    SUNDAY(7, "Tomorrow's monday :(");

    int dayNr;
    String sentence;

    Day(int dayNr, String sentence) {
        this.dayNr = dayNr;
        this.sentence = sentence;
    }

    public int getDayNr() {
        return dayNr;
    }

    public String getSentence() {
        return sentence;
    }
}
