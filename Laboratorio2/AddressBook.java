import java.io.*;
import java.util.HashMap;

public class AddressBook {
    private HashMap<String, Contact> contacts;
    private final String FILE_PATH = "contacts.ser"; // Archivo para almacenar los contactos

    public AddressBook() {
        this.contacts = new HashMap<>();
        loadContacts(); // Cargar contactos al iniciar la aplicación
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getEmail())) {
            System.out.println("A contact with this email already exists.");
        } else {
            contacts.put(contact.getEmail(), contact);
            System.out.println("Contact added successfully.");
            storeContacts(); // Guardar cambios después de agregar un contacto
        }
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("The address book is empty.");
        } else {
            for (Contact contact : contacts.values()) {
                System.out.println(contact.getName() + " - " + contact.getEmail() + " - " + contact.getAge() + " - " + contact.getPhone());
            }
        }
    }

    public void searchContact(String email) {
        if (contacts.containsKey(email)) {
            Contact contact = contacts.get(email);
            System.out.println(contact.getName() + " - " + contact.getEmail() + " - " + contact.getAge() + " - " + contact.getPhone());
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String email) {
        if (contacts.containsKey(email)) {
            contacts.remove(email);
            System.out.println("Contact deleted.");
            storeContacts(); // Guardar los cambios después de eliminar un contacto
        } else {
            System.out.println("No contact found with the provided email.");
        }
    }

    private void storeContacts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(contacts);
            System.out.println("Contacts saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void loadContacts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            contacts = (HashMap<String, Contact>) ois.readObject();
            System.out.println("Contacts loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("No previous contacts found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading contacts: " + e.getMessage());
        }
    }
}
