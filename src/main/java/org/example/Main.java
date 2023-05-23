package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarCatalog catalog = new CarCatalog();
        Scanner scanner = new Scanner(System.in);

        String brand, model;
        int yearOfProduction, choice = 0;
        double price;


        do{
            System.out.println("\nMENU: ");
            System.out.println("1. Dodaj auto.");
            System.out.println("2. Wyświetl listę samochodów.");
            System.out.println("3. Wyświetl samochody z danego roku.");
            System.out.println("0. Wyjście z programu");

            System.out.print("Wybrana opcja: ");
            choice = scanner.nextInt();

            switch(choice){

                case 1:
                    scanner.nextLine();
                    System.out.print("\nPodaj markę samochodu: ");
                    brand = scanner.nextLine();

                    System.out.print("\nPodaj model samochodu: ");
                    model = scanner.nextLine();

                    System.out.print("\nPodaj rok produkcji samochodu: ");
                    yearOfProduction = scanner.nextInt();

                    System.out.print("\nPodaj cenę samochodu: ");
                    price = scanner.nextDouble();

                    Car car = new Car(brand, model, yearOfProduction, price);
                    catalog.addCar(car);

                    break;


                case 2:
                    System.out.println("\nPojazdy w katalogu: ");
                    catalog.showAllCars();

                    break;

                case 3:
                    int year;
                    System.out.print("\nPodaj, z którego roku chcesz wyświetlić auta: ");
                    year = scanner.nextInt();

                    System.out.println("\nAuta z roku " + year + ": ");
                    catalog.showCarsFromYear(year);

                    break;

                case 0:
                    System.out.println("WYJŚCIE Z PROGRAMU.");

                    break;

                default:
                    System.out.println("Nie ma takiej opcji.");

                    break;

            }

        }while(choice != 0);


        scanner.close();
    }
}
