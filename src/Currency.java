public class Currency {

    public static boolean validate(String input){
        try {
            Double.valueOf(input);
            return true;
        } catch (NumberFormatException exception){
            return false;
        }
    }
}
