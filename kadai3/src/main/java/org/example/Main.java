package org.example;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer>resultMap = new HashMap<String,Integer>();

        resultMap.put("髙橋",90);
        resultMap.put("中村",80);
        resultMap.put("佐藤",1);

        String maxKey=null;
        int maxValue=0;
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        String minKey=null;
        int minValue=999999999;
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            if (entry.getValue() < minValue) {
                minKey = entry.getKey();
                minValue = entry.getValue();
            }
        }
        
      int magnification;
        try {
            magnification = maxValue/minValue;
                    System.out.println("今回一番高い点数の" +maxKey+"さんは今回一番低い点数の"+minKey+"さんの"+ magnification + "倍の点数でした。");
            } catch(Exception e){
                    System.out.println("エラーがおきました。");
                }
            }

          }









