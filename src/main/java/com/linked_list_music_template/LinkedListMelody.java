/*
 * c2024  [your name] using a template by Dr. Courtney Brown
 * Class: LinkedListMelody
 * Description: [you fille in]
 * 
 */


package com.linked_list_music_template;

public class LinkedListMelody implements Drawable {

    //fill in this class
    public void draw()
    {
        //fill this in to play melody
       // play(); TODO: implement play and uncomment
    }
    MelodyNode head;
    MelodyNode curPlayingNode = null;
    public void start(){
        if (head !=null){
            curPlayingNode = head;
            head.start();
        }
    }
    public void play(){
        if(curPlayingNode!= null){
            if (curPlayingNode.atEnd()){
            }
                curPlayingNode = curPlayingNode.getNext();
                if (curPlayingNode!=null){
                    curPlayingNode.start();
                }
        }
    }

    //create insertAtEnd -- just like the foodnode except with melody
}