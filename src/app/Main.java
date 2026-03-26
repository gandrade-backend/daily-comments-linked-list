package app;

import service.DoublyLinkedList;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int choice = 0;
        DoublyLinkedList List = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("---- Menu ----");
            System.out.println("1 - Add Registration");
            System.out.println("2 - Remove Registration");
            System.out.println("3 - Search for Humor");
            System.out.println("4 - Show Average Daily Grade");
            System.out.println("5 - Show Humor More Often");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    AddRegistration();
                    break;
                case 2:
                    RemoveRegistration(List);
                    break;
                case 3:
                    SearchForHumor();
                    break;
                case 4:
                    ShowAverageDailyGrade();
                    break;
                case 5:
                    ShowHumorMoreOften();
                    break;
                default:
                    break;
            }
        }while(choice != 6);
    }

    //Incomplete
    public static void AddRegistration(){

    }

    //Incomplete
    public static void RemoveRegistration(DoublyLinkedList List){
        List.printAllRegisters();
        System.out.print("Enter the ID of the registration to be removed: ");
    }

    //Incomplete
    public static void SearchForHumor(){

    }

    //Incomplete
    public static void ShowAverageDailyGrade(){

    }

    //Incomplete
    public static void ShowHumorMoreOften(){

    }
}
