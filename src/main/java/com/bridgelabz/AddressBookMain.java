package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class AddressBookMain {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(AddressBookMain.class.getName());
        log.info("****Welcome to the day 27 Address Book Problem***");

        ArrayList<Contacts> addPerson = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        AddressBookDict address = new AddressBookDict();
        ContactPerson contactPerson = new ContactPerson(addPerson);
        boolean flag = true;
        int ch1 = obj.nextInt();
        if (ch1 == 1) {
            contactPerson.createAddressBook(address);
            flag = true;
        }
        if (ch1 == 2) {
            contactPerson.createConatct(address);
            flag = true;
        }
        if (ch1 == 3) {
            contactPerson.viewAllContacts(address);
            flag = true;
        }
        if (ch1 == 4) {
            contactPerson.modify(address);
            flag = true;
        }
        if (ch1 == 5) {
            contactPerson.remove(address);
            flag = true;
        }
        if (ch1 == 6) {
            contactPerson.getPersonByCityNameStateName(address);
            flag = true;
        }
        if (ch1 == 7) {
            contactPerson.getCountByCityByState(address);
            flag = true;
        }
        if (ch1 == 8) {
            contactPerson.sortByName(address);
            flag = true;
        }
        if (ch1 == 9) {
            contactPerson.sortByCityStateOrZip(address);
            flag = true;
        }
        if (ch1 == 10) {
            address.viewAddressBook();
            flag = true;
        }
        if (ch1 == 11) {
            address.searchAddressBookByCity();
            flag = true;
        }
        if (ch1 == 12) {
            address.searchAddressBookByState();
            flag = true;
        }
        if (ch1 == 0) {
            flag = false;
        }
        while (flag != false) ;
        obj.close();
    }
}

