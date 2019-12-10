package training.softwire;

public class Duck implements Comparable{
    private String name;
    private String type;
    private int weightInGrams;
    private int ageInMonths;

    public Duck(String name, String type, int weightInGrams, int ageInMonths) {
        this.name = name;
        this.type = type;
        this.weightInGrams = weightInGrams;
        this.ageInMonths = ageInMonths;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }


    public static void main(String[] args) {
        Duck quack = new Duck("Sir Quackalot", "Mallard", 100, 17);
    }

    @Override
    public int hashCode() {
        return((name.hashCode() + type.hashCode()) * 31);
    }


    @Override
    public int compareTo(Object o) {
        Duck duck = (Duck) o;
        int lastIndex = (this.getName().length() > duck.getName().length()) ?
                duck.getName().length() - 1 : this.getName().length() - 1;

        char thisChar;
        char otherChar;
        for(int i = 0; i <= lastIndex; i++) {
            thisChar = this.getName().charAt(i);
            otherChar = duck.getName().charAt(i);

            if(thisChar < otherChar) {
                return -1;
            } else if(thisChar > otherChar) {
                return 1;
            }
        }

        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }

        if ((o == this)) {
            return true;
        }

        if(o.getClass() != this.getClass()) {
            return false;
        }

        Duck duck = (Duck)o;
        return (this.getName().equals((duck.getName())) && this.getType().equals(duck.getType()));
    }

    @Override
    public String toString() {
        return "Duck name: " + name + " ; " + "Duck type: " + type + " ; " + "Duck age in month: " + ageInMonths ;
    }
}
