public class Main {
    public static void main(String[] args) {

        Author Leonard = new Author("Erica", "Leonard");
        Author DaVinci = new Author("Leonardo", "DaVinci");
        Author Pustoi = new Author ("", "1234");

        System.out.println("Автор1: " + Leonard.getFirstName() + " " + Leonard.getLastName());
        System.out.println("Автор2: " + DaVinci.getFirstName() + " " + DaVinci.getLastName());
        System.out.println("Автор3: " + Pustoi.getFirstName() + " " + Pustoi.getLastName());
        System.out.println(" ");

        Book book1 = new Book ("50 shades of grey", Leonard, 1980);
        System.out.println("Книга1: " + book1.getTitle() + " Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + " Год публикации: " + book1.getYearPublication());

        Book book2 = new Book ("AboutPainting", DaVinci, 1542);
        System.out.println("Книга2: " + book2.getTitle() + " Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + " Год публикации: " + book2.getYearPublication());

        Book book3 = new Book("Weather", Pustoi, 2015);
        //System.out.println("Книга3: " + book3.getTitle() + " Автор: " + book3.getAuthor().getFirstName() + " " + book3.getAuthor().getLastName() + " Год публикации: " + book3.getYearPublication());
        System.out.println(" ");

        book1.setYearPublication(1990);
        System.out.println("Книга1: " + book1.getTitle() + " Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + " Год публикации: " + book1.getYearPublication());

     }
}