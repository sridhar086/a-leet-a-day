package com.sridhar.code.library.medium.trie;

import java.util.ArrayList;
import java.util.List;


public class SearchSuggestionSystems {

    Tries.TrieNode Root, curr;
    List<String> resultBuffer;

    void dfsWithPrefix(Tries.TrieNode curr, String word) {
        if (resultBuffer.size() == 3)
            return;
        if (curr.isEndOfWord)
            resultBuffer.add(word);

        // Run DFS on all possible paths.
        for (char c = 'a'; c <= 'z'; c++)
            if (curr.children[c - 'a'] != null)
                dfsWithPrefix(curr.children[c - 'a'], word + c);
    }

    List<String> getWordsStartingWith(String prefix) {
        curr = Root;
        resultBuffer = new ArrayList<String>();
        // Move curr to the end of prefix in its trie representation.
        for (char c : prefix.toCharArray()) {
            if (curr.children[c - 'a'] == null)
                return resultBuffer;
            curr = curr.children[c - 'a'];
        }
        dfsWithPrefix(curr, prefix);
        return resultBuffer;
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Tries.TrieNode root = new Tries.TrieNode();

        for(String product: products) {
            Tries.insert(root, product);
        }
        List<List<String>> result = new ArrayList<>();

        String prefix = "";
        for (char c : searchWord.toCharArray()) {
            prefix += c;
            result.add(this.getWordsStartingWith(prefix));
        }
        return result;
    }
}
