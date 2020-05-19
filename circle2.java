class circle2
{
    double pi,r,ans;
    void init(double PI, double R)
    {
        pi=PI;
        r=R;
    }
    void calc()
    {
        ans=pi*r*r;
    }
    void display()
    {
        System.out.println(ans);
    }
}
    