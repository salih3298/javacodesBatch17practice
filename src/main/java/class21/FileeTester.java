package class21;

public class FileeTester {
    public static void main(String[] args) {

        Filee[] arr = {new JavaFilee("JavaFile", 500), new WordFilee("WordFile", 500), new PdfFilee("PdfFile", 500)};

        for (Filee f : arr) {
            f.open();
            f.edit();
            f.close();
        }
    }
}