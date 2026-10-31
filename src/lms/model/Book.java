package lms.model;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        this.isBorrowed = false;
    }
    public String getTitle(){
        return  title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setTitle(String title) {
        if(title==null||title.trim().isBlank()){
            throw new IllegalArgumentException("The Title can not be null");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if(author==null||author.trim().isBlank()){
           throw new IllegalArgumentException("The Author can not be null") ;
        }
        this.author = author;
    }

    public void setIsbn(String isbn) {
        if(isbn==null||isbn.trim().isBlank()){
            throw new IllegalArgumentException("The isbn can not be null");
        }
        this.isbn = isbn;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{title ='"+title +"',Author='"+author+"',ISBN = '"+isbn+"',IS Borrowed ='"+isBorrowed+"' }";
    }
}
