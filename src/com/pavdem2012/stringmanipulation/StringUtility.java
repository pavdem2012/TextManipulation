package com.pavdem2012.stringmanipulation;

public class StringUtility {
    //программа должна порезать текст на слова, а слова на символы.
    public static void main(String[] args) {
        // Строка для экспериментов
        String source = "Hello Wonderful World!";
        // Преобразуем строку str в массив символов (char)
        char[] strToArray = source.toCharArray();{ 
        // Вывод массива на экран
        for(int i = 0; i < strToArray.length; i++) {
        // Для наглядности вставим пробел между индексами
        System.out.print(strToArray[i] + "  ");
        }
        }
        //Преобразуем строку str в массив слов 
        String[] words = source.split(" ");
        // Выводим количество слов с строке
        System.out.println("\n" + words.length);
        // Выводим слова по отдельности
        for(int i = 0; i < words.length; i++) {
        System.out.println(words[i]);
        // Выводим количество букв каждого слова
        char[] letters = words[i].toCharArray();
        System.out.println(letters.length);
        }
    }
}
