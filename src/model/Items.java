package model;


public class Items {
    String Item_Name;
    int Code;
    String Brand;
    int Price;

    int discount_price;

    public String getItem_Name() {
        return Item_Name;
    }

    public void setItem_Name(String item_Name) {
        Item_Name = item_Name;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(int discount_price) {
        this.discount_price = discount_price;
    }

    public Items(String item_Name, int code, String brand, int price, int discount_price) {
        Item_Name = item_Name;
        Code = code;
        Brand = brand;
        Price = price;
        this.discount_price = discount_price;
    }

    public void tshirt_format(){
        System.out.println("Item_name"+"  :"+this.Item_Name);
        System.out.println("Code"+"     :"+this.Code);
        System.out.println("Brand"+"    :"+this.Brand);
        System.out.println("Price"+"    :"+this.Price);

    }
}