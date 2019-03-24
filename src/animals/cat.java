package animals;

public class cat {

        private String name;
        private String age;
        private String attitude;
        private String emotion;

//constructor for cat
        public cat (String name, String age, String attitude, String emotion){
            this.name = name;
            this.age = age;
            this.attitude = attitude;
            this.emotion = emotion;

        }

        String meow(String attitude) {
            String meow = " ";
            if (attitude.equalsIgnoreCase("docile")) {
                meow = "mew... mew";
            } else if (attitude.equalsIgnoreCase("stroppy")) {
                meow = "meow... meow";
            }
            else {
                meow = "REEEAAAWWAWAWWWWWWWWW!!!!!";
            }

            return meow;

        }

        String tail(String emotion) {
            String tail = " ";
            if (emotion.equalsIgnoreCase("peaceful")) {
                tail = "tail not wagging";
            } else if (attitude.equalsIgnoreCase("frustrated")) {
                tail = "wag wag wag wag";
            } else {
                tail = "WHOOSH! WHOOSH!";
            }
            return tail;

        }



}
