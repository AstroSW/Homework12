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

