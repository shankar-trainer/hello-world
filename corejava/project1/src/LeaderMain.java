public class LeaderMain {
    public static void main(String[] args) {
        Leader leader1=new Leader(100010,"gopal kumar",56, new Speech(1,"corruption","noida"));

        System.out.println("leader information");

        System.out.println("\t id :"+leader1.getId());
        System.out.println("\t name :"+leader1.getName());
        System.out.println("\t age :"+leader1.getAge());

        System.out.println("\n  leader speech :");
        System.out.println("\t id :"+leader1.getSpeech().getSpeechId());
        Speech speech = leader1.getSpeech();

        System.out.println("\t id :"+speech.getSpeechId());
        System.out.println("\t topic :"+speech.getSpeechTopic());
        System.out.println("\t location :"+speech.getSpeechLocation());

    }
}
