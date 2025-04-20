package lesson14.activity1;

public class DataSet {
  private double[] data;
  private int dataSize;
  private double sum;

  public DataSet() {
    data = new double[100];
    dataSize = 0;
    sum = 0;
  }

  public void add(double value) {
    data[dataSize] = value;
    dataSize++;
    sum += value;

  }

  public double getAverage() {
    if (dataSize == 0) {
      return 0;
    } else {
      return sum / dataSize;
    }

  }

  public double getStandardDeviation() {
    double avg = getAverage();
    double SumOfSquares = 0.0;

    for (int i = 0; i < dataSize; i++) {
      double diff = data[i] - avg;
      SumOfSquares += diff * diff;
    }
    return Math.sqrt(SumOfSquares / dataSize);

  }

  @Override
  public String toString() {
    return "DataSet[Size=" + dataSize + ", Avg= " + getAverage() + "]";
  }

  public static double CalculateAverage(DataSet[] dataSets) {
    double total = 0.0;
    for (DataSet ds : dataSets) {
      total += ds.getAverage();
    }
    return total / dataSets.length;
  }

}