public class SampleObjectClass {

    int num;
    String description;

    public SampleObjectClass(int num, String description) {
        this.num = num;
        this.description = description;
    }

    @Override
    public String toString() {
        return "[num=" + num + ", description=" + description + "]";
    }  
}
