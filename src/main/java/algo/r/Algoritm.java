package algo.r;

import java.util.UUID;

public class Algoritm {

    //Поля класса
    private String id;
    private String name;
    private String category;
    private String content;
    private String codeExample;
    private String tag;

    //Пустой конструктор для spring
    public Algoritm() {

    }

    //Конструктор класса - его создание
    public Algoritm(String name, String category, String content, String codeExample, String tag){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.category = category;
        this.content = content;
        this.codeExample = codeExample;
        this.tag = tag;
    }

    //Геттеры
    //передавать аргумент не нужно
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public String getContent(){
        return content;
    }
    public String getCodeExample(){
        return codeExample;
    }
    public String getTag(){
        return tag;
    }

    //Сеттеры
    public void setId(String id){ this.id = id; }
    public void setName(String name){
        this.name = name;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setContent(String content){
        this.content = content;
    }
    public void setCodeExample(String codeExample){
        this.codeExample = codeExample;
    }
    public void setTag(String tag){
        this.tag = tag;
    }


    //
    public String ToString(long id,  String name, String category, String content, String codeExample){
        return "Algorithm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + content + '\'' +
                ", codeExample:" + codeExample +
                ", tag: " + tag +
                '}';
    }

    //Вывод минимальной информации
    public String minToString(String id, String name){
        return tag + " " + name;
    }

}
