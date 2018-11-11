public class PackageInfo {
    String packageName;
    int ca; //the number of classes inside of component
    int ce; // the number of classes outside of component

    public double getInstability() {
        return ce/(ca+ce);
    }

    int na; //the number of abstract classes
    int nc; //the number of all classes

    public double getAbstractness() {
        return na/nc;
    }

    public double getNormalizedDistance() {
        return Math.abstract(getAbstractness() + getInstability() - 1);
    }

    public double getDistance() {
        return getNormalizedDistance() / Math.sqrt(2);
    }

}
