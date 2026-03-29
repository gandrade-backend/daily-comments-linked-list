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
            System.out.println("---- Menu ----");
            System.out.println("1 - Add Registration");
            System.out.println("2 - Remove Registration");
            System.out.println("3 - Print All Registrations");
            System.out.println("4 - Search for Humor");
            System.out.println("5 - Show Average Daily Grade");
            System.out.println("6 - Show Humor More Often");
            System.out.println("7 - Show Motives For Humor");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    addRegistration(list);
                    break;
                case 2:
                    removeRegistration(list);
                    break;
                case 3:
                    list.printAllRegisters();
                    break;
                case 4:
                    searchForHumor(list);
                    break;
                case 5:
                    showAverageDailyGrade(list);
                    break;
                case 6:
                    showHumorMoreOften(list);
                    break;
                case 7:
                    showMotivesForHumor(list);
                    break;
                default:
                    break;
            }
        }while(choice != 6);
    }

    //Testing
    public static String getAllHumors() {
        return String.join(", ",
                Arrays.stream(Humor.values())
                        .map(Enum::name)
                        .toArray(String[]::new)
        );
    }

    //Incomplete
    public static void addRegistration(DoublyLinkedList list){
        int id = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        LocalDate data = LocalDate.parse(scanner.nextLine());
        System.out.println("");
        getAllHumors();
        int idHumor = scanner.nextInt();
        Humor humor = Humor.fromInt(idHumor);
        System.out.println("");
        String comment = scanner.nextLine();
        System.out.println("");
        int note = scanner.nextInt();

        Day newDay = new Day(id, data, humor, note);
        list.addRegistration(newDay);
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

    }

    public static void showMotivesForHumor(DoublyLinkedList list){

    }
}
