package array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];  // 개체 배열을 만들면 배열 안에는 사실 객체를 가르키는 주소값이 담겨져있다.

        for(int i = 0; i < library.length; i++){
            System.out.println(library[i]);
        }
    }
}
