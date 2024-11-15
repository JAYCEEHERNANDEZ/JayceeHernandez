public class Book {
    private int book_number;
    private String title;
    private String Author;
    private double price;
    
    public void setBookNumber(int book_number){
        this.book_number = book_number;
    }
    public int getBook_number(){
        return book_number;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String gettitle(){
        return title;
    }
    public void setAuthor(String Author){
        this.Author = Author;
    }
    public String geetAuthor(){
        return Author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

}
