package ir.akhbar;

/**
 * Created by ParsService on 1/15/2020.
 */

public class NewsData {
    private String title;
    private String description;
    private String Img;

    public NewsData(String title,String description,String img){
        this.title=title;
        this.Img=img;
        this.description=description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImg() {
        return Img;
    }



}
