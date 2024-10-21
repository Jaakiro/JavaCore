package org.example;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupFunction {
    public static void createBackup() throws IOException {
        Path backupDir = Path.of("./backup");

        if (!Files.exists(backupDir)) {
            Files.createDirectories(backupDir);
        }

        try (DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of("."))) {
            for (Path file : dir) {
                if (Files.isDirectory(file)) continue;

                Path backupFilePath = backupDir.resolve(file.getFileName());
                Files.copy(file, backupFilePath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Файл скопирован: " + file.getFileName());
            }
        }
    }
}
