// Conversion Ratio for MB to KB:
// 1MB = 1024 KB
public class MegaBytesConverter {
  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    int conversionRatio = 1_024;

    if(kiloBytes < 0) {
      System.out.println("Invalid Value");
    } else {
      int megaBytes = kiloBytes / conversionRatio;
      int remainingKiloBytes = kiloBytes % conversionRatio;
      System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }
  }

  public static void main(String[] args) {
    printMegaBytesAndKiloBytes(2_500);
    printMegaBytesAndKiloBytes(-1_024);
    printMegaBytesAndKiloBytes(5_000);
  }
}
