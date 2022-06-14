public class Main {
    public static void main(String[] args) {

        Author Leonard = new Author(1, "Erica", "Leonard");
        Author DaVinci = new Author( 2, "Leonardo", "DaVinci");
        Author Pustoi = new Author ( 3, "Erica", "Leonard");

        System.out.println(Leonard);
        System.out.println(DaVinci);
        System.out.println(Pustoi);
        System.out.println(" ");

        //Проверка совпадения авторов через equals
        if (!(DaVinci.equals(Leonard))) {
            System.out.println("Автор " + DaVinci.getId() + " не совпадает с Автором " + Leonard.getId());
        } else {
            System.out.println("Автор " + DaVinci.getId() + " совпадает с Автором " + Leonard.getId());
        }
        if (!(Pustoi.equals(Leonard))) {
            System.out.println("Автор " + Pustoi.getId() + " не совпадает с Автором " + Leonard.getId());
        } else {
            System.out.println("Автор " + Pustoi.getId() + " совпадает с Автором " + Leonard.getId());
        }
        System.out.println(" ");

        //Проверка совпадения авторов через hash
        if (Leonard.hashCode() == DaVinci.hashCode()) {
            System.out.println("hash-коды имен авторов " + Leonard.getId() + " и " + DaVinci.getId() + " совпадают, авторы могут совпасть, требуется дополнительная проверка");
        } else {
            System.out.println("hash-коды имен авторов " + Leonard.getId() + " и " + DaVinci.getId() + " не совпадают, авторы точно не совпадают");
        }
        if (Leonard.hashCode() == Pustoi.hashCode()) {
            System.out.println("hash-коды имен авторов " + Leonard.getId() + " и " + Pustoi.getId() + " совпадают, авторы могут совпасть, требуется дополнительная проверка");
        } else {
            System.out.println("hash-коды имен авторов " + Leonard.getId() + " и " + Pustoi.getId() + " не совпадают, авторы точно не совпадают");
        }
        System.out.println(" ");

        Book book1 = new Book (1, "50 shades of grey", Leonard, 1980);
        Book book2 = new Book (2, "AboutPainting", DaVinci, 1542);
        Book book3 = new Book(3, "50 shades of grey", Leonard, 1980);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(" ");

        //Проверка совпадения названий книг через equals
        if (!(book2.equals(book1))) {
            System.out.println("Книга " + book2.getId() + " не совпадает с книгой " + book1.getId());
        } else {
            System.out.println("Книга " + book2.getId() + " совпадает с книгой " + book1.getId());
        }
        if (!(book3.equals(book1))) {
            System.out.println("Книга " + book3.getId() + " не совпадает с книгой " + book1.getId());
        } else {
            System.out.println("Книга " + book3.getId() + " совпадает с книгой " + book1.getId());
        }
        System.out.println(" ");

        //Проверка совпадения авторов через hash
        if (book1.hashCode() == book2.hashCode()) {
            System.out.println("hash-коды названия книг " + book1.getId() + " и " + book2.getId() + " совпадают");
        } else {
            System.out.println("hash-коды названия книг " + book1.getId() + " и " + book2.getId() + " не совпадают");
        }
        if (book1.hashCode() == book3.hashCode()) {
            System.out.println("hash-коды названия книг " + book1.getId() + " и " + book3.getId() + " совпадают");
        } else {
            System.out.println("hash-коды названия книг " + book1.getId() + " и " + book3.getId() + " не совпадают");
        }
        System.out.println(" ");


     }
}