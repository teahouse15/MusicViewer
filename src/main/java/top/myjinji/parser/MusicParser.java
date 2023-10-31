package top.myjinji.parser;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.flac.FlacTag;
import org.jaudiotagger.tag.id3.*;

import java.io.File;

public class MusicParser {

    private Tag tag;

    private AudioFile audioFile;

    public MusicParser(File file) {
        try {
            // 读取MP3文件
            this.audioFile = AudioFileIO.read(file);
            this.tag = audioFile.getTag();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public AudioFile getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(AudioFile audioFile) {
        this.audioFile = audioFile;
    }
}
