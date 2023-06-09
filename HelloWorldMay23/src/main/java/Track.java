public class Track {
    private String artistName;
    private String name;
    private int length;
    private String lyrics;

    public Track(String artistName, String name, int length, String lyrics) {
        this.artistName = artistName;
        this.name = name;
        this.length = length;
        this.lyrics = lyrics;
    }


    public String getArtistName() {
        return artistName;
    }

    public static int staticField;

    public static String getNecessaryPropertiesOfAnAlbum() {
        return "Artist name, ... blablabla";
    }


}
