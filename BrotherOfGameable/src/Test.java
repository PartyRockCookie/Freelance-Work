/**
 * Created by Willie on 4/12/2015.
 */
public class Test {

    public static int[] make(int n)
    {
        int[] a = new int[n];

        for(int i = 0;i<n;i++)
        {
            a[i] = i+1;
        }
        return a;
    }

    public static void dub (int[] jub)
    {
        for(int i = 0;i<jub.length;i++)
        {
            jub[i] *= 2;
        }
    }

    public static int mus (int[] zoo)
    {
        int fus = 0;
        for(int i = 0;i<zoo.length;i++)
        {
            fus = fus + zoo[i];
        }
        return fus;
    }

    public static void main(String[] args)
    {
        int[] bob = make(5);
        dub(bob);
        System.out.println(mus(bob));
    }
}
