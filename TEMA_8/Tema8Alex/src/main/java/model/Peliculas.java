package model;

import java.io.Serializable;

public class Peliculas implements Serializable {

    private String title, release_date, poster_path;

    public Peliculas() {}

    public Peliculas(String title, String release_date, String poster_path) {
        this.title = title;
        this.release_date = release_date;
        this.poster_path = poster_path;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "title='" + title + '\'' +
                ", release_date='" + release_date + '\'' +
                ", poster_path='" + poster_path + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }
}
