package day9;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address_Book_System {
    public static void main(String[] args) {
        System.out.println("---   Welcome to Address Book   ---");
        System.out.println("      Enter Number 1(add) , 2(edit)      ");

        Scanner input = new Scanner(System.in);
        int getAnswer=10;

        int exit=0;
do {

    getAnswer=input.nextInt();
    switch (getAnswer) {
        case 1:
            add();
            break;
//        case 2:
//            edit();
        case 2:
            exit = 1;

    }
}while (exit!=1);

    }

    static void add(){
        AddressBook addressBook=new AddressBook();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Name :");
        String name=sc.nextLine();

        System.out.println("Enter Last Name :");
        String lastN=sc.nextLine();

        System.out.println("Enter City Name :");
        String city=sc.nextLine();

        System.out.println("Enter Number Name :");
        String number=sc.nextLine();

        System.out.println("Enter Email Name :");
        String email=sc.nextLine();

        Contact contact=new Contact(name,lastN,city,number,email);
        addressBook.addContact(contact);
        System.out.println("Contact Added Successfully...");


    }
    }

class AddressBook{
    private List<Contact> contacts;
    AddressBook(){
        contacts =new ArrayList();
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public List<Contact>getContacts(){
        return contacts;
    }
}

class Contact {
    private String name;
    private String lasttN;
    private String city;
    private String number;
    private String email;

    public Contact(String name,String lasttN,String city,String number,String email){

        this.name=name;
        this.lasttN=lasttN;
        this.city=city;
        this.number=number;
        this.email=email;

    }

    public String getName(){
        return name;
    }
    public String getLasttN(){
        return lasttN;
    }
    public String getCity(){
        return city;
    }
    public String getEumber(){
        return number;
    }
    public String getEmail(){
        return email;
    }
}