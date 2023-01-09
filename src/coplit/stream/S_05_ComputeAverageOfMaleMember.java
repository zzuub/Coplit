package coplit.stream;

import java.util.List;

public class S_05_ComputeAverageOfMaleMember {
    public double computeAverageOfMaleMember(List<Member> members) {
        double info = members.stream()
                .filter(i -> i.getGender().equals("Male"))
                .mapToInt(Member::getAge)
                .average()
                .orElse(0.0);
        return info;
    }

    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}
