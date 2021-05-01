public class FlourPack {
  public static boolean canPack(int bigCount, int smallCount, int goal) {
    //bigCount = 5kg/bag
    //smallCount = 1kg/bag
    int totalWeight = (bigCount * 5) + smallCount;
    if(bigCount < 0 || smallCount < 0 || goal < 0) {
      return false;
    } else if(totalWeight < goal) {
      return false;
    } else if(totalWeight == goal) {
      return true;
    } else {
      // (5, 3, 26)
      return (smallCount >= goal % 5);
    }
  }
}

