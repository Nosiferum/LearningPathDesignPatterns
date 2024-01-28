package Composite;

import java.util.List;

public class Messenger {
    public LetterComposite messageFromDogukan() {
        var words = List.of(
                new Word('O', 'i'),
                new Word('m', '8'),
                new Word('t', 'h', 'i', 's'),
                new Word('i', 's'),
                new Word('a'),
                new Word('t', 'e', 's', 't')
        );
        return new Sentence(words);
    }

    public LetterComposite messageFromSomeone() {
        var words = List.of(
                new Word('M', 'u', 'c', 'h'),
                new Word('d', 'o', 'g', 'e'),
                new Word('s', 'u', 'c', 'h'),
                new Word('g', 'a', 'i', 'n', 'z')
        );
        return new Sentence(words);
    }
}
