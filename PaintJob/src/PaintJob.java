import java.util.Scanner;

//width = width of the wall
//height = height of the wall
//areaPerBucket = area that can be covered with one bucket of paint
//extraBuckets = bucket count that Bob has at home

public class PaintJob {
  public static Scanner scanner = new Scanner(System.in);

  public static double totalBucketsRequired(double width, double height, double areaPerBucket) {
    double area = width * height;
    return(area/areaPerBucket);
  }

  public static double totalBucketsRequired(double area, double areaPerBucket) {
    return(area/areaPerBucket);
  }

  public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
    if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
      return -1;
    }
    return (int) Math.ceil(totalBucketsRequired(width, height, areaPerBucket) - extraBuckets);
  }

  public static int getBucketCount(double width, double height, double areaPerBucket) {
    if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
      return -1;
    }
    return (int) Math.ceil(totalBucketsRequired(width, height, areaPerBucket));
  }

  public static int getBucketCount(double area, double areaPerBucket) {
    if(area <= 0 || areaPerBucket <= 0) {
      return -1;
    }
    return (int) Math.ceil(totalBucketsRequired(area, areaPerBucket));
  }

  public static void main(String[] args) {
    System.out.println("Calculate buckets based on width, height, areaPerBucket and extraBuckets: ");
    System.out.print("Enter the width of the wall: ");
    double width = scanner.nextDouble();
    System.out.print("Enter the height of the wall: ");
    double height = scanner.nextDouble();
    System.out.print("Enter the area covered by one bucked: ");
    double area = scanner.nextDouble();
    System.out.print("Enter the number of extra buckets: ");
    int extraBuckets = scanner.nextInt();
    int requiredBuckets = getBucketCount(width, height, area, extraBuckets);
    if(requiredBuckets == -1) {
      System.out.println("Invalid Input");
    } else {
      System.out.println("Buckets required = " + requiredBuckets);
    }
    System.out.println("================================================================");

    System.out.println("Calculate buckets based on width, height and areaPerBucket: ");
    System.out.print("Enter the width of the wall: ");
    double widthOne = scanner.nextDouble();
    System.out.print("Enter the height of the wall: ");
    double heightOne = scanner.nextDouble();
    System.out.print("Enter the area covered by one bucket: ");
    double areaOne = scanner.nextDouble();
    int requiredBucketsOne = getBucketCount(widthOne, heightOne, areaOne);
    if(requiredBucketsOne == -1) {
      System.out.println("Invalid Input");
    } else {
      System.out.println("Buckets required = " + requiredBucketsOne);
    }
    System.out.println("================================================================");

    System.out.println("Calculate buckets based on the area of tha wall and areaPerBucket: ");
    System.out.print("Enter the area of the wall: ");
    double areaTwo = scanner.nextDouble();
    System.out.print("Enter the area covered by one bucket: ");
    double areaCoveredByBucket = scanner.nextDouble();
    int requiredBucketsTwo = getBucketCount(areaTwo, areaCoveredByBucket);
    if(requiredBucketsTwo == -1) {
      System.out.println("Invalid Input");
    } else {
      System.out.println("Buckets required = " + requiredBucketsTwo);
    }
    scanner.close();
  }
}
