package stringsManipulation.service.impl;

import stringsManipulation.service.StringManipulationService;

import java.util.HashMap;
import java.util.Map;

public class StringManipulationImpl implements StringManipulationService {

    @Override
    public boolean hasOnlyUniqueCharacters(String msg) {
        boolean hasOnlyUniqueCharacters = true;
        Map<Character, Integer> mapChars = new HashMap<>();
        for(int i=0; i < msg.length(); i++){
            if(mapChars.get(msg.charAt(i)) != null){
                hasOnlyUniqueCharacters = false;
                break;
            }
            mapChars.put(msg.charAt(i), 1);
        }
        return hasOnlyUniqueCharacters;
    }

    @Override
    public boolean hasOnlyUniqueCharactersWithoutAdditionalDataStructure(String msg) {
        boolean hasOnlyUniqueCharacters = true;
        for(int i = 0; i < msg.length(); i++){
            for(int j = i+1; j < msg.length(); j++){
                if(msg.charAt(i) == msg.charAt(j)){
                    hasOnlyUniqueCharacters = false;
                    break;
                }
            }
        }
        return hasOnlyUniqueCharacters;
    }
}
