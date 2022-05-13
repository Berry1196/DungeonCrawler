package encounter;

public class StoryProgressor implements Encounter {
    
    private String msg;

    public StoryProgressor(String msg) {
        this.msg = msg;
    }

    @Override
    public void resolve() {
        System.out.println(msg);
    }
}
