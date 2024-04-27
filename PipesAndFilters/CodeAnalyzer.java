// Sink.java
// 27th april 2024

// GUIDE to user:
// CodeAnalyzer is a 'sink' class from 'Pipe and Filter' architecture
// which contains a variety of analysis methods
// that receive a code in a form of String and return their analysis as String

import java.io.IOException;

public class CodeAnalyzer {

    private String exceptionMessage = "Given code was 'null' and therefore analysis was impossible.";

    public String calculateCodeCharacters(String code) {
        String copy = code;
        try {
            if (copy == null) {
                throw new IOException(exceptionMessage);
            }
            // calculate amount of chars and return it
            int charCount = copy.length();
            return "CharCount: " + Integer.toString(charCount);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());     
            return "-1";   
        }
    }

    public String calculateCodeSpaces(String code) {
        String copy = code;
        try {
            if (copy == null) {
                throw new IOException(exceptionMessage);
            }
            // calculate amount of spaces and return it. Notice -1, e.g "cat dog" has 1 not 2 spaces
            int spaceCount = copy.split(" ").length - 1;
            return "SpaceCount: " + Integer.toString(spaceCount);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return "-1";
        }
    }
    
    public String calculateCodeWords(String code) {
        String copy = code;
        try {
            if (copy == null) {
                throw new IOException(exceptionMessage);
            }
            // calculate amount of words and return it. e.g "cat   dog" will result to 2
            String[] words = copy.split("\\s+");
            int wordCount = words.length;
            return "WordCount: " + Integer.toString(wordCount);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return "-1";
        }
    }

    public String calculateCodeLines(String code) {
        String copy = code;
        try {
            if (copy == null) {
                throw new IOException(exceptionMessage);
            }
            // calculate amount of lines and return it. e.g "cat \n dog" contains 1x linebreak therefore 1+1 lines
            int linesCount = copy.split("\r\n").length + 1;
            return "LinesCount: " + Integer.toString(linesCount);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return "-1";
        }
    }
    
    public String analyzeCode(String code) {
        String copy = code;
        String answer = "";
        answer += calculateCodeCharacters(copy);
        answer += " " + calculateCodeSpaces(copy);
        answer += " " + calculateCodeLines(copy);
        answer += " " + calculateCodeWords(copy);
        return answer;
    }

}
