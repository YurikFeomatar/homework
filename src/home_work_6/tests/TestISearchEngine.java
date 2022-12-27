package home_work_6.tests;

import home_work_6.api.IReplacer;
import home_work_6.api.ISearchEngine;
import home_work_6.utils.EasySearch;
import home_work_6.utils.RegExSearch;
import home_work_6.utils.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestISearchEngine {
    @Test
    @DisplayName("проверяем метод EasySearch.search на единичное совпадение и начальное положение")
    public void easySearch1(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText(
                "Эти слова я поместил семь лет назад на обложку предыдущего издания, указав в аннотации:"),"слова"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText(
                "Эти слова я поместил семь лет назад на обложку предыдущего издания, указав в аннотации:"),"Эти"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search на отсутствие заданного слова")
    public void easySearch2(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();
        Assertions.assertEquals(0,searchEngine.search( replacer.replaceText(
                "Эти слова я поместил семь лет назад на обложку предыдущего издания, указав в аннотации:"),"люцифер"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search на наличие знаков препинания")
    public void easySearch3(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет, как дела!"),"привет"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет, как дела!"),"как"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет, как дела!"),"дела"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search на ошибку в тексте")
    public void easySearch4(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет,какдела!"),"привет"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет,какдела!"),"какдела"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search на ошибку в тексте")
    public void easySearch5(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет;какдела!"),"привет"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет;какдела!"),"какдела"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search на знаки препинания в тексте")
    public void easySearch6(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("как дела!.Что делаешь?"),"как"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("как дела!.Что делаешь?"),"дела"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("как дела!.Что делаешь?"),"Что"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("как дела!.Что делаешь?"),"делаешь"));
        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText("как дела!.Что делаешь?"),"делаешь?"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search на тире")
    public void easySearch7(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("Привет-привет"),"Привет-привет"));
        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText("Привет-привет"),"привет"));
        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText("Привет-привет"),"Привет"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search на цифру")
    public void easySearch8(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("4-х"),"4-х"));
        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText("4-х"),"4"));
        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText("4-х"),"х"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search на цифру и букву")
    public void easySearch9(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("один и 1"),"один"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("один и 1"),"и"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("один и 1"),"1"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search на окончания")
    public void easySearch10(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("бабушка бабушке бабушку"),"бабушка"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("бабушка бабушке бабушку"),"бабушке"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("бабушка бабушке бабушку"),"бабушку"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search ")
    public void easySearch11(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(6,searchEngine.search(replacer.replaceText(
                "И бывают разные и И, и и, и й и213 и специИиИииально, вообще много много много и.,.."),"и"));
        Assertions.assertEquals(2,searchEngine.search(replacer.replaceText(
                "И бывают разные и И, и и, и й и213 и специИиИииально, вообще много много много и.,.."),"И"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText(
                "И бывают разные и И, и и, и й и213 и специИиИиИиИиИально, вообще много много много и.,.."),"и И"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText(
                "И бывают разные и И, и и, и й и213 и специИиИиИиИиИально, вообще много много много и.,.."),"И бывают разные и И"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText(
                "И бывают разные и И, и и, и й и213 и специИиИиИиИиИально, вообще много много много и.,.."),"И бывают разные"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search")
    public void easySearch12(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(3,searchEngine.search(replacer.replaceText(
                "быть или не ьыть. бить или не бить, пить или не пить!?!? вот в чем вопрос"),"или"));
        Assertions.assertEquals(2,searchEngine.search(replacer.replaceText(
                "быть или не ьыть. бить или не бить, пить или не пить!?!? вот в чем вопрос"),"пить"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText(
                "быть или не ьыть. бить или не бить, пить или не пить!?!? вот в чем вопрос"),"быть"));
        Assertions.assertEquals(2,searchEngine.search(replacer.replaceText(
                "быть или не ьыть. бить или не бить, пить или не пить!?!? вот в чем вопрос"),"бить"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search на 35 одинаковых слов c закавыкой")
    public void easySearch13(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(35,searchEngine.search(replacer.replaceText(
                "я! я! я! я! я! я! я: я: я я-я я я я я я я я я я ?я я я я я я я я-я я я !я я; я я я я я я "),"я"));
    }
    @Test
    @DisplayName("проверяем метод EasySearch.search ")
    public void easySearch14(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText("Мама мыла раму"),"мыл"));

    }
    @Test
    @DisplayName("проверяем метод EasySearch.search ")
    public void easySearch15(){
        ISearchEngine searchEngine = new EasySearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText("Мама мыла раму"),"мыл"));

    }




    @Test
    @DisplayName("проверяем метод RegExSearch.search на единичное совпадение и начальное положение")
    public void RegExSearch1(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText(
                "Эти слова я поместил семь лет назад на обложку предыдущего издания, указав в аннотации:"),"слова"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText(
                "Эти слова я поместил семь лет назад на обложку предыдущего издания, указав в аннотации:"),"Эти"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search на отсутствие заданного слова")
    public void RegExSearch2(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();
        Assertions.assertEquals(0,searchEngine.search( replacer.replaceText(
                "Эти слова я поместил семь лет назад на обложку предыдущего издания, указав в аннотации:"),"люцифер"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search на наличие знаков препинания")
    public void RegExSearch3(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет, как дела!"),"привет"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет, как дела!"),"как"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет, как дела!"),"дела"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search на ошибку в тексте")
    public void RegExSearch4(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет,какдела!"),"привет"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет,какдела!"),"какдела"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search на ошибку в тексте")
    public void RegExSearch5(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет;какдела!"),"привет"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("привет;какдела!"),"какдела"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search на знаки препинания в тексте")
    public void RegExSearch6(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("как дела!.Что делаешь?"),"как"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("как дела!.Что делаешь?"),"дела"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("как дела!.Что делаешь?"),"Что"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("как дела!.Что делаешь?"),"делаешь"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("как дела!.Что делаешь?"),"делаешь?"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search на тире")
    public void RegExSearch7(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("Привет-привет"),"Привет-привет"));
        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText("Привет-привет"),"привет"));
        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText("Привет-привет"),"Привет"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search на цифру")
    public void RegExSearch8(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("4-х"),"4-х"));
        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText("4-х"),"4"));
        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText("4-х"),"х"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search на цифру и букву")
    public void RegExSearch9(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("один и 1"),"один"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("один и 1"),"и"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("один и 1"),"1"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search на окончания")
    public void RegExSearch10(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("бабушка бабушке бабушку"),"бабушка"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("бабушка бабушке бабушку"),"бабушке"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText("бабушка бабушке бабушку"),"бабушку"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search ")
    public void RegExSearch11(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(5,searchEngine.search(replacer.replaceText(
                "И бывают разные и И, и и, и й и213 и специИиИииально, вообще много много много и.,.."),"и"));
        Assertions.assertEquals(2,searchEngine.search(replacer.replaceText(
                "И бывают разные и И, и и, и й и213 и специИиИииально, вообще много много много и.,.."),"И"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText(
                "И бывают разные и И, и и, и й и213 и специИиИиИиИиИально, вообще много много много и.,.."),"и И"));
        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText(
                "И бывают разные и И, и и, и й и213 и специИиИиИиИиИально, вообще много много много и.,.."),"И бывают разные и И,"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText(
                "И бывают разные и И, и и, и й и213 и специИиИиИиИиИально, вообще много много много и.,.."),"И бывают разные"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search")
    public void RegExSearch12(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(3,searchEngine.search(replacer.replaceText(
                "быть или не ьыть. бить или не бить, пить или не пить!?!? вот в чем вопрос"),"или"));
        Assertions.assertEquals(2,searchEngine.search(replacer.replaceText(
                "быть или не ьыть. бить или не бить, пить или не пить!?!? вот в чем вопрос"),"пить"));
        Assertions.assertEquals(1,searchEngine.search(replacer.replaceText(
                "быть или не ьыть. бить или не бить, пить или не пить!?!? вот в чем вопрос"),"быть"));
        Assertions.assertEquals(2,searchEngine.search(replacer.replaceText(
                "быть или не ьыть. бить или не бить, пить или не пить!?!? вот в чем вопрос"),"бить"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search на 23 одинаковых слов c закавыкой")
    public void RegExSearch13(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(23,searchEngine.search(replacer.replaceText(
                "я! я! я! я! я! я! я: я: я я-я я я я я я я я я я ?я я я я я я я я-я я я !я я; я я я я я я "),"я"));
    }
    @Test
    @DisplayName("проверяем метод RegExSearch.search ")
    public void RegExSearch14(){
        ISearchEngine searchEngine = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();

        Assertions.assertEquals(0,searchEngine.search(replacer.replaceText("Мама мыла раму"),"мыл"));

    }


}
