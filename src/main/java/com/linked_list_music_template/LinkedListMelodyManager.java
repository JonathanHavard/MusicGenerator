package com.linked_list_music_template;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class LinkedListMelodyManager extends MelodyManager implements Drawable{

   // static FileSystem sys = FileSystem.getDefault();
    static String prependPath = "mid/";// + sys.getSeparator(); -- Windows only due to weird error!! 
    static String appendType = ".mid" ;

    String[] files = {"motive1Am", "motive2Am", "motive3Am", "motive1E", "motive2E", "motive3E"};

    LinkedListMelodyManager(){
    super();
    }

    void setup(){
        for(int i=0; i<files.length; i++){
            addMidiFile(prependPath+files[i]+ appendType);
        }
    }
    int size(){
        return files.length;
    }

    public void draw(){
        playMelodies();
    }
}
