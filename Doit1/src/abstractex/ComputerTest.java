package abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        //Computer c1 = new Computer(); //추상클래스는 인스턴스를 생성할 수 없음
        Computer c2 = new DeskTop();
        //Computer c3 = new NoteBook(); //추상클래스는 인스턴스를 생성할 수 없음
        Computer c4 = new MyNoteBook();


    }
}
