public class Horse extends Animal {
    public Horse() {
        //super();
        System.out.println("Now I am a Horse!");
    }

    @Override
    public String sleep() {
        return "A horse sleeps...";
    }


    public String eat() {
        return "A horse eats...";
    }

    public String neigh() {
        return "neigh...";
    }
}
