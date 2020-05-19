class average
{
    int sub1, sub2, sub3;
    double ans;
    void init(int math, int hindi, int english)
    {
        sub1=math;
        sub2=hindi;
        sub3=english;
    }
    void calc()
    {
        ans=(sub1 + sub2 + sub3)/3;
    }
    void display()
    {
        System.out.println(ans);
    }
}