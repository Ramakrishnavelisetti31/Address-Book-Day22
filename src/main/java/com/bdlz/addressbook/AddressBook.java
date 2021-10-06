package com.bdlz.addressbook;

public class AddressBook {
    private class Contact {
         String firstName, lastName, address, city, state, emailId;
         int zipCode;
         long mobileNumber;
    }
    public void printContact() {
        Contact person = new Contact();
        person.firstName = "Ramakrishna";
        person.lastName = "Velisetti";
        person.address = "Sitaramapuram-A";
        person.city = "Vijayawada";
        person.state = "Andhra Pradesh";
        person.zipCode = 521109;
        person.mobileNumber = 1234567891L;
        person.emailId = "ramakrishna96.velisetti@gmail.com";
        System.out.println("Contact Details");
        System.out.println("Name         : "  + person.firstName + " " + person.lastName + "\n"
                         + "Address      : "  + person.address + "\n"
                         + "City         : "  + person.city + "\n"
                         + "State        : "  + person.state + "\n"
                         + "ZipCode      : "  + person.zipCode + "\n"
                         + "MobileNumber : "  + person.mobileNumber + "\n"
                         + "EmailId      : "  + person.emailId + "\n" );
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.printContact();
    }
}
