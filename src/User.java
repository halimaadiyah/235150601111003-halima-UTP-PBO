public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private String ticketLists;
    private String maxTicket;


    public  User ( String  email , String password , String fullName , double balance , String ticketLists , String maxTicket ) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
        this.ticketLists = ticketLists;
        this.maxTicket = maxTicket;
    }

    public User () {
        System.out.println("Email : " + email);
        System.out.println("password : " + password);
        System.out.println("fullName : + namaLengkap");
        System.out.println("balance : + balance");
        System.out.println("ticketLists : + ticketLists");
        System.out.println("maxTicket : + maxTicket");
    }

    public void display (){
        
    }


}
