public class MovieDTO {
    private String title;
    private String major;
    private int runningTime;
    private double rating;
    private int genre;

    public MovieDTO(String title, String major, int runningTime, double rating, int genre) {
        this.title = title;
        this.major = major;
        this.runningTime = runningTime;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "영화 제목 : " + title + ", 주연 : " + major + ", 러닝타임 : " + runningTime + ", 평점 : " + rating + ", 장르 : " + genre;
    }
}
