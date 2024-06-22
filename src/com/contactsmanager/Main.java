package com.contactsmanager;

public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        // Ajouter des contacts
        Contact contact1 = new Contact("Alice", "0708070408");
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact("Bob", "0502010408");
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact("Charlie", "0709020304");
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact("David", "0104070809");
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact("Eve", "0001020304");
        myContactsManager.addContact(contact5);

        // Rechercher un contact
        Contact result = myContactsManager.searchContact("Charlie");
        if (result != null) {
            System.out.println("Le numéro de téléphone de Charlie est: " + result.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}
