public class TestProgram {
    public static void main(String[] args) throws Exception {
      
        Student student = new Student();
        student.setName("Thoby Ralleta");
        student.setStudentNumber("21-11402-313");
        
        AudioBook audioBook = new AudioBook();
        Borrower borrower = new Borrower(student, audioBook);
        borrower.borrow();
    }
}
