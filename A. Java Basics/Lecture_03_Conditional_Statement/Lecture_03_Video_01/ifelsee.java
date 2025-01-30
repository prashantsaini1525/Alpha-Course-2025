
public class ifelsee {

    public static void main(String[] args) {
        int Baby = 1;
        int Toddler = 3;
        int Preschooler = 5;
        int Child = 12;
        int Teenager = 19;
        int YoungAdults = 35;
        int MiddleAgeAdults = 60;

        if (Baby <= 1) {
            System.out.println("Ankh : You are a baby.");
        }
        if (Toddler <= 1 && Toddler >= 3) {
            System.out.println("Ankh : You Will be a toddler.");
        }
        if (Preschooler <= 5 && Preschooler >= 3) {
            System.out.println("Ankh : You Will a preschooler.");
        }
        if (Child <= 12 && Child >= 1) {
            System.out.println("Ankh : You are a child.");
        }
        if (Teenager >= 13 && Teenager <= 19) {
            System.out.println("Siddharth : You are a teenager.");
            System.out.println("Sarthak : You are a teenager.");
        }
        if (YoungAdults >= 20 && YoungAdults <= 35) {
            System.out.println("Kartik Saini : You are a young adult.");
            System.out.println("Aman Kaur Saini : You are a young adult.");
            System.out.println("Kartik Saini : You are a young adult.");
            System.out.println("Kanishk Saini : You are a young adult.");
            System.out.println("Sakshi Singh : You are a young adult.");
            System.out.println("Kanak Raj : You are a young adult.");
            System.out.println("Rajat Saini : You are a young adult.");
            System.out.println("Divya Bharti : You are a young adult.");
            System.out.println("Prashant Saini : You are a young adult.");
            System.out.println("Tejashwani Saini : You are a young adult.");
        }
        if (MiddleAgeAdults >= 36 && MiddleAgeAdults <= 60) {
            System.out.println("Mrs. Archana Saini : You are a middle age adult.");
            System.out.println("Mr. Sarita Saini : You are a middle age adult.");
            System.out.println("Mr. Ramesh Chandra Saini : You are a middle age adult.");
            System.out.println("Mrs. Anita Saini : You are a middle age adult.");
            System.out.println("Mrs. Shashi Prabha Saini : You are a middle age adult.");
            System.out.println("Mr. Mahesh Kumar Saini : You are a middle age adult.");
        } else {
            System.out.println ("Dr. Shyo Prasad : Your are a Senior Citizen");
            System.out.println ("Mr. Prem Shankar Saini : Your are a Senior Citizen");
        }
        
    }
}
