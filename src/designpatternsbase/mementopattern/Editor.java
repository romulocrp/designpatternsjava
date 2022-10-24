package designpatternsbase.mementopattern;

public class Editor {
    /*private String oldContent;
    private String newContent;

    public String getContent() {
        return newContent;
    }

    public void setContent(String content) {
        oldContent = newContent;
        newContent = content;
    }

    public void undo() {
        newContent = oldContent;
    }
    ****** MY SOLUTION ********** */
    // Memento implementation!
    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
