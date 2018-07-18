public class Test {
    public static void main(String[] args) {

        try {
            String s = "asd";
            System.out.println(s.charAt(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("OutOf: ");
        } catch (RuntimeException e) {
            System.out.println("R: ");
        } catch (Exception e) {
            System.out.println("E: ");
        }
    }
}