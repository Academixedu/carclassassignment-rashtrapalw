package com.example;

public class Main {
    public static void main(String[] args) {
        

        // Create a new car object
        Car myCar = new Car("Toyota", "Camry", 2020, "Red", 24000.00);

        // Display car details
        myCar.displayCarDetails();

        // Modify car details
        myCar.setColor("Blue");
        myCar.setPrice(23000.00);

        // Display updated car details
        System.out.println("\nUpdated Car Details:");
        


        Bank myBank = new Bank("SBI","Rashtrapal","12345677" , 9870.00);

        myBank.displayAccountDetails();
         myBank.displayAccountDetails();
   

        Bike myBike = new Bike("hero", "bs6", 2020, "blue", 100000.00);

        myBike.displayBikeDetails();


        Student student1= new Student("rashtrapal", 21, "12345", "....");

        student1.displayStudentDetails();
        student1.updateMajor("...");


       
    }
    
    
}
