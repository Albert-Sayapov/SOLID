public class Purchase {

    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }

    public void setTitle() {
        this.title = title;
    }

    public void setCount() {
        this.count = count;
    }

    public String getTitle() {
        return this.title;
    }

    public int getCount() {
        return this.count;
    }

}