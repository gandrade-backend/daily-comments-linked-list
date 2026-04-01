package app;

import model.Day;
import model.Humor;
import service.DoublyLinkedList;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

//simple commit

public class Main{
    public static void main(String[] args){
        int choice = 0;
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("------------- Menu -------------");
            System.out.println("1 - Add Registration");
            System.out.println("2 - Add Comments to Registration");
            System.out.println("3 - Remove Registration");
            System.out.println("4 - Print All Registrations");
            System.out.println("5 - Search for Humor");
            System.out.println("6 - Show Average Daily Grade");
            System.out.println("7 - Show Humor More Often");
            System.out.println("8 - Show Motives For Humor");
            System.out.println("9 - Clean Registrations");
            System.out.println("--------------------------------");
            System.out.print("Insert the Choise: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    addRegistration(list);
                    break;
                case 2:
                    addCommentsToRegistration(list);
                    break;
                case 3:
                    removeRegistration(list);
                    break;
                case 4:
                    list.printAllRegisters();
                    break;
                case 5:
                    searchForHumor(list);
                    break;
                case 6:
                    showAverageDailyGrade(list);
                    break;
                case 7:
                    showHumorMoreOften(list);
                    break;
                case 8:
                    showMotivesForHumor(list);
                    break;
                case 9:
                    list.cleanRegistry();
                default:
                    break;
            }
        }while(choice != 6);
    }

    //Testing
    public static String getAllHumors() {
        return "\n" +
                String.join(", ",
                Arrays.stream(Humor.values())
                        .map(Enum::name)
                        .toArray(String[]::new)
        );
    }

    //Incomplete
    public static void addRegistration(DoublyLinkedList list){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the Date");
        LocalDate data = LocalDate.parse(scanner.nextLine());
        System.out.println(getAllHumors());
        System.out.print("Chose the Humor: ");
        int idHumor = scanner.nextInt();
        Humor humor = Humor.fromInt(idHumor);
        System.out.println("\nInsert the Comment: ");
        String comment = scanner.nextLine();
        System.out.print("\nInsert the Note: ");
        int note = scanner.nextInt();
        //
        Day newDay = new Day(list.getCountId(), data, humor, note);
        list.addRegistration(newDay);
    }

    public static void addCommentsToRegistration(DoublyLinkedList list){

    }

    //Incomplete
    public static void removeRegistration(DoublyLinkedList list){
        Scanner scanner = new Scanner(System.in);
        list.printAllRegisters();
        System.out.print("Enter the ID of the registration to be removed: ");
        int id = scanner.nextInt();
        list.removeById(id);
    }

    //Incomplete
    public static void searchForHumor(DoublyLinkedList list){
        Scanner scanner = new Scanner(System.in);
        getAllHumors();
        System.out.println("");
        int idHumor = scanner.nextInt();
        Humor humor = Humor.fromInt(idHumor);
        list.searchForHumor(humor);
    }

    //Incomplete
    public static void showAverageDailyGrade(DoublyLinkedList list){
        double total = list.averageOfTheDay();
        System.out.println("The Average Daily Grade: " + total);
    }

    //Incomplete
    public static void showHumorMoreOften(DoublyLinkedList list){
        System.out.println("");
    }

    public static void showMotivesForHumor(DoublyLinkedList list){

    }
}
