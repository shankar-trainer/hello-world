public class Worker {
    int id;
    String name;
    float wages;

    void workerDetail() {
        System.out.println("Details ");
        System.out.println("\tid is " + id);
        System.out.println("\tname is " + name);
        System.out.println("\twages is " + wages);
    }

    static float[] highLowWages(float wages[]) {
        float a[] = new float[2];
        for (int i = 0; i < wages.length - 1; i++) {
            for (int j = 0; j < wages.length - i - 1; j++) {
                if(wages[j]>wages[j+1]) {
                    var temp = wages[j + 1];
                    wages[j + 1] = wages[j];
                    wages[j] = temp;
                }
            }
        }
        a[0] = wages[wages.length - 1];
        a[1] = wages[0];
        return a;
    }

    static float[] totalAvgWages(float wages[]) {
        float a[] = new float[2];
        float t = 0;
        for (float f : wages)
            t = t + f;
        a[0] = t;
        a[1] = t / wages.length;
        return a;
    }

}
