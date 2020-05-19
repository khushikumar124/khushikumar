class average2
{
    int math,eng,hin;
    double ans;
    void init()
    {
        math=100;
        eng=98;
        hin=96;
    }
    void calc()
    {
        ans=(math+eng+hin)/3;
    }
    void display()
    {
        System.out.println(ans);
    }
}
        