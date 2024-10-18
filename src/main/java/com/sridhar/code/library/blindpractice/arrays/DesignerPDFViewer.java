package com.sridhar.code.library.blindpractice.arrays;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class PDFResult {

    //todo
    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     *
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int ASCII_OFFSET = 97;
        int max = 0;
        for(char ch: word.toCharArray()) {
            max = Math.max(h.get((int) ch -ASCII_OFFSET), max);
        }
        return max*word.length();
    }

}

public class DesignerPDFViewer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String word = bufferedReader.readLine();

        int result = PDFResult.designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
