public class Bogie {
    String id;
    String type;
    int capacity;

    public Bogie(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return id + " - " + type + " (" + capacity + ")";
    }

    // Handle uniqueness for HashSet/LinkedHashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bogie)) return false;
        Bogie b = (Bogie) o;
        return this.id.equals(b.id);  // equality based on ID only
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
