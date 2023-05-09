package ex.periment;

class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "33";
        int age = Integer.parseInt(ageInput);
        Integer ageInteger = Integer.valueOf(ageInput);

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput);     // converting to little l integer
        Long populationLong = Long.valueOf(populationInput);   // taking string and converting it to big L long string

        String salaryInput = "35000.01";
        double salary = Double.parseDouble(salaryInput);
        Double salaryDouble = Double.valueOf(salaryInput);

        String isCloudyInput = "true";
        boolean isCloudy = Boolean.parseBoolean(isCloudyInput);  // taking string "true" and converting to actual boolean true
        Boolean isCloudyBoolean = Boolean.valueOf(isCloudyInput);
    }
}