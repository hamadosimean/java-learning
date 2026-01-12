package course2;

abstract class Person {
    Date dateOfBirth;
    String name;

    abstract void getDetails();
    public void getName(){
        System.out.println("Name");
    };
    
}
