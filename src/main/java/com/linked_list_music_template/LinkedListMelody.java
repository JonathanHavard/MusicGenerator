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
    public void start(){
        if (head !=null){
            curPlayingNode = head;
            head.start();
        }
    }
    public void play(){
        if(curPlayingNode!= null){
            if (curPlayingNode.atEnd()){
            
                curPlayingNode = curPlayingNode.getNext();
                if (curPlayingNode!=null){
                    curPlayingNode.start();
                }
                //else if it's looping then start()
            }
        }
    }
    public void insertAtEnd(MelodyNode node){ //Inserts a node at the end of the linked list
        if (head == null){
            
            //idk if this works I'll figure it out later
            head = new MelodyNode(node.melodyManager, node.whichMelody);
            return;
        }
        MelodyNode current = head;
        while (current.nextMelodyNode != null){
            current = current.nextMelodyNode;
        }
        current.nextMelodyNode = new MelodyNode(node.melodyManager, node.whichMelody);
    }
    public void stop(){
        curPlayingNode = null;
    }

    //loop -- create a class variable isLooping

}