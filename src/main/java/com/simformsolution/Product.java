package com.simformsolution;

public class Product {

  int productId;
  String productName;

  float productPrice;
  int ProductQuantity;

  public Product(int productId, String productName, float productPrice, int productQuantity) {
    this.productId = productId;
    this.productName = productName;
    this.productPrice = productPrice;
    ProductQuantity = productQuantity;
  }

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public float getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(float productPrice) {
    this.productPrice = productPrice;
  }

  public int getProductQuantity() {
    return ProductQuantity;
  }

  public void setProductQuantity(int productQuantity) {
    ProductQuantity = productQuantity;
  }

  @Override
  public String toString() {
    return "Product{" +
            "productId=" + productId +
            ", productName='" + productName + '\'' +
            ", productPrice=" + productPrice +
            ", ProductQuantity=" + ProductQuantity +
            '}';
  }
}
