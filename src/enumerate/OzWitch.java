package enumerate;

public enum OzWitch {

    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby Slippers, crushed by Dorothy’s house"),
    SOUTH("Good by inference, but missing");

    private String description;

    public String getDescription() {
        return description;
    }

    private OzWitch(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        for (OzWitch ozWitch : OzWitch.values()) {
            System.out.println(ozWitch + ": " + ozWitch.getDescription());
        }
    }
}
