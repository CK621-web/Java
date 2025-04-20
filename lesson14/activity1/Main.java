package lesson14.activity1;

// additional methods not shown } (a) Write an instance method for the DataSet
// class called ‘getStandardDeviation’ that returns the standard deviation of
// the values in the data array. Assume that the data array is full and contains
// at least one value. (b) Assume that the DataSet class has a ‘toString’ method
// that returns a string representation of the DataSet object. Write a static
// method for the DataSet class called ‘calculateAverage’ that takes an array of
// DataSet objects and returns the average of their averages, as a double. The
// array is guaranteed to have at least one element.

public class Main {
    public static void main(String[] args) {
        DataSet dataset = new DataSet();
        dataset.add(10);
        dataset.add(12);
        dataset.add(20);
        dataset.add(22);

        System.out.println("Standard Deviation: " + dataset.getStandardDeviation());

        DataSet[] datasets = new DataSet[2];

        DataSet ds1 = new DataSet();
        ds1.add(2);
        ds1.add(3);
        ds1.add(4);

        DataSet ds2 = new DataSet();
        ds2.add(1);
        ds2.add(5);
        ds2.add(8);

        datasets[0] = ds1;
        datasets[1] = ds2;
        System.out.println("Average of the Averages" + DataSet.CalculateAverage(datasets));
    }

}