package Hwork6;

class Notebook {

    Integer ramSize; // ОЗУ
    Integer hddSize; // HDD
    String operationSystem; // ОС
    String colour; // цвет
    String productName; // название производитеделя
    Integer price; // цена

    public Notebook(String nbName, String nbColour, String nbOS, Integer nbRAM, Integer nbHDD, Integer nbPrice) {
        this.productName = nbName;
        this.colour = nbColour;
        this.operationSystem = nbOS;
        this.ramSize = nbRAM;
        this.hddSize = nbHDD;
        this.price = nbPrice;

    }

    public Integer getRAM() {
        return this.ramSize;
    }

    public Integer getHDD() {
        return this.hddSize;
    }

    public String getOS() {
        return this.operationSystem;
    }

    public String getColour() {
        return this.colour;
    }

    public String getName() {
        return this.productName;
    }

    public Integer getPrice() {
        return this.price;
    }

}