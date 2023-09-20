package org.simplilearn.models;

public class ProductModel {

    private String shoe;
    private int price;
    private String imageUrl;
    private Long category_cid; 

    public ProductModel() {
        
    }

    public ProductModel(String shoe, int price, String imageUrl, Long category_cid) {
        this.shoe = shoe;
        this.price = price;
        this.imageUrl = imageUrl;
        this.category_cid = category_cid; 
    }

    public String getShoe() {
        return shoe;
    }

    public void setShoe(String shoe) {
        this.shoe = shoe;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getCategory_cid() {
        return category_cid;
    }

    public void setCategory_cid(Long category_cid) {
        this.category_cid = category_cid;
    }
}
