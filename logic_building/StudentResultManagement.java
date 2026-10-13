package Assignment1;

import java.util.Scanner;


class Student {

    private String name;
    private int rollNumber;
    private int m1, m2, m3, m4, m5;

    // Parameterized constructor
    Student(String name, int rollNumber, int m1, int m2, int m3, int m4, int m5) {
        this.name = name;
        this.rollNumber = rollNumber;

        setM1(m1);
        setM2(m2);
        setM3(m3);
        setM4(m4);
        setM5(m5);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getM1() {
        return m1;
    }

    public int getM2() {
        return m2;
    }

    public int getM3() {
        return m3;
    }

    public int getM4() {
        return m4;
    }

    public int getM5() {
        return m5;
    }

    // Setters with validation
    public void setM1(int m1) {
        if (m1 >= 0 && m1 <= 100) {
            this.m1 = m1;
        } else {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
    }

    public void setM2(int m2) {
        if (m2 >= 0 && m2 <= 100) {
            this.m2 = m2;
        } else {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
    }

    public void setM3(int m3) {
        if (m3 >= 0 && m3 <= 100) {
            this.m3 = m3;
        } else {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
    }

    public void setM4(int m4) {
        if (m4 >= 0 && m4 <= 100) {
            this.m4 = m4;
        } else {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
    }

    public void setM5(int m5) {
        if (m5 >= 0 && m5 <= 100) {
            this.m5 = m5;
        } else {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
    }

    // Calculate total
    public int calculateTotal() {
        return m1 + m2 + m3 + m4 + m5;
    }

    // Calculate percentage
    public double calculatePercentage() {
        return calculateTotal() / 5.0;
    }

    // Check result status
    public String getResultStatus() {
        if (m1 >= 40 && m2 >= 40 && m3 >= 40
                && m4 >= 40 && m5 >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    // Display complete result
    public void displayResult() {
        System.out.println("Student Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Total Marks: " + calculateTotal() + "/500");
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Result: " + getResultStatus());
    }
}

public class StudentResultManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.println("Enter marks for 5 subjects:");

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        try {
            Student s = new Student(name, rollNumber, m1, m2, m3, m4, m5);
            s.displayResult();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }

        sc.close();
    }
}
