// Filter.java
// 27th april 2024

// GUIDE to user:
// Filter is a class that has methods to
// receive a string, filter it in a variety of ways,
// and then return it forward
// allowing a pipeline of filters.

public class Filter {

    // removes lines that contain only spaces
    public String emptyLines(String fileContent) {
        // if there is found \n + spaces + \n that means empty line, replace with \n
        String newContent = fileContent.replaceAll("(\\r?\\n)(\\s*)\\1", "$1");
        return newContent;
    }

    // removes spaces from end of lines
    public String endLineSpaces(String fileContent) {
        String newContent = fileContent.replaceAll("([a-zA-Z0-9])(\\s+)(\\r\\n)", "$1$3");
        return newContent;
    }

    // replaces multiple spaces with one
    public String consecutiveSpaces(String fileContent) {
        String newContent = fileContent.replaceAll("\\s+", " ");
        return newContent;
    }

    // removes single spaces
    public String singleSpaces(String fileContent) {
        String newContent = fileContent.replaceAll("\\s+", "");
        return newContent;
    }

    // removes commentLines
    public String commentLines(String fileContent) {
        String newContent = fileContent.replaceAll("(\\r?\\n)(//)(.*)\\1", "$1");
        return newContent;
    }

    // removes commentBlocks
    public String commentBlocks(String fileContent) {
        String newContent = fileContent.replaceAll("(?s)(/\\*)(.*?)(\\*/)", "");
        return newContent;
    }

}
