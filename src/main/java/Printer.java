public class Printer {
    private int Paper;
    private int Toner;

    public Printer(int paper, int toner){
        this.Paper = paper;
        this.Toner = toner;
    }

    public void Print(int pages, int copies) {
        if (pages * copies <= this.Paper){
            Paper -= pages * copies;
            Toner -= pages;
        }
    }

    public int getPaper() {
        return Paper;
    }

    public int getToner() {
        return Toner;
    }
}
