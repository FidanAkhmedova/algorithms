 public class Program {
    public static void main(String[] args) {


        Notebook [] notebooks = new Notebook[20000];
        for (int i = 0; i < notebooks.length;i++){
            notebooks[i] = new Notebook();
        }
        Notebook.getArray(notebooks);
        Notebook.bubbleSortArray(notebooks);
        Notebook.getArray(notebooks);
    }
}
