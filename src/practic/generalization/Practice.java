package practic.generalization;

public class Practice {
    public static void main(String[] args) {
        Address contact = new Address("Петя", "Борисов", "Гагарина 70");
        Email contact1 = new Email("Зарина", "Жопа@маил.ру");
        Phone vlad = new Phone("Влад", "2254465");
        SocialNetworkContact socialNetworkContact = new SocialNetworkContact("Ирина", "VK", "Margo221");

        ContactBook<Contact> contactContactBook = new ContactBook<>();

        contactContactBook.addContact(contact);
        contactContactBook.addContact(contact1);
        contactContactBook.addContact(vlad);
        contactContactBook.addContact(socialNetworkContact);

        //contactContactBook.printList();

        contactContactBook.congratulate("Петя");
        contactContactBook.congratulate("Зарина");
        contactContactBook.congratulate("Артем");
        contactContactBook.congratulate("Влад");
        contactContactBook.congratulate("Володя");
        contactContactBook.congratulate("Ирина");
    }
}
