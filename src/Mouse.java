public class Mouse extends Animal{
    public Mouse() {
        //super();
        System.out.println("Now I am a mouse!");
    }

    @Override
    public String sleep() {
        return "A mouse sleeps...";
    }


    public String eat() {
        return "A mouse eats...";
    }

    public String skweak() {
        return "skweak...";
    }
}
