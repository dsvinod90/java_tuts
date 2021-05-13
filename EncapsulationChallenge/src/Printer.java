public class Printer {
  private int tonerLevel;
  private int pagesPrinted = 0;
  private boolean duplex;

  public Printer(int tonerLevel, boolean duplex) {
    if(tonerLevel < 0 || tonerLevel > 100) {
      this.tonerLevel = -1;
    } else {
      this.tonerLevel = tonerLevel;
    }
    this.duplex = duplex;
  }

  public int addToner(int tonerAmount) {
    if((tonerLevel == -1) || (tonerAmount <= 0 || tonerAmount > 100) || ((tonerLevel + tonerAmount) > 100)) {
      return -1;
    }
    return (tonerAmount + tonerLevel);
  }

  public int printPages(int pages) {
    int pagesToPrint = pages;
    if(duplex) {
      pagesToPrint = (pages / 2) + (pages % 2);
    }
    pagesPrinted += pagesToPrint;
    return pagesToPrint;
  }

  public int getPagesPrinted() {
    return pagesPrinted;
  }
}
