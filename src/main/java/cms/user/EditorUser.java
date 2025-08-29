package cms.user;
public class EditorUser extends User {
    public EditorUser(int id, String nome, String email, String password) {
        super(id, nome, email, password);
    }

    public void editContent(int contentId, String body) {
        System.out.println("Editor editando conteúdo com ID: " + contentId + " com novo conteúdo: " + body);
    }
}
