package ru.books.shop.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    @Column(name = "new_product")
    private Boolean newProduct;

    @Column(name = "hot_product")
    private Boolean hotProduct;

    private Double price;

    @Column(name = "old_price")
    private Double oldPrice;

    private String image;

    @Column(length = 65535)
    @Type(type = "text")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_type_id")
    private ProductType productType;

    public Product() {
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Boolean getNewProduct() {
        return newProduct;
    }

    public Boolean getHotProduct() {
        return hotProduct;
    }

    public Double getPrice() {
        return price;
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNewProduct(Boolean newProduct) {
        this.newProduct = newProduct;
    }

    public void setHotProduct(Boolean hotProduct) {
        this.hotProduct = hotProduct;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
