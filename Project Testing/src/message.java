
public class message {

    private user sender;

    private user reciever;

    private String content;

    public void Setcontent(String content) {
        this.content = content;
    }

    String getcontent() {
        return content;
    }

    public user recieve_content(user u) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
