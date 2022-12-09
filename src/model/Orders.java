package model;

import java.util.ArrayList;

public class Orders {
    ArrayList<Items> item_list;
    String product_name;
    int order_id;
    int order_rate;
    int rate;
    int delivery_charge;

    public ArrayList<Items> getItem_list() {
        return item_list;
    }

    public void setItem_list(ArrayList<Items> item_list) {
        this.item_list = item_list;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_rate() {
        return order_rate;
    }

    public void setOrder_rate(int order_rate) {
        this.order_rate = order_rate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getDelivery_charge() {
        return delivery_charge;
    }

    public void setDelivery_charge(int delivery_charge) {
        this.delivery_charge = delivery_charge;
    }

    public Orders(ArrayList<Items> item_list, String product_name, int order_id, int order_rate, int rate, int delivery_charge) {
        this.item_list = item_list;
        this.product_name = product_name;
        this.order_id = order_id;
        this.order_rate = order_rate;
        this.rate = rate;
        this.delivery_charge = delivery_charge;
    }
}