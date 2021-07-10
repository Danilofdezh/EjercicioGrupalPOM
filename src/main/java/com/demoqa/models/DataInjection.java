package com.demoqa.models;

        import com.github.javafaker.Faker;

        import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private  String path, filename,filepath,fake;


    public String getFake(){
        return fake;
    }
    public String getPath() {
        return path;
    }
    public String getFilename() {
        return filename;
    }
    public String getFilepath() { return filepath; }

    public DataInjection(){
        this.filepath = "C:\\Users\\LENOVO\\IdeaProjects\\";
        this.filename = "Danilo.jpg";
        this.path = (filepath+filename);



    }

}
