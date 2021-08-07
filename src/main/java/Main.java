import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InterruptedException {

        Database database = new Database();
        String filename = "dfs";
        database.download("/Root/testPhantomFile2.txt", "testPhantomFile2.txt");
        database.upload(filename);
        database.upload("testfile.txt");
        database.upload("testfile2.txt");
        database.upload("gradle-0.7-bin.zip");
        database.upload("webdav-servlet-upstream-r104.zip");
        database.upload("megatools.exe");
        System.out.println(Arrays.asList(database.getRemoteFileNames()));
//        database.remove("/Root/megatools.exe");
        System.out.println(Arrays.asList(database.getRemoteFileNames()));

    }

}
