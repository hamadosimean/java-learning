package course2;

public class Student extends Person {
    String subject;
    String teacher;

    Student(String name, Date dob, String subject, String teacher) {
     this.dateOfBirth = dob;
     this.name = name;
     this.subject = subject;
     this.teacher = teacher;
    }


    @Override
    public void getDetails(){
        System.out.println("Name : "+ this.name);
        System.out.println("Date of birth : "+ this.dateOfBirth.getDate());
        System.out.println("Subject : "+ this.subject);
        System.out.println("Teacher : "+ this.teacher);
    }

    
}
