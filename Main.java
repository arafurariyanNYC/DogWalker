import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) throws IOException {
        File f = new File("companies.txt");
        Scanner s = new Scanner(f);
        DogWalkCompany[] companies = new DogWalkCompany[100];
        for (int i = 0; i < 100; i++) {
            companies[i] = new DogWalkCompany(s.nextLine());
        }
        f = new File("walkers.txt");
        s = new Scanner(f);
        int total = 0;
        for (int i = 0; i < 100; i++) {
            int company = s.nextInt();
            int maxDogs = s.nextInt();
            int startHour = s.nextInt();
            int endHour = s.nextInt();
            DogWalker walker = new DogWalker(maxDogs, companies[company]);
            int pay = walker.dogWalkShift(startHour, endHour);
            total += pay;
            System.out.println(pay);
        }
        System.out.println(total);
    }
}