import java.util.Random;

public class Notebook {

    private int price;
    private int memory;
    private String manufacturer;
    private int count;


    public Notebook(){
        setArray();
    }
    public void setArray() {
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(5);
        int price = 500 + randomizer.nextInt(31) * 50;
        int memory = 4 + randomizer.nextInt(6) * 4;

        switch (randomNumber){
            case 0:
                setMemory(memory);
                setManufacturer("Acer");
                setPrice(price);
                break;
            case 1:
                setMemory(memory);
                setManufacturer("Macbook");
                setPrice(price);
                break;
            case 2:
                setMemory(memory);
                setManufacturer("Lenovo");
                setPrice(price);
                break;
            case 3:
                setMemory(memory);
                setManufacturer("Asus");
                setPrice(price);
                break;
            case 4:
                setMemory(memory);
                setManufacturer("Xiaomi");
                setPrice(price);
                break;

        }
    }
    public static void bubbleSortArray(Notebook notebook[]) {

        for (int i = 0; i < notebook.length-1; i++) {
            for (int j = 0; j < notebook.length-i-1; j++) {
                if (notebook[j].price > notebook[j+1].price){
                    int w = notebook[j].price; notebook[j].price = notebook[j+1].price; notebook[j+1].price = w;
                    int n = notebook[j].memory; notebook[j].memory = notebook[j+1].memory; notebook[j+1].memory = n;
                    String s = notebook[j].manufacturer; notebook[j].manufacturer = notebook[j+1].manufacturer; notebook[j+1].manufacturer = s;
                }
                if(notebook[j].price == notebook[j+1].price){
                        if (notebook[j].memory > notebook[j+1].memory){
                            int w1 = notebook[j].price; notebook[j].price = notebook[j+1].price; notebook[j+1].price = w1;
                            int n1 = notebook[j].memory; notebook[j].memory = notebook[j+1].memory; notebook[j+1].memory = n1;
                            String s1 = notebook[j].manufacturer; notebook[j].manufacturer = notebook[j+1].manufacturer; notebook[j+1].manufacturer = s1;

                        }

                        if(notebook[j].memory == notebook[j+1].memory){
                            if (notebook[j].ManufacturerCount() > notebook[j+1].ManufacturerCount()){
                                int w2 = notebook[j].price; notebook[j].price = notebook[j+1].price; notebook[j+1].price = w2;
                                int n2 = notebook[j].memory; notebook[j].memory = notebook[j+1].memory; notebook[j+1].memory = n2;
                                String s2 = notebook[j].manufacturer; notebook[j].manufacturer = notebook[j+1].manufacturer; notebook[j+1].manufacturer = s2;

                            }
                        }
                }
            }
        }
    }
    public static void getArray(Notebook notebook[]){
        for (int j = 0; j < notebook.length;j++){
            System.out.println(notebook[j]+ ", " + notebook[j].manufacturer + ", " + notebook[j].price + ", " + notebook[j].memory);
        }
        System.out.println();
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int ManufacturerCount() {
        switch (manufacturer){
            case "Lenovo":
                count = 4;break;
                case "Asus":
                count = 3;break;
                case "Macbook":
                count = 2;break;
                case "Acer":
                count = 1;break;
                case "Xiaomi":
                count = 0;break;
        }
        return count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
