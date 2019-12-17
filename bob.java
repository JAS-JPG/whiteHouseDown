
 class vector
{
  int x,y,z;
  vector add(vector a)
  {
      vector obj=new vector();
      obj.x=a.x+x;
      obj.y=a.y+y;
      obj.z=a.z+z;
      return obj;
    }
}
 public class bob
{
    public static void main()
    {
        vector a = new vector();
        vector b = new vector();
        vector c = new vector();
        a.x=10;a.y=10;a.z=10;
        b.x=10;b.y=10;b.z=10;
        c=a.add(b);
        System.out.println(c);
    }
}
