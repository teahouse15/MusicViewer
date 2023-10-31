package top.myjinji.utils;

import top.myjinji.Define;

import java.io.File;

public class FormatUtil {

    /**
     * check music type.
     * @param fileName
     * @return
     */
    public static boolean isSupport(String fileName) {
        String[] suffixList = new String[]{".mp3", ".m4a", ".flac"};
        for (String suffix : suffixList) {
            if (fileName.endsWith(suffix)) return true;
        }
        return false;
    }

    public static boolean isFlac(String fileName) {
        return fileName.endsWith(Define.FORMAT_FLAC);
    }

    public static boolean isMP3(String fileName) {
        return fileName.endsWith(Define.FORMAT_MP3);
    }

    public static boolean isM4A(String fileName) {
        return fileName.endsWith(Define.FORMAT_M4A);
    }
}
