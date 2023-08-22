package constructor;

public class Person {
    String name;
    float height;
    float weight;


    public Person(){}
    // 생성자
    public Person(String name){
        this.name = name;
    }

    public Person(String pname, float pheight, float pweight) {
        this.name = pname;
        this.height = pheight;
        this.weight = pweight;
    }


}
