public class Main {
    public static void main(String[] args) {

        Author Leonard = new Author(1, "Erica", "Leonard");
        Author DaVinci = new Author(2, "Leonardo", "DaVinci");
        Author Pustoi = new Author (3, "Erica", "Leonard");
        Book book1 = new Book (1, "50 shades of grey", Leonard, 1980);
        Book book2 = new Book (2, "AboutPainting", DaVinci, 1542);
        Book book3 = new Book (3, "50 shades of grey", Leonard, 1980);

        //Проверка метода toString
        System.out.println(Leonard);
        System.out.println(DaVinci);
        System.out.println(Pustoi);
        System.out.println(" ");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(" ");

        //Проверка метода equals
        if (DaVinci.equals(Leonard)) {
            System.out.println("Автор " + DaVinci.getId() + " cовпадает с автором " + Leonard.getId());
        } else {
            System.out.println("Автор " + DaVinci.getId() + " не cовпадает с автором " + Leonard.getId());
        }
        if (Pustoi.equals(Leonard)) {
            System.out.println("Автор " + Pustoi.getId() + " cовпадает с автором " + Leonard.getId());
        } else {
            System.out.println("Автор " + Pustoi.getId() + " не cовпадает с автором " + Leonard.getId());
        }
        System.out.println(" ");
        if (book2.equals(book1)) {
            System.out.println("Название книги " + book2.getId() + " cовпадает с названием книги " + book1.getId());
        } else {
            System.out.println("Название книги " + book2.getId() + " не cовпадает с названием книги " + book1.getId());
        }
        if (book3.equals(book1)) {
            System.out.println("Название книги " + book3.getId() + " cовпадает с названием книги " + book1.getId());
        } else {
            System.out.println("Название книги " + book3.getId() + " не cовпадает с названием книги " + book1.getId());
        }
        System.out.println(" ");

        //Проверка метода hashCode
        if (DaVinci.hashCode() == Leonard.hashCode()) {
            System.out.println("hash-коды авторов " + DaVinci.getId() + " и " + Leonard.getId() + " совпадают, автор возможно совпадает");
            System.out.println("Проверим equals методом:");
            if (DaVinci.equals(Leonard)) {
                System.out.println("Автор " + DaVinci.getId() + " cовпадает с автором " + Leonard.getId());
            } else {
                System.out.println("Автор " + DaVinci.getId() + " не cовпадает с автором " + Leonard.getId());
            }
        } else {
            System.out.println("hash-коды авторов " + DaVinci.getId() + " и " + Leonard.getId() + " не совпадают, авторы не совпадают");
        }
        if (Pustoi.hashCode() == Leonard.hashCode()) {
            System.out.println("hash-коды авторов " + Pustoi.getId() + " и " + Leonard.getId() + " совпадают, автор возможно совпадает");
            System.out.println("Проверим equals методом:");
            if (Pustoi.equals(Leonard)) {
                System.out.println("Автор " + Pustoi.getId() + " cовпадает с автором " + Leonard.getId());
            } else {
                System.out.println("Автор " + Pustoi.getId() + " не cовпадает с автором " + Leonard.getId());
            }
        } else {
            System.out.println("hash-коды авторов " + Pustoi.getId() + " и " + Leonard.getId() + " не совпадают, авторы не совпадают");
        }
        System.out.println(" ");
        if (book2.hashCode() == book1.hashCode()) {
            System.out.println("hash-код названия книг " + book2.getId() + " и " + book1.getId() + " совпадают");
        } else {
            System.out.println("hash-код названия книг " + book2.getId() + " и " + book1.getId() + " не совпадают");
        }
        if (book3.hashCode() == book1.hashCode()) {
            System.out.println("hash-код названия книг " + book3.getId() + " и " + book1.getId() + " совпадают");
        } else {
            System.out.println("hash-код названия книг " + book3.getId() + " и " + book1.getId() + " не совпадают");
        }
    }
}