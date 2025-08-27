class itself
{
    public static void main(String[] args) {
        itself r=new itself();
        int a=r.sum(3);
        System.out.print("sum of first Nnatural: "+a);
    }
    int sum(int b)
    {
        if(b>0)
        {
            return b+sum(b-1);
        }
        else
        {
            return 0;
        }
    }
}