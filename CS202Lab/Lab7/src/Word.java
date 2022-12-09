public class Word implements Measureable{
    String word;
    public Word(String y){
        word = y;
    }
    public static void main(String[] args){
        Word x = new Word("Amazing");
        Number y = new Number(71);

        System.out.println(x.getSize());
        System.out.println(y.getSize());
    }
    public int getSize(){
        return word.length();
    }
}
/*
 * Create a class called Word with a String member var called word
Give Word a main (empty for now)
Create a class called Number with a int member var called num
Create an interface called Measureable with one method: getSize with an int return value and no parameters
Make both Word and Number use the Measureable interface. Word's getSize method should return the length of its String, and Number's getSize method should return its int member var
In main, create a Word object with a word: Amazing
Create a Number object with a num: 71
Output what getSize returns for the Word
Output what getSize returns for the Number
 */