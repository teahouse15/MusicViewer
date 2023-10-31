package top.myjinji.main;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.flac.FlacTag;
import top.myjinji.parser.MusicParser;
import top.myjinji.utils.TagUtils;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger rootLogger = Logger.getLogger("");
        rootLogger.setLevel(Level.OFF);

        Scanner scanner = new Scanner(System.in);
        File dir = new File("music/");
        File[] files = dir.listFiles();
        for (File file : files) {
            try {
                // 读取音乐文件
                AudioFile audiofile = AudioFileIO.read(file);
                Tag tag = audiofile.getTag();

                if (tag != null) {
                    // 提取元数据信息
                    String title = tag.getFirst(FieldKey.TITLE);
                    String artist = tag.getFirst(FieldKey.ARTIST);
                    String album = tag.getFirst(FieldKey.ALBUM);
                    String year = tag.getFirst(FieldKey.YEAR);

                    // 格式化输出元数据信息
                    System.out.println("文件名: " + file.getName());
                    System.out.println("标题: " + title);
                    System.out.println("艺术家: " + artist);
                    System.out.println("专辑: " + album);
                    System.out.println("年份: " + year);
                    System.out.println();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
