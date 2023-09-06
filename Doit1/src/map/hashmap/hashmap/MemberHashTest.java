package map.hashmap.hashmap;

import collection.Member;

public class MemberHashTest {
    public static void main(String[] args) {
        MemberHashMap memberhashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서훤");
        Member memberHong = new Member(1004, "홍길동");

        memberhashMap.addMember(memberLee);
        memberhashMap.addMember(memberSon);
        memberhashMap.addMember(memberPark);
        memberhashMap.addMember(memberHong);

        memberhashMap.showAllMember();

        memberhashMap.removeMember(1004);
        memberhashMap.showAllMember();

    }
}
