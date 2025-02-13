public class UncommonError {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
            //This is a common error, but we will focus on the uncommon scenarios below
        } catch (StackOverflowError e) {
            System.err.println("StackOverflowError caught: " + e.getMessage());
        } catch (OutOfMemoryError e) {
            System.err.println("OutOfMemoryError caught: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution continues...");
        }
    }
}