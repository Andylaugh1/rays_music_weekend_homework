import Interfaces.IPlay;

import java.util.ArrayList;

public class Guitar extends Instrument implements IPlay {

    private GuitarString strings;
    private Fretboard fretboard;

    public Guitar(String make, String model, double buyingPrice, double sellingPrice, GuitarString strings, Fretboard fretboard) {
        super(make, model, buyingPrice, sellingPrice);
        this.strings = strings;
        this.fretboard = fretboard;
    }

    public Accessory getStrings() {
        return strings;
    }

    public Fretboard getFretboard() {
        return fretboard;

    }

    public void changeFretboard(Fretboard newFretboard) {
        this.fretboard = newFretboard;
    }

    public void changeStrings(GuitarString newGuitarString) {
        this.strings = newGuitarString;
    }

    public String Play(){
        return "Now playing: Kerrrrraaannnnnggg";
    }

}