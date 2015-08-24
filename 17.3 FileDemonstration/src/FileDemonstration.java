/**
 * Fig. 17.3: FileDemonstration
 * File class used to obtain file and directory information.
 **/
import java.io.File;
import java.util.Scanner;

public class FileDemonstration
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file or directory name: ");
        analyzePath(input.nextLine());
    }   //  end main

    //  display information about file user specifies
    public static void analyzePath(String path)
    {
        //  create File object based on user input
        File name = new File(path);

        if (name.exists())  //  if name exists, output information about it
        {
            //  display file (or directory) information
            System.out.printf(
                    "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                    name.getName(), " exists",
                    (name.isFile() ? "is a file" : "is not a file"),
                    (name.isDirectory() ? "is a directory" : "is not a directory"),
                    (name.isAbsolute() ? "is absolute path" : "is not absolute path"),
                    "Last modified: ",
                    name.lastModified(), "Length: ", name.length(),
                    "Path: ", name.getPath(), "Absolute path: ",
                    name.getAbsolutePath(), "Parent: ", name.getParent());

            if (name.isDirectory()) // output directory listing
            {
                String[] directory = name.list();
                System.out.println("\n\nDirectory contents:\n");

                for (String directoryName : directory)
                    System.out.println(directoryName);
            }   //  end if
        }
        else // not file or directory, output error message
        {
            System.out.printf("%s %s", path, "does not exist.");
        }   //  end else
    }   //  end method analyzePath
}   //  end class FileDemonstration
