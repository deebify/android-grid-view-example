package com.deeb.gridviewexample.DataProviderAdapter;

/**
 * Created by deeb on 11/2/16.
 */

public class Book {
    private final int name;
    private final int author;
    private final int imageRes;
    private final String imageURL;
    private boolean isFav = false;

    public Book(int name, int author, int imageResource, String imageUrl) {
        this.name = name;
        this.author = author;
        this.imageRes = imageResource;
        this.imageURL = imageUrl;
    }

    public int getName() {
        return name;
    }

    public int getAuthor() {
        return author;
    }

    public int getImageRes() {
        return imageRes;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setFav(boolean fav) {
        isFav = fav;
    }

    public String getImageURL() {
        return imageURL;
    }
}
