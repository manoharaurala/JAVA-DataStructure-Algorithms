public class LogBase5 {

    public static void main(String[] args) {
        double result = Math.log(47) / Math.log(5);

        // Find the floor value
        int floorValue = (int) Math.floor(result);

        // Print the result
        System.out.println("Floor value of log47 base 5: " + floorValue);
    }
}
