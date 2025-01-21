import java.util.ArrayList;


public class Demo029 {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Deepak");
        friends.add("Uday");
        friends.add("Sathi");
        friends.add("Vardhan");
        friends.add("Chimtu");
        friends.add("Sai");
        friends.add("Aki");
        friends.add("Raj");
        friends.add("Boat");

        System.out.println("Friends List:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}