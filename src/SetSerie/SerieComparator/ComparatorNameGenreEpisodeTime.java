package SetSerie.SerieComparator;

import SetSerie.TvSerie;

import java.util.Comparator;

public class ComparatorNameGenreEpisodeTime implements Comparator<TvSerie> {
    @Override
    public int compare(TvSerie serie1, TvSerie serie2) {
        int name = serie1.getName().compareTo(serie2.getName());
        if (name != 0) return name;

        int genre = serie1.getGenre().compareTo(serie2.getGenre());
        if (genre != 0) return genre;

        return Integer.compare(serie1.getEpisodeTime(), serie2.getEpisodeTime());
    }
}
