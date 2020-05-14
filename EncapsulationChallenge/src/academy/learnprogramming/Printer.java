package academy.learnprogramming;

public class Printer {

    private double tonerLevel = 100;
    private int PagesPrinted;
    private boolean duplex;

    public Printer(double tonerLevel, int PagesPrinted, boolean duplex) {
        if (tonerLevel>0 && tonerLevel<100){
            this.tonerLevel = tonerLevel;
        }
        this.PagesPrinted = PagesPrinted;
        this.duplex = duplex;
    }

    public void fillUpToner(double addedToner){
        this.tonerLevel+=addedToner;
        if (this.tonerLevel>100){
            this.tonerLevel=100;
        }
        System.out.println("Toner filled up, level = "+this.tonerLevel);
    }

    public void print(int pages){
        this.PagesPrinted +=pages;
        this.tonerLevel=this.tonerLevel-pages/10;
        System.out.println("Printing.....");
        System.out.println("From the beginning the printer printed " +this.PagesPrinted + " pages.");
        System.out.println("Current toner level = " + this.tonerLevel);
    }

    public int getPagesPrinted() {
        return PagesPrinted;
    }
}
