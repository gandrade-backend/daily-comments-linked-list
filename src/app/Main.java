package app;

import service.LinkedList;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int choice = 0;
        LinkedList List;
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
                    RemoveRegistration();
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

    public static void AddRegistration(){

    }
    public static void RemoveRegistration(){

    }
    public static void SearchForHumor(){

    }
    public static void ShowAverageDailyGrade(){

    }
    public static void ShowHumorMoreOften(){

    }
}
