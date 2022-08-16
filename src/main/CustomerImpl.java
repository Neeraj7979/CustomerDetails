package main;

import data.Customer;

public class CustomerImpl {
    public static void main(String[] args) {
        Customer c1= new Customer("Sam","4th down street NewYork",7878765678L,"sam@gmail.com",
                true);
        Customer c2=new Customer();
        c2.display();


    }
}
