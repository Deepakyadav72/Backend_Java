public class Class_object {
    public static void main(String[] args) {
        pen p1 = new pen();

        p1.setcolor("red");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class pen {
    int tip;
    String color;

    void setcolor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}