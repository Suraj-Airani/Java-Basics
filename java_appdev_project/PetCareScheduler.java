package java_appdev_project;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class PetCareScheduler {
    private Map<String, Pet> pets;

    public PetCareScheduler() {
        pets = new HashMap<>();
        loadData();
    }

    // Private: Load pets from file
    private void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pets.dat"))) {
            pets = (Map<String, Pet>) ois.readObject();
        } catch (Exception e) {
            pets = new HashMap<>();
        }
    }

    // Save pets to file
    private void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pets.dat"))) {
            oos.writeObject(pets);
        } catch (Exception e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Register pet
    public boolean registerPet(String petId, String name, String species, int age, String ownerName, String contactInfo, LocalDate registrationDate) {
        if (pets.containsKey(petId)) return false; // Duplicate check
        Pet pet = new Pet(petId, name, species, age, ownerName, contactInfo, registrationDate);
        pets.put(petId, pet);
        saveData();
        return true;
    }

    // Schedule appointment for a pet
    public boolean scheduleAppointment(String petId, String type, LocalDateTime dateTime, String notes) {
        Pet pet = pets.get(petId);
        if (pet == null) return false;
        Appointment appt = new Appointment(type, dateTime, notes);
        pet.addAppointment(appt);
        saveData();
        return true;
    }

    // Display all pets
    public void displayAllPets() {
        for (Pet pet : pets.values()) {
            System.out.println(pet.getPetId() + ": " + pet.getName());
        }
    }

    // Display appointments for a pet
    public void displayAppointments(String petId) {
        Pet pet = pets.get(petId);
        if (pet == null) {
            System.out.println("Pet not found.");
            return;
        }
        for (Appointment ap : pet.getAppointments()) {
            System.out.println(ap.getType() + " at " + ap.getDateTime() + " Notes: " + ap.getNotes());
        }
    }

    // Display upcoming appointments for all pets
    public void displayUpcomingAppointments() {
        LocalDateTime now = LocalDateTime.now();
        for (Pet pet : pets.values()) {
            for (Appointment ap : pet.getAppointments()) {
                if (ap.getDateTime().isAfter(now)) {
                    System.out.println(pet.getName() + " has " + ap.getType() + " on " + ap.getDateTime());
                }
            }
        }
    }

    // Display past appointment history for each pet
    public void displayPastAppointments(String petId) {
        Pet pet = pets.get(petId);
        if (pet == null) return;
        LocalDateTime now = LocalDateTime.now();
        for (Appointment ap : pet.getAppointments()) {
            if (ap.getDateTime().isBefore(now)) {
                System.out.println(ap.getType() + " at " + ap.getDateTime());
            }
        }
    }

    // Generate upcoming appointments report
    public void reportUpcomingWeek() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nextWeek = now.plusWeeks(1);
        for (Pet pet : pets.values()) {
            for (Appointment ap : pet.getAppointments()) {
                if (ap.getDateTime().isAfter(now) && ap.getDateTime().isBefore(nextWeek)) {
                    System.out.println(pet.getName() + " | " + ap.getType() + " on " + ap.getDateTime());
                }
            }
        }
    }

    // Generate overdue vet appointments report
    public void reportOverdueVetVisits() {
        LocalDateTime now = LocalDateTime.now();
        for (Pet pet : pets.values()) {
            Optional<Appointment> lastVet = pet.getAppointments().stream()
                .filter(a -> a.getType().equalsIgnoreCase("vet visit"))
                .max((a1, a2) -> a1.getDateTime().compareTo(a2.getDateTime()));
            if (lastVet.isEmpty() || lastVet.get().getDateTime().isBefore(now.minusMonths(6))) {
                System.out.println(pet.getName() + " is overdue for a vet visit.");
            }
        }
    }

    // Main menu and input handling
    public void run() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Register Pet\n2. Schedule Appointment\n3. Display All Pets\n4. Display Pet Appointments\n5. Upcoming Appointments\n6. Past Appointments\n7. Report Upcoming Week\n8. Report Overdue Vet Visits\n9. Exit");
            int choice = in.nextInt();
            in.nextLine();

            if (choice == 1) {
                System.out.print("Pet ID: ");
                String id = in.nextLine();
                System.out.print("Name: ");
                String name = in.nextLine();
                System.out.print("Species/Breed: ");
                String species = in.nextLine();
                System.out.print("Age: ");
                int age = in.nextInt();
                in.nextLine();
                System.out.print("Owner Name: ");
                String owner = in.nextLine();
                System.out.print("Contact: ");
                String contact = in.nextLine();
                System.out.print("Registration Date (yyyy-mm-dd): ");
                LocalDate regDate = LocalDate.parse(in.nextLine());
                if (registerPet(id, name, species, age, owner, contact, regDate)) {
                    System.out.println("Pet registered.");
                } else {
                    System.out.println("Pet ID already exists!");
                }
            } else if (choice == 2) {
                System.out.print("Enter Pet ID: ");
                String id = in.nextLine();
                System.out.print("Appointment Type: ");
                String type = in.nextLine();
                System.out.print("Date & Time (yyyy-mm-ddTHH:mm): ");
                LocalDateTime dt = LocalDateTime.parse(in.nextLine());
                System.out.print("Notes: ");
                String notes = in.nextLine();
                if (scheduleAppointment(id, type, dt, notes)) {
                    System.out.println("Appointment scheduled.");
                } else {
                    System.out.println("Pet not found!");
                }
            } else if (choice == 3) {
                displayAllPets();
            } else if (choice == 4) {
                System.out.print("Pet ID: ");
                String id = in.nextLine();
                displayAppointments(id);
            } else if (choice == 5) {
                displayUpcomingAppointments();
            } else if (choice == 6) {
                System.out.print("Pet ID: ");
                String id = in.nextLine();
                displayPastAppointments(id);
            } else if (choice == 7) {
                reportUpcomingWeek();
            } else if (choice == 8) {
                reportOverdueVetVisits();
            } else if (choice == 9) {
                break;
            }
        }
        in.close();
    }

    public static void main(String[] args) {
        new PetCareScheduler().run();
    }
}
