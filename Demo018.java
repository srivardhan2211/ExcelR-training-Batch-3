public class Demo018 {
    public static void main(String[] args) {
        int minutes = 525600;
        int minutesInDay = 1440;
        int minutesInYear = 525600;

        int years = minutes / minutesInYear;
        int remainingMinutes = minutes % minutesInYear;
        int days = remainingMinutes / minutesInDay;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        
        }
    }

