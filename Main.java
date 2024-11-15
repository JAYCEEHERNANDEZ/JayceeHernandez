public class Main{
    public static void main(String[] args) {
        
        // Student student1 = new Student();
        // student1.setId(1234);
        // student1.setname("Student 1");

        // System.out.println("Student Id: " + student1.getId());
        // System.out.println("Student Name:" + student1.getname() );

        Book book = new Book();
        book.setBookNumber(1);
        System.out.println("Book Number: " + book.getBook_number());

        book.setTitle("Holy God");
        System.out.println("Book Title: " + book.gettitle());

        book.setAuthor("Raniel Lopez");
        System.out.println("Author Name: " + book.geetAuthor());

        book.setPrice(500.00);
        System.out.println("Book Price: " + book.getPrice());
    }
}