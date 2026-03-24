package Day6.General;

public class employee {
    protected int empid;
    private String ename;
    protected double basic;

    public employee(int empid, String ename, double basic){
        this.empid=empid;
        this.ename=ename;
        this.basic=basic;
    }

    public double earnings(){
        double DA = 0.8*basic;
        double HRA = 0.15*basic;
        return basic+DA+HRA;
    }
}
