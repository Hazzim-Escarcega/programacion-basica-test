package exceptionsexcercise;

public class Main {
    public static void main(String[] args) {
        Fail obj = new Fail();

        try {
            obj.fail();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
