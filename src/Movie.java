public class Movie {
    private String title;
    private double rating;
    private String genRes;

    public Movie ( String liteString, double rating){
        this.title = liteString;
        this.rating = rating;
    }

    public Movie ( String liteString , double rating , String[] genRes){
        this.title = liteString;
        this.rating = rating;
        this.genRes = genRes[1-10];
    }

    public Movie ( String genRes){
        this.genRes = genRes;
    }

    public void choose (){
        System.out.println ( title + " memilih film yang telah tersedia " );
    }

    
}
