class FileHandling{
    public FileHandling(){
        System.out.println(" File Handling Constuctor");
    }

   @Override
   protected void finalize() throws throwable {
    System.out.println("File handling distructor");
   }

}

public class Main {
    public static void main(String[] args) {
     FileHandling fh = new   FileHandling();
    }
}
