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
       play();
    }
    MelodyNode head;
    MelodyNode curPlayingNode = null;
    boolean looping = false;

    public void start(){
        if (head !=null){
            curPlayingNode = head;
            head.start();
        }
    }
    void setLooping(boolean set){
        looping = set;
    }

    public void play(){
        if(curPlayingNode!= null){
            if (curPlayingNode.atEnd()){
                curPlayingNode = curPlayingNode.getNext();
                if (curPlayingNode!=null){
                    curPlayingNode.start();
                }
                if(looping==true){
                    start();//needs to be debugged
                }
            }
        }
    }
    public void insertAtEnd(MelodyNode node){ //Inserts a node at the end of the linked list
        if (head == null){
            
            head = node;
            
            return;
        }
        MelodyNode current = head;
        while (current.nextMelodyNode != null){
            current = current.nextMelodyNode;
        }
        current.nextMelodyNode = node;
    }
    public void stop(){
        curPlayingNode = null;
    }
    public void pause(){
        for (int i=0; i<head.getMelodyIndex(); i++){
            

        }
    }
    public void weave(MelodyNode node,int count, int skip){
        int currSkip = 0;
        int currCount = 0;
        MelodyNode currNode = head;
        while (currCount< count & currNode!= null){
            if (currSkip == skip){
                currSkip = 0;
                currCount++;
                insertAtEnd(currNode);
            }
            head = head.getNext();
        }
    }                

}