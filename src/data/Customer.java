package data;

public class Customer {
    private  String name;
    private  String address;
    private long mobileNumber;
    private String eMail;
    private boolean premiumMembership;
    public Customer(){
         name="";
        address="";
        mobileNumber=0;
        eMail="";
        premiumMembership=false;
    }
    public Customer(String name,String address,long mobileNumber,String eMail,boolean premiumMembership){
        this.name=name;
        this.address=address;
        this.mobileNumber=mobileNumber;
        this.eMail=eMail;
        this.premiumMembership=premiumMembership;
    }

    public void display(){
        System.out.println(" customer name = " + name);
        System.out.println("address = " + address);
        System.out.println("mobileNumber = " + mobileNumber);
        System.out.println("eMail = " + eMail);
        System.out.println("Is premium Member = " + premiumMembership);
    }


}
