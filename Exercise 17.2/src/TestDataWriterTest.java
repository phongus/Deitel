/**
 * Created by P Trang on 9/6/2015.
 */
public class TestDataWriterTest
{
    public static void main(String[] args)
    {
        TestDataWriter testDataWriter = new TestDataWriter();
        testDataWriter.openFile();
        testDataWriter.writeOldMaster();
        testDataWriter.writeTrans();
    }

}
