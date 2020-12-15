package com.Streams;

public class Products implements Comparable<InCart>{
    private String productid;
    private double price;
    private double rating;
    private Cateogry cateogry;

    public Products(String productid, double price, double rating, Cateogry cateogry) {
        this.productid = productid;
        this.price = price;
        this.rating = rating;
        this.cateogry = cateogry;
    }
    public String getProductid(){return productid; }
    public double getPrice(){return price;}
    public double getRating(){return rating;}
    public Cateogry getCateogry(){return cateogry;}


    @Override
    public int compareTo(InCart o) {
        return 0;
    }
}
