import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        printIsLeap(2022);
        printInstallationMessage(1, 2022);
        printCalculateDeliveryDays(10);

    }

    // задание 1
    private static void printIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("високосный год");
        } else {
            System.out.println("не високосный год");
        }
    }

    // задание 2
    private static void printInstallationMessage(int os, int productionYear) {
        if (!(os == 0 || os == 1)) {
            throw new RuntimeException("устройство поддерживаеться");

        }

        var currentYear = LocalDate.now().getYear();

        String versionMessage = productionYear < currentYear ? "  облегченную " : "";
        String osMessage = os == 0 ? "iOS" : "android";

        System.out.printf("установите %s версию приложения для %s по ссылке", versionMessage, osMessage);
    }

// задание 3
    private static void printCalculateDeliveryDays (int distance) {
        int start = 20;
        int step = 40;
        int result = 1;
        if (distance >= start) {
        } else {
            result = (Math.abs(distance - start) / step) + 2;
        }
        System.out.println();
        System.out.println("потребуется для доставки дней:" + result);

    }
        }
























