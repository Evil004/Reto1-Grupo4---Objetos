package FileAccess.CSV.CSVWritters;


import java.io.File;

public class QuoteGroupWritter extends CSVWritter {

    public QuoteGroupWritter(File file) {
        super(file);
    }

    public QuoteGroupWritter(String path){
        super(path);
    }
    @Override
    public Object writeData() {
        return null;
    }
}
