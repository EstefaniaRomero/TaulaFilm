public class ArrayFilm {

    private String directorName;
    private String titleFilm;
    private String categoryFilm;

    public ArrayFilm(String directorName,String titleName,String categoryFilm) {
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
}
