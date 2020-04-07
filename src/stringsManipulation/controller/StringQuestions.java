package stringsManipulation.controller;

import stringsManipulation.service.StringManipulationService;
import stringsManipulation.service.impl.StringManipulationImpl;

public class StringQuestions {


    private static StringManipulationService stringManipulationService;

    public static void main(String[] args) {
        //Verify if a string has only unique characters.
        stringManipulationService = new StringManipulationImpl();

        System.out.println("abcdee" + " is unique: " + stringManipulationService.hasOnlyUniqueCharacters("abcdee"));
        System.out.println("abcdee" + " is unique: " + stringManipulationService.hasOnlyUniqueCharacters("abcde"));

        System.out.println("abcdee" + " is unique: " + stringManipulationService.
                hasOnlyUniqueCharactersWithoutAdditionalDataStructure("abcdea"));
        System.out.println("abcdee" + " is unique: " + stringManipulationService.
                hasOnlyUniqueCharactersWithoutAdditionalDataStructure("abcde"));

    }
}
