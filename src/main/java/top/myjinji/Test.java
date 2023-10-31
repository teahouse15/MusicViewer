package top.myjinji;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.flac.FlacTag;
import top.myjinji.parser.MusicParser;
import top.myjinji.utils.FormatUtil;
import top.myjinji.utils.TagUtils;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            AudioFile audiofile = new AudioFileIO().readFile(new File("music/倒带-周杰伦.m4a"));


            Tag tag = audiofile.getTag();
            System.out.println(tag.getClass());


        } catch (CannotReadException e) {
            e.printStackTrace();
        } catch (TagException e) {
            e.printStackTrace();
        } catch (InvalidAudioFrameException e) {
            e.printStackTrace();
        } catch (ReadOnlyFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
