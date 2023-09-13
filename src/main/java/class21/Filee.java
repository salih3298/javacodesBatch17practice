package class21;

/*
Create a class File that will have the following behaviors: open(), edit(), close()
and fields like name and size. Edit and close are implemented method while open is an abstract.
 Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of
 open behaviour: Example: to open .java file we need notepad++
 or sublime text, to open .doc file we need Microsoft word to be installed etc.Create a tester
 class and call all the methods from these classes.
 */
public abstract class Filee {
    private String name;
    private int size;

    public Filee(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public abstract void open();

    public void edit() {
        System.out.println("Editing the file " + name);
    }

    public void close() {
        System.out.println("Closing the file "+name);
    }
}
//////////////////////////////////////////////////////
class JavaFilee extends Filee {
    public JavaFilee(String name, int size) {
        super(name, size);
    }
    @Override
    public void open() {
        System.out.println("Opening Java File using Intellij");
    }

}

class WordFilee extends Filee {
    public WordFilee(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Using Microsoft to open the Word File");
    }

}
class PdfFilee extends Filee {
    public PdfFilee(String name, int size) {
        super(name, size);
    }

    public  void open() {

        System.out.println("Using Adobe to open PDF file");
    }

}