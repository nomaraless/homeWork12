public class Main {
    public static void main(String[] args) {
        Author kirupa = new Author("Чиннатхамби", "Кирупа");
        Author borisBlack = new Author("Черный", "Борис");
        Book typeScriptPro = new Book("Профессиональный TypeScript", borisBlack, 2022, 351, "Питер");
        Book javaScript = new Book("JavaScript с нуля", kirupa, 2022, 400, "Питер");
        System.out.println();
        javaScript.setYearOfPublishing(2023);
        System.out.println(javaScript.getYearOfPublishing());
    }
}