public class Math {
    private int no;
    private String name;
    public void setNo(int no)
    {
        this.no = no;
    }
    public int getNo() {
        return no;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void mathtop()
    {
        System.out.println("hello");
        System.out.println("no = "+no+"name = "+name);
    }
}
