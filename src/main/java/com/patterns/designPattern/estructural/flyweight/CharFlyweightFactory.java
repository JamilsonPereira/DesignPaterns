package com.patterns.designPattern.estructural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharFlyweightFactory {
    private Map<String , CharFlyweight> flyweightMap = new HashMap<>();

    public CharFlyweight getCharFlyweight(char caracter, String font, Integer size, String color){
        String  key = caracter + "_" + font + "_" + size + "_" + color;
        if(!flyweightMap.containsKey(key)){
            flyweightMap.put(key, new CharFlyweight(caracter, font, size, color));
        }
        return flyweightMap.get(key);
    }
    public int getFlyWeightCount(){
        return flyweightMap.size();
    }
}
