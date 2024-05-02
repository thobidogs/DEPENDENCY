public class TestProgram {
    public static void main(String[] args) throws Exception {
      
        Student student = new Student();
        student.setName("Thoby Ralleta");
        student.setStudentNumber("21-11402-313");
        
        AudioBook audioBook = new AudioBook();
        student.borrowItem(audioBook);
    }
}
