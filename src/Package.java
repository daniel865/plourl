public class Package {

    private final Integer id;
    private final Float height;
    private final Float width;
    private final Float depth;
    private final String content;
    private final String recomendations;

    public Package(Integer id, Float height, Float width, Float depth, String content, String recomendations) {
        this.id = id;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.content = content;
        this.recomendations = recomendations;
    }

    public Integer getId() {
        return id;
    }

    public Float getHeight() {
        return height;
    }

    public Float getWidth() {
        return width;
    }

    public Float getDepth() {
        return depth;
    }

    public String getContent() {
        return content;
    }

    public String getRecomendations() {
        return recomendations;
    }
}
