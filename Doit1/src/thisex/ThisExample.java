package thisex;

public class ThisExample {
    public static void main(String[] args) {
        Birthday bDay = new Birthday();
        bDay.setYear(2000);
        System.out.println(bDay);
        bDay.printThis();
    }
}
