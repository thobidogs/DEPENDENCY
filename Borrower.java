public class Borrower {

    private Student student;
    private Resource resource;
    
    public Borrower(Student student, Resource resource){
        this.student = student;
        this.resource = resource;
    }

    public void borrow(){
    System.out.println("Student " + this.student.getStudentNumber() + ", " 
                    + this.student.getName() + ", has borrowed " 
                    + this.resource.itemize() + ".");
    }
}
