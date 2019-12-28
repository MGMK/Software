
public class post {

    private String content;

    private String Type;

    private user user;

    public void Setcontent(String content) {
        this.content = content;
    }

    String getcontent() {
        return content;
    }

    public void SetType(String Type) {
        this.Type = Type;
    }

    String getType() {
        return Type;
    }

    public user write_post(user u) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void create_request() {
    }

    public void Get_confirm() {
    }
}
