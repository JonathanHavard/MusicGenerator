package com.linked_list_music_template;

import processing.core.PApplet;

//Superclass for all Buttons
public abstract class MelodyButton extends Button{

    LinkedListMelody melody;
 MelodyButton(PApplet main_, LinkedListMelody melody_, String label_,float x_, float y_)
    {
        super(main_, label_, x_, y_); 
        melody = melody_;
    }

}
//Play Button
class PlayButton extends MelodyButton{
    PlayButton(PApplet main_, LinkedListMelody melody_,float x_, float y_){
        super(main_, melody_, "Play", x_, y_);
    }

    public void onPress(){
        melody.start();
    }
}
//Loop button
class LoopButton extends MelodyButton{
    LoopButton(PApplet main_, LinkedListMelody melody_,float x_, float y_){
        super(main_, melody_, "Loop", x_, y_);
    }

    public void onPress(){
        melody.setLooping(true);

    }
}
//Stop button
class StopButton extends MelodyButton{
    StopButton(PApplet main_, LinkedListMelody melody_,float x_, float y_){
        super(main_, melody_, "Stop", x_, y_);
    }
    public void onPress(){
        melody.stop();
    }
}

class WeaveButton extends MelodyButton{
    WeaveButton(PApplet main_, LinkedListMelody melody_,float x_, float y_){
        super(main_, melody_, "Weave", x_, y_);
    }
    public void onPress(){
        melody.weave(null, 3, 3);
    }
}
//Restart button
// class ReverseButton extends MelodyButton{
//     ReverseButton(PApplet main_, LinkedListMelody melody_,float x_, float y_){
//         super(main_, melody_, "Reverse", x_, y_);
//     }
//     public void onPress(){
//         melody.reverse();
//     }
// }
