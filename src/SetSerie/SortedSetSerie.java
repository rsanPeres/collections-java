package SetSerie;

import SetSerie.SerieComparator.ComparatorNameGenreEpisodeTime;

import java.util.Set;
import java.util.TreeSet;

public class SortedSetSerie {
    private Set<TvSerie> series;

    public SortedSetSerie(Set<TvSerie> series) {
        this.series = series;
    }

    public Set<TvSerie> getAll() {
        return series;
    }

    public void add(TvSerie serie){
        this.series.add(serie);
    }

    public void remove(TvSerie serie){
        this.series.remove(serie);
    }

    public void printAll(){
        for(TvSerie serie : series){
            System.out.println("Print All: " + serie.getName() + " - "
            + serie.getGenre() + " - " + serie.getEpisodeTime());
        }
    }

    public void printByEpisodeTime(){
        TreeSet<TvSerie> mySeries = new TreeSet<>(series);
        for(TvSerie serie : mySeries){
            System.out.println("Print by Episode" + serie.getName() + " - "
                    + serie.getGenre() + " - " + serie.getEpisodeTime());
        }
    }

    public void printComparator(){
        TreeSet<TvSerie> mySeries = new TreeSet<>(new ComparatorNameGenreEpisodeTime());
        mySeries.addAll(series);
        for(TvSerie serie : mySeries){
            System.out.println("Print by comparator" + serie.getName() + " - "
                    + serie.getGenre() + " - " + serie.getEpisodeTime());
        }
    }
}
