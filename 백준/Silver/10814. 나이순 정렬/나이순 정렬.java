import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        List<Member> members = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            members.add(new Member(sc.nextInt(), sc.next()));
        }

        // members.sort((o1, o2) -> o1.getAge() - o2.getAge());
        members.sort(Comparator.comparingInt(Member::getAge));

        for (Member member : members) {
            System.out.println(member);
        }

    }

    private static class Member {
        private final int age;
        private final String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return getAge() + " " + getName();
        }
    }
}
