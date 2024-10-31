package com.linked_list_music_template;

public class MelodyNode {
//ClassDef------------------------------------------------------------------------------------------------|
        MelodyNode nextMelodyNode; //the next melody node
        MelodyManager melodyManager; //the melody manager with all the melody files and midi
        int whichMelody; //index into the melody manager
        MelodyNode(MelodyManager melodyManager_, int which_){
            melodyManager = melodyManager_;
            whichMelody = which_;
        }

//Functions-----------------------------------------------------------------------------------------------|
        // public MelodyNode getMelodyNode(){
        //     return MelodyNode;
        // }
        // public void setMelodyNode(){
        //     this.MelodyNode = MelodyNode;
        // }
        void start(){
            melodyManager.start(whichMelody);
        }
        public MelodyNode copy(){
            return new MelodyNode(melodyManager,whichMelody);
        }
        public int getMelodyIndex(){
            return whichMelody;
        }
        public MelodyNode getNext(){
            return nextMelodyNode;
        }

        public boolean atEnd(){
            return melodyManager.atEnd(whichMelody);
        }
    }