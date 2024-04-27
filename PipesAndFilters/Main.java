// 27th april 2024
// Main.java

// GUIDE to user:
// Here i will use Filter and Sink class
// to make a variety of filterings and analysis
// of a example cpp file, which in this case is
// 'Data/LenghtyTask.cpp'

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static String loadFileContent(String filePath) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            return content;
        }
        catch (IOException e) {
            System.out.println("Unable to read given filePath!\n" + e.getMessage());
            return "-1";
        } 
    }

    public static void main(String[] args) {
        // initialize the codeAnalyzer class that allows analyzing code
        // also initialize the Filter class that allows filtering code
        CodeAnalyzer codeAnalyzer = new CodeAnalyzer();
        Filter filter = new Filter();

        // load file content into an 'oc' aka original content String
        String oc = loadFileContent("Data/LenghtyTask.cpp");

        // analyze the original fileContent
        System.out.println("OriginalCode: " + codeAnalyzer.analyzeCode(oc));

        // test different kind of filters as individuals
        String codeWithoutEmptyLines = filter.emptyLines(oc);
        String codeWithoutEndLineSpaces = filter.endLineSpaces(oc);
        String codeWithoutConsecutiveSpaces = filter.consecutiveSpaces(oc);
        String codeWithoutSingleSpaces = filter.singleSpaces(oc);
        String codeWithoutCommentLines = filter.commentLines(oc);
        String codeWithoutCommentBlocks = filter.commentBlocks(oc);

        System.out.println("WithoutEmptyLines: " + codeAnalyzer.analyzeCode(codeWithoutEmptyLines));
        System.out.println("WithoutEndLineSpaces: " + codeAnalyzer.analyzeCode(codeWithoutEndLineSpaces));
        System.out.println("WithoutConsecutiveSpaces: " + codeAnalyzer.analyzeCode(codeWithoutConsecutiveSpaces));
        System.out.println("WithoutSingleSpaces: " + codeAnalyzer.analyzeCode(codeWithoutSingleSpaces));
        System.out.println("WithoutCommentLines: " + codeAnalyzer.analyzeCode(codeWithoutCommentLines));
        System.out.println("WithoutCommentBlocks: " + codeAnalyzer.analyzeCode(codeWithoutCommentBlocks));

        // test using all filters at the same time
        // init 'fc' aka 'finalCode', then run it through all filters before analysis
        String fc = oc;

        fc = filter.emptyLines(fc);
        fc = filter.endLineSpaces(fc);
        fc = filter.consecutiveSpaces(fc);
        fc = filter.singleSpaces(fc);
        fc = filter.commentLines(fc);
        fc = filter.commentBlocks(fc);

        System.out.println("After all Filters: " + codeAnalyzer.analyzeCode(fc));
    }
}
