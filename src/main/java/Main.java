public class Main {
    public static void main(String[] args) {
        System.out.println("Student 1 ");
        Student student1 = new Student("Ian", 'A', 1);
        System.out.println("Student name : " + student1.getName() );
        System.out.println("Student grade : " + student1.getGrade() );
        System.out.println("Student group : " + student1.getGroup() );
        System.out.println("Upgrade this student.");
        student1.upgrade();
        System.out.println("Student grade : " + student1.getGrade() );
        System.out.println("Downgrade this student. ");
        student1.downgrade();
        System.out.println("Student grade : " + student1.getGrade() );

        System.out.println("Student 2");
        Student student2 = new Student("Sabo", 'F', 2);
        System.out.println("Student name : " + student2.getName() );
        System.out.println("Student grade : " + student2.getGrade() );
        System.out.println("Student group : " + student2.getGroup() );
        System.out.println("Upgrade this student.");
        student2.upgrade();
        System.out.println("Student grade : " + student2.getGrade() );
        System.out.println("Downgrade this student. ");
        student2.downgrade();
        System.out.println("Student grade : " + student2.getGrade() );

        System.out.println("Student 3");
        Student student3 = new Student("Ddochi", 'B', 3);
        System.out.println("Student name : " + student3.getName() );
        System.out.println("Student grade : " + student3.getGrade() );
        System.out.println("Student group : " + student3.getGroup() );
        System.out.println("Upgrade this student.");
        student3.upgrade();
        System.out.println("Student grade : " + student3.getGrade() );
        System.out.println("Downgrade this student. ");
        student3.downgrade();
        System.out.println("Student grade : " + student3.getGrade() );

        char a = 'B';
        a ++;
        System.out.println(a);

        a --;
        System.out.println(a);
    }
}
