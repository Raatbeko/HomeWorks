package product;

import product.typeOfProduct.Types;

import java.util.Objects;

public class Product {
    private String nameOfProduct;
    private Types typeOfProduct;

    public Product() {
    }

    public Product(String nameOfProduct, Types typeOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.typeOfProduct = typeOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", typeOfProduct=" + typeOfProduct +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameOfProduct, product.nameOfProduct) && typeOfProduct == product.typeOfProduct;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfProduct, typeOfProduct);
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public Types getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(Types typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }
}
