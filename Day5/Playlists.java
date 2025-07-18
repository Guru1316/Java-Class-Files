public class Playlists {
    String name;
    Integer numberOfSongs;
    
    public Playlists(String name, Integer numberOfSongs) {
        this.name = name;
        this.numberOfSongs = numberOfSongs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(Integer numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    @Override
    public String toString() {
       return "Playlist Name: "+name+", Number of songs: "+numberOfSongs;
    }
    
}
