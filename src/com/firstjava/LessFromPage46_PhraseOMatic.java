package com.firstjava;

public class LessFromPage46_PhraseOMatic {
    public static void main(String[] args) {
        String[] worldListOne = {"круглосуточный", "трехзвездный", "стометровый", "взаимный", "обоюдный",
                "технологичный", "понижающий", "умный", "6-ти знаков", "критический", "путеводный", "динамичный"};
        String[] worldListTwo = {"уполномоченный", "легкий", "чисткровный", "ориентированный", "центральный",
                "распределённый", "кластерированный", "фирменный", "нестандартномыслящий", "позиционирований", "сетевой",
                "сфокусированный", "использованный с выгодой", "выровненый", "нацеленный на всех", "совместный", "ускоренный"};
        String[] worldListThree = {"процесс", "маркетинговый ход", "выход из положения", "тип структуры", "талант", "подход",
                "уровень взаимного внимания", "портал", "период времени", "обзор", "образец следования"};

        // вычисляем, сколько слов в каждом списке
        int oneLength = worldListOne.length;
        int twoLength = worldListTwo.length;
        int threeLength = worldListThree.length;

        for (int w = 0; w < 10; w++) {

        // Генерируем случайные числа
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // строим фразу
        String phrase = worldListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListThree[rand3];
            System.out.println("Все, что Вам нужно, - это " + phrase);

        }
    }
}