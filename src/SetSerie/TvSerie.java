package SetSerie;

import java.util.Objects;

public class TvSerie implements Comparable<TvSerie> {
    private String name;
    private String genre;
    private Integer episodeTime;

    public TvSerie(String name, String genre, Integer episodeTime) {
        this.name = name;
        this.genre = genre;
        this.episodeTime = episodeTime;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getEpisodeTime() {
        return episodeTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setEpisodeTime(Integer episodeTime) {
        this.episodeTime = episodeTime;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", episodeTime=" + episodeTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TvSerie serie = (TvSerie) o;
        return name.equals(serie.name) && genre.equals(serie.genre) && episodeTime.equals(serie.episodeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, episodeTime);
    }

    @Override
    public int compareTo(TvSerie serie) {
        int episodeTime = Integer.compare(this.getEpisodeTime(), serie.getEpisodeTime());
        if (episodeTime != 0) return episodeTime;

        return this.getGenre().compareTo(serie.getGenre());
    }
}
