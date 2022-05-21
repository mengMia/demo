package com.tutorialspoint;

public class TextEditor {
    public SpellChecker spellChecker1;
    public String name;

    public void setSpellChecker(SpellChecker spellChecker){
        this.spellChecker1 = spellChecker;
    }
    public SpellChecker getSpellChecker(){
        return spellChecker1;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void spellCheck(){
        spellChecker1.checkSpelling();
    }
}
