public class Film {

    private String directorName;
    private String titleFilm;
    private String categoryFilm;

    public Film(String directorName, String titleName, String categoryFilm) {
        this.directorName = directorName;
        this.titleFilm = titleName;
        this.categoryFilm = categoryFilm;
    }

    public String getDirectorName() {
        return directorName;
    }

    public String getTitleFilm() {
        return titleFilm;
    }

    public String getCategoryFilm() {
        return categoryFilm;
    }

    @Override
    public String toString() {
        return "Film{" +
                "directorName='" + directorName + '\'' +
                ", titleFilm='" + titleFilm + '\'' +
                ", categoryFilm='" + categoryFilm + '\'' +
                '}';
    }
}
