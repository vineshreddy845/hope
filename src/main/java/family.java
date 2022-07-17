public class family {

    private Math math;

    public void setMath(Math math)
    {
        this.math=math;
        System.out.println("math class object is created");
    }
    public Math getMath()
    {
        return math;
    }

    public void sur(){
        math.mathtop();
        //System.out.println("no = "+math.no+"name = "+math.name);
    }

}
