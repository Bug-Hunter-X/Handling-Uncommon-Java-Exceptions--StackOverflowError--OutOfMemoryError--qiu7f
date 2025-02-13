public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: Division by zero!");
        } catch (StackOverflowError e) {
            System.err.println("StackOverflowError caught.  Check for infinite recursion.");
            //Consider adding logging to analyze the call stack
        } catch (OutOfMemoryError e) {
            System.err.println("OutOfMemoryError caught.  Reduce memory usage.");
            // Consider improving memory management strategies (object pooling, etc.)
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution continues...");
        }
    }
} 