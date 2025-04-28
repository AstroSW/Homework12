public class Main {
    public static void main(String[] args) {
        System.out.println();
        Author pushkin = new Author("Александр", "Пушкин");
        Book onegin = new Book("Евгений Онегин", pushkin, 2007);
        Author lermontov = new Author("Михаил", "Лермонтов");
        Book geroyNV = new Book("Герой нашего времени", lermontov, 1984);
        System.out.println(lermontov.getFirstName() +" "+ lermontov.getLastName() +", "+ geroyNV.getTitle() +", "+ geroyNV.getYearPublication());
        geroyNV.setYearPublication(2019);
        System.out.println(lermontov.getFirstName() +" "+ lermontov.getLastName() +", "+ geroyNV.getTitle() +", "+ geroyNV.getYearPublication());
    }
}
class Book {
    private String title;
    private Author author;
    private int yearPublication;

    public Book (String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }
    public String getTitle () {
        return this.title;
    }
    public Author getAuthor () {
        return this.author;
    }
    public int getYearPublication () {
        return this.yearPublication;
    }
    public void setYearPublication (int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName () {
        return this.firstName;
    }
    public String getLastName () {
        return this.lastName;
    }
}