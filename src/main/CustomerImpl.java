package main;

import data.Customer;

public class CustomerImpl {
    public static void main(String[] args) {
        Customer c1= new Customer("Sam","4th down street NewYork",7878765678L,"sam@gmail.com",
                true);
        Customer c2=new Customer();
        System.out.println("\nResult before Swapping values of c1 and c2");
        c1.display();
        c2.display();
        Customer temp=c1;
        c1=c2;
        c2=temp;
        System.out.println("\nResult after Swapping values of c1 and c2");
        c1.display();
        c2.display();






    }
}
