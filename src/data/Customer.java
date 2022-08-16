package data;

public class Customer {
    private  String name;
    private  String address;
    private long mobileNumber;
    private String eMail;
    private boolean premiumMembership;
    Customer(){
        String name;
        String address;
        long mobileNumber;
        String eMail;
        boolean premiumMembership;
    }
    Customer(String name,String address,long mobileNumber,String eMail,boolean premiumMembership){
        this.name=name;
        this.address=address;
        this.mobileNumber=mobileNumber;
        this.eMail=eMail;
        this.premiumMembership=premiumMembership;
    }


}
