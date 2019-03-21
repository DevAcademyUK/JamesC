//finish dog and make cat

package animals;

public class dog {

    private String name;
    private String age;
    private String size;
    private String weight;


    public dog (String name, String size, String age, String weight){
        this.name = name;
        this.age = age;
        this.size = size;
        this.weight = weight;



    }

    String bark(String size) {
        String bark = " ";
        if (size.equalsIgnoreCase("small")) {
            bark = "yap yap yap";
        } else if (size.equalsIgnoreCase("medium")) {
            bark = "bork bork";
        }
        else {
            bark = "WOOF! WOOF!";
        }

            return bark;

    }


    String wag(String size) {
        String wag = " ";
        if (size.equalsIgnoreCase("small")) {
            wag = "wiggle wiggle wiggle";
        } else if (size.equalsIgnoreCase("medium")) {
            wag = "Wag Wag Wag";
        }
        else {
            wag = "WHOOSH! WHOOSH!";
        }
        return wag;

    }
    String move(String weight) {
        String move = " ";
        if (weight.equalsIgnoreCase("light")) {
            move = "slowly walking";
        } else if (weight.equalsIgnoreCase("middle")) {
            move = "strolling at an average pace";
        }
        else {
            move = "quickly running";
        }
        return move;

    }
}


