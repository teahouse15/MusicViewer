package top.myjinji.utils;

import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.flac.FlacTag;
import org.jaudiotagger.tag.id3.*;
import top.myjinji.TagList;

import java.util.HashMap;
import java.util.Map;


public class TagUtils {

    private static Map<Class<? extends Tag>, TagList> tagVersionMap = new HashMap<>();

    static {
        tagVersionMap.put(ID3v1Tag.class, TagList.TAG_ID3V1);
        tagVersionMap.put(ID3v11Tag.class, TagList.TAG_ID3V11);
        tagVersionMap.put(ID3v22Tag.class, TagList.TAG_ID3V22);
        tagVersionMap.put(ID3v23Tag.class, TagList.TAG_ID3V23);
        tagVersionMap.put(ID3v24Tag.class, TagList.TAG_ID3V24);
        tagVersionMap.put(FlacTag.class, TagList.TAG_ID3V24);
    }

    public static Class<? extends Tag> getTagVersion(Tag tag) {
//        return tagVersionMap.getOrDefault(tag.getClass(), TagList.TAG_Other);
        return tag.getClass();
    }
}
