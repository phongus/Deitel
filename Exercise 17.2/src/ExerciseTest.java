/**
 * Created by P Trang on 8/25/2015.
 */
public class ExerciseTest
{
    public static void main(String[] args)
    {
        FileMatch fileMatch = new FileMatch();
        fileMatch.openOldMaster();
        fileMatch.openTrans();
        fileMatch.processTrans();
        fileMatch.outputNewMaster();
    }
}
