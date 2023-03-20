import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int num;
        char choice = 'y';
        while (choice == 'y') {
            System.out.println("Press: \n 1 for Adding Contact \n 2 for Displaying Contact\n 3 for Editing Contact \n 4 for Deleting Contact");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    addressBook.addcontact();
                    break;

                case 2:
                    addressBook.print();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;

            }
            System.out.println("Press 'y' to continue else press 'n'");
            choice = sc.next().charAt(0);
        }

        //addressBook.createContact();
    }
}
