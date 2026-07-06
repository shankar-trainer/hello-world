public class Speech {
    private int speechId;
    private String  speechTopic;
    private String  speechLocation;

    public Speech(int speechId, String speechTopic, String speechLocation) {
        this.speechId = speechId;
        this.speechTopic = speechTopic;
        this.speechLocation = speechLocation;
    }

    public int getSpeechId() {
        return speechId;
    }

    public String getSpeechTopic() {
        return speechTopic;
    }

    public String getSpeechLocation() {
        return speechLocation;
    }
}
