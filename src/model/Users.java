package model;

import java.util.ArrayList;;


public class Users {
    ArrayList<Orders> order_list;
    String users_name;
    int user_id;
    int contact;
    String address;
    String email;

    public ArrayList<Orders> getOrder_list() {
        return order_list;
    }

    public void setOrder_list(ArrayList<Orders> order_list) {
        this.order_list = order_list;
    }

    public String getUsers_name() {
        return users_name;
    }

    public void setUsers_name(String users_name) {
        this.users_name = users_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Users(ArrayList<Orders> order_list, String users_name, int user_id, int contact, String address, String email) {
        this.order_list = order_list;
        this.users_name = users_name;
        this.user_id = user_id;
        this.contact = contact;
        this.address = address;
        this.email = email;
    }
}