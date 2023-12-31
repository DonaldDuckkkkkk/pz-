package passes;

public class MetroPass {
    private static int idHolder;
    private final int uid;

    public MetroPass() {
        this.uid = idHolder++;
    }

    public int getUid() {
        return uid;
    }

    @Override
    public String toString() {
        return "passes.MetroPass{" +
                "uid=" + uid +
                '}';
    }
}
