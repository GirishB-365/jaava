public class task2 {
    public class DateConverter {
    public static void convertDays(int totalDays) {
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println(totalDays + " days = " + years + " years, " + months + " months, and " + days + " days.");
    }

    public static void main(String[] args) {
        int inputDays = 800; 
        convertDays(inputDays);
    }
}

    
}
