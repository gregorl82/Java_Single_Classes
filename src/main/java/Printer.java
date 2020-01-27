public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper) {
        this.paper = paper;
        this.toner = 20;
    }

    public int getPaper(){
        return this.paper;
    }

    public void print(int numberOfPages, int copies){
        int pages = numberOfPages * copies;
        if (this.paper >= pages) {
            this.paper -= pages;
            this.toner -= pages;
        }
    }

    public int getToner(){
        return this.toner;
    }
}
