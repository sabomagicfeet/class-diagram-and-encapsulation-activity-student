public class Student {

    private String name;
    private char grade;
    private int group;
    private String secretNickName = "MySecretNickName";

    public Student(String name, char grade, int group) {
        this.name = name;

        if('A' <= grade && grade <= 'F') {
            this.grade = grade;
        } else {
            System.out.println("Grade must be one of the following: A, B, C, D, E, F");
        }

        if(1 <= group && group <= 5) {
            this.group = group;
        } else {
            System.out.println("Group must be one of the following: 1, 2, 3, 4, 5");
        }
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public int getGroup() {
        return group;
    }

    public void upgrade() {
        if(this.grade == 'A') {
            System.out.println("This student's grade is A and you can't upgrade more. It is already the best. ");
        } else {
            this.grade --;
        }
    }

    public void downgrade() {
        if(this.grade == 'F') {
            System.out.println("This student's grade is F and you can't downgrade more. It is already the worst. ");
        } else {
            this.grade ++;
        }
    }

}
