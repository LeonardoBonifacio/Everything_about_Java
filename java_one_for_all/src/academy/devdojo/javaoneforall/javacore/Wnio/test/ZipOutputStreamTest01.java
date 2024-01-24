package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path zipFile = Paths.get("folder/file.zip");
        Path sourceFile = Paths.get("folder\\subfolder1\\subsbufolder1");
        zip(zipFile, sourceFile);

    }

    private static void zip(Path zipFile, Path sourceFile) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(zipFile));
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceFile)) {
                    for (Path file : directoryStream) {
                        ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());// preparing the entry of the file
                        zipStream.putNextEntry(zipEntry);// put the entry in this zipStream
                        Files.copy(file, zipStream);// copy the data into the zipStream
                        zipStream.closeEntry();// closing the zipSTream
                    }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
