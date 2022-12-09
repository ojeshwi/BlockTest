import model.Items;
import model.Orders;
import model.Users;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
                Items item1=new Items("jacket",4444,"M&S",3999,200);
                Items item2=new Items("tshirt",4448,"Gucci",9999,600);
                Items item3=new Items("shirt",8444,"Luis Vinton",4899,0);
                Items item4=new Items("tshirt",4467,"Kate",5999,809);
                Items item5=new Items("tshirt",4456,"Luis ",7999,401);

                ArrayList<Items> item_list=new ArrayList<>();
                item_list.add(item1);
                item_list.add(item2);
                item_list.add(item3);
                item_list.add(item4);
                item_list.add(item5);
                System.out.println(item_list);


                ArrayList<Orders> order_list=new ArrayList<>();
                Orders order1=new Orders(item_list,"Jacket",567,809,700,700);
                Orders order2=new Orders(item_list,"T_shirt",569,800,700,800);
                order_list.add(order1);
                order_list.add(order2);

                Users user1=new Users(order_list,"Ram",12,4144236,"Boudha","ram@gmail.com");
                Users user2=new Users(order_list,"Sita",13,4567893,"Kapan","sita@gmail.com");

                item1.tshirt_format();
        }
}