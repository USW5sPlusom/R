package algo.r;

public class Algoritm {

    //Поля класса
    private long id;
    private String name;
    private String category;
    private String content;
    private String codeExample;

    //Конструктор класса - его создание
    public Algoritm(long id, String name, String category, String content, String codeExample){
        this.id = id;
        this.name = name;
        this.category = category;
        this.content = content;
        this.codeExample = codeExample;
    }

    //Геттеры
    //передавать аргумент не нужно
    public long getId(){
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

    //Сеттеры
    public void setId(long id){
        this.id = id;
    }
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


    //Вывод минимальной информации
    public static String tooString(String id, String name){
        return id + " " + name;
    }

}
