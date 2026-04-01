interface ChatService {
    void chat();
}

interface StoryService {
    void postStory();
}

class Instagram implements ChatService, StoryService {

    @Override
    public void chat() {
        System.out.println("Instagram chat");
    }

    @Override
    public void postStory() {
        System.out.println("Instagram story");
    }
}

class WhatsApp implements ChatService {

    @Override
    public void chat() {
        System.out.println("WhatsApp chat");
    }
}